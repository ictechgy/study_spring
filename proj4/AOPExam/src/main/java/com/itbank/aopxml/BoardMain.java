package com.itbank.aopxml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext factory = new GenericXmlApplicationContext("aop.xml");
		Board b = (Board)factory.getBean("board");
		
		b.insert();
		b.delete();
		b.update();
		b.select();
		b.selectAll();
		
	}

}
