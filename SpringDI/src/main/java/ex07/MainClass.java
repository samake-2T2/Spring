package ex07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ex01.SpringTest;
import ex02.Hotel;
import ex03.DatabaseDev;
import ex03.MemberDAO;

public class MainClass {

	public static void main(String[] args) {
		
		// 자바파일을 설정파일로 쓸때는 GenericApplicationContext를 상속받는
		// 아래 클래스를 사용합니다.
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		SpringTest st = ctx.getBean(SpringTest.class);
		st.test();
		
		Hotel h = ctx.getBean(Hotel.class);
		h.getChef().cooking();
		
		DatabaseDev dev = ctx.getBean(DatabaseDev.class);
		System.out.println(dev.getUrl());
		System.out.println(dev.getUid());
		System.out.println(dev.getUpw());
		
		MemberDAO dao = ctx.getBean(MemberDAO.class);
		System.out.println(dao.getDs().getUrl());
		System.out.println(dao.getDs().getUid());
		System.out.println(dao.getDs().getUpw());

	}

}
