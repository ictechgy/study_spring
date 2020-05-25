package com.itbank.aopanno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ShowMain {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("aop.xml");
		Show s = (Show)factory.getBean("show");
		
		s.showBefore();
		s.showAfter();
		s.showGreet();
		s.showGive();
		s.showFail();
		
		factory.close();
	}

}