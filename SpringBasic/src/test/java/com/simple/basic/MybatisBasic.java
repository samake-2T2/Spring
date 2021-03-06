package com.simple.basic;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.simple.command.ScoreVO;
import com.simple.test.mapper.TestMapper;

@RunWith(SpringJUnit4ClassRunner.class) // 스프링과 junit의 테스트환경을 잡아준다.
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml") // root-context를 스프링 설정파일로 참조
public class MybatisBasic {
	
	@Autowired
	TestMapper testMapper;
	
//	@Test
//	public void test() {
//		
//		String result = testMapper.getTime();
//		System.out.println("result: " + result);
//		
//	}
	
//	@Test
//	public void test2() {
//		ArrayList<ScoreVO> list = testMapper.getScore();
//		System.out.println(list.toString());
//	}
	
	// insert 방법
//	@Test
//	public void insertOne() {
//		
//		// 단일값 - 
//		int result = testMapper.insertOne("이순신");
//		System.out.println("성공실패결과: " + result);
//		
//	}
	
	// insert방법 - 다중값(VO나 MAP)
//	@Test
//	public void insertTwo() {
//		
//		ScoreVO vo = new ScoreVO(0, "신사임", 20, 30, 40);
//		
//		int result = testMapper.insertTwo(vo);
//		System.out.println("성공실패결과: " + result);
//		
//	}
	
//	@Test
//	public void insertThree() {
//		HashMap<String, String> map = new HashMap<>();
//		map.put("name", "강감찬");
//		map.put("kor", "40");
//		map.put("eng", "50");
//		map.put("math", "60");
//		
//		int result = testMapper.insertThree(map);
//		System.out.println("성공실패결과: " + result);
//	}
	
//	@Test
//	public void insertFour() {
//		int result = testMapper.insertFour("홍길숙", 100);
//		System.out.println("성공실패결과: " + result);
//	}
	
	// select방법 - 단일조회
//	@Test
//	public void selectOne() {
//		
//		ScoreVO vo = testMapper.selectOne(3);
//		System.out.println(vo.toString());
//		
//	}
	
	// select방법 - map을 통한 단일조회
//	@Test
//	public void selectTwo() {
//		HashMap<String, Object> map = testMapper.selectTwo(3);
//		System.out.println(map.toString());
//	}
	
	// select방법 - map을 통한 다중조회
//	@Test
//	public void selectThree() {
//		ArrayList<HashMap<String, Object>> list = testMapper.selectThree();
//		for(HashMap<String, Object> map : list) {
//			System.out.println(map.toString());
//		}
//	}
	
	
	// update실습 - vo를 통해 전달하고 3번 데이터를 업데이트하고 성공실패결과를 반환
//	@Test
//	public void updateOne() {
//		ScoreVO vo = new ScoreVO(3, "이지수", 31, 43, 55);
//		
//		int result = testMapper.updateOne(vo);
//		System.out.println("성공실패결과: " + result);
//	}
	
	
	// delete실습 - 키값을 전달해서 삭제하고 성공실패결과를 반환
	@Test
	public void deleteOne() {
		int result = testMapper.deleteOne(6);
		System.out.println("성공실패결과: " + result);
	}
	
	
	
}
