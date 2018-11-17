package spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.spring.Dept;
import cn.tedu.spring.User;

public class TestSpring {
	@Test
	public void create(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user=(User)ac.getBean("user");
		System.out.println(user);
		user.getDog().eat();
	}
	
	@Test
	public void TestDept(){
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Dept dept =(Dept)ac.getBean("dept");
		System.out.println(dept);
		
	}
}
