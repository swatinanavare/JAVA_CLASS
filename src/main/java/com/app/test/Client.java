package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.Person;
import com.app.Welcome;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Welcome welcome = (Welcome)ctx.getBean("wel");
		
		System.out.println(welcome.getMsg());
		Person p =(Person)ctx.getBean("person");
		System.out.println(p.getPid()+":"+p.getName());
	}

}
