package com.simple.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.BoardVO;
import com.simple.command.ScoreVO;
import com.simple.service.BoardService;

@Controller
@RequestMapping("/service")
public class BoardServiceController {
	
	@Autowired
	@Qualifier("boardService")
	BoardService boardService;
	
	// 화면처리
	@RequestMapping("/boardRegister")
	public void boardRegister() {
		
	}
	
	@RequestMapping("/boardList")
	public String boardlist(Model model) {
		
		ArrayList<BoardVO> list = boardService.getList();
		model.addAttribute("list", list); // 데이터저장(list이름)
		
		return "service/boardList";
	}
	
	@RequestMapping("/boardResult")
	public void boardResult() {
		
	}
	
	// 폼처리
	@RequestMapping(value="/boardForm", method=RequestMethod.POST)
	public String boardForm(BoardVO vo) {
		
		boardService.boardRegist(vo);
		
		return "redirect:/service/boardResult";
	}
	
	
	@RequestMapping("/boardDelete")
	public String boardDelete(@RequestParam("bno") int bno,
							  RedirectAttributes RA) {
		
		boardService.boardDelete(bno);
		RA.addFlashAttribute("msg", bno + "번이 삭제되었습니다."); // 1회성 데이터
		
		return "redirect:/service/boardList";
	}
}
