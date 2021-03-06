package ex03;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * DatabaseDev dev = new DatabaseDev();
		 * dev.setUrl("localhost:1521....");
		 * dev.setUid("hr");
		 * dev.setUpw("hr");
		 */
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("application-context.xml");
		
		DatabaseDev dev = ctx.getBean(DatabaseDev.class);
		
		System.out.println(dev.getUrl());
		System.out.println(dev.getUid());
		System.out.println(dev.getUpw());
		
		// 1. application-context에 MemberDAO의 의존관계를 나타내고
		//    main에서는 getBean메서드를 통해서 값을 출력해보시면 됩니다.
		MemberDAO member = ctx.getBean(MemberDAO.class);
		
		System.out.println(member.getDs().getUrl());
		System.out.println(member.getDs().getUid());
		System.out.println(member.getDs().getUpw());
	}

}
