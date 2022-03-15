package ex07;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ex01.SpringTest;
import ex02.Chef;
import ex02.Hotel;
import ex03.DatabaseDev;
import ex03.MemberDAO;

@Configuration // 자바파일을 xml을 대신해서 설정파일로 쓴다.
public class JavaConfig {

	//	<bean class="ex01.SpringTest" scope="prototype" />

	@Bean
	public SpringTest test() {
		return new SpringTest();
	}

	//	<bean id="c" class="ex02.Chef"></bean>
	//	<bean id="h" class="ex02.Hotel">
	//		<constructor-arg ref="c"></constructor-arg>
	//	</bean>

	@Bean
	public Chef chef() {
		return new Chef();
	}

	@Bean
	public Hotel hotel() {
		return new Hotel(chef());
	}


//	<bean id="dev" class="ex03.DatabaseDev">
//		<property name="url" value="localhost:1521...."></property>
//		<property name="uid" value="hr"></property>
//		<property name="upw" value="hr"/>
//	</bean>
//
//	<bean class="ex03.MemberDAO">
//		<property name="ds" ref="dev"></property>
//	</bean>

	@Bean
	public DatabaseDev dev() {

		DatabaseDev dev = new DatabaseDev();
		dev.setUrl("localhost:....");
		dev.setUid("spring");
		dev.setUpw("spring");

		return dev;
	}

	@Bean
	public MemberDAO dao() {
		MemberDAO dao = new MemberDAO();
		dao.setDs(dev());

		return dao;
	}
}
