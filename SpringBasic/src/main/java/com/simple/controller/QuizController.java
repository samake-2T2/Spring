package com.simple.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.Quiz01VO;
import com.simple.command.Quiz02VO;
import com.simple.command.Quiz03VO;

@Controller
@RequestMapping("/quiz")
public class QuizController {
	
	// =============quiz01===============
	@RequestMapping("/quiz01")
	public void qiuz01() {
		
	}
	
	@RequestMapping("/sendBirth")
	public String sendBirth(@ModelAttribute("birth") Quiz01VO vo) {
		System.out.println(vo.getYear() + vo.getMonth() + vo.getDay());
		
		return "quiz/quiz01_ok";
	}
	
	// =============quiz02===============
	@RequestMapping("/quiz02")
	public void quiz02() {
		
	}
	
	@RequestMapping("/join")
	public String join(@ModelAttribute("info") Quiz02VO vo) {
		
		return "quiz/quiz02_ok";
	}
	
	// =============quiz02===============
	@RequestMapping("/quiz03")
	public void quiz03() {
		
	}
	
	@RequestMapping("/quiz03_ok")
	public void redirect_login_ok() {

	}
	
	@RequestMapping("/join2")
	public String join2(Quiz03VO vo,
						RedirectAttributes RA) {
		if(vo.getId().equals("")) {
			RA.addFlashAttribute("msg", "아이디를 입력하세요");
			return "redirect:/quiz/quiz03";
		} else if(!vo.getPw().equals(vo.getPw_check())) {
			RA.addFlashAttribute("msg", "비밀번호를 확인하세요");
			return "redirect:/quiz/quiz03";
		} else {
			RA.addFlashAttribute("msg", vo.getId() + "님 회원가입을 축하합니다.");
			return "redirect:/quiz/quiz03_ok";
		}
	}
	
	
	
	
}
