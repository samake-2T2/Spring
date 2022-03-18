package com.simple.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.simple.command.BoardVO;
import com.simple.dao.BoardDAO;

@Service("boardService") // 컴포넌트 스캔확인.
public class BoardServiceImpl implements BoardService {

	@Autowired
	@Qualifier("boardDAO")
	BoardDAO boardDAO;
	
	@Override
	public void boardRegist(BoardVO vo) {
//		System.out.println("실행됨"); // 서비스 연결 확인
		boardDAO.boardRegist(vo);
		
	}

	@Override
	public ArrayList<BoardVO> getList() {
		
		return boardDAO.getList();
	}

	@Override
	public void boardDelete(int num) {
		boardDAO.boardDelete(num);
		
	}

}
