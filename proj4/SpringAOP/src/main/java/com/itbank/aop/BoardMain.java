package com.itbank.aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardMain {
	public static void main(String args[]) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("aop.xml");
		Board board = (Board)factory.getBean("board");
		board.insert();
		board.delete();
		board.update();
		board.select();
		
		factory.close();
	}
}
