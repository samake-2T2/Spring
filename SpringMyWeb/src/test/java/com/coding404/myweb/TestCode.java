package com.coding404.myweb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.coding404.command.FreeBoardVO;
import com.coding404.freeboard.service.FreeBoardMapper;

//junit버전 4.12dltkd + spring test모듈
@RunWith(SpringJUnit4ClassRunner.class) // 스프링과 junit의 테스트환경을 잡아준다.
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml") // root-context를 스프링 설정파일로 참조
public class TestCode {

	@Autowired
	FreeBoardMapper freeBoardMapper;
	
//	@Test
//	public void testCode01() {
//		
//		for(int i = 1; i <= 300; i++) {
//			
//			FreeBoardVO vo = new FreeBoardVO();
//			vo.setTitle("test" + i);
//			vo.setWriter("admin" + i);
//			vo.setContent("test" + i);
//			
//			freeBoardMapper.regist(vo);
//		}
//		
//	}
}
