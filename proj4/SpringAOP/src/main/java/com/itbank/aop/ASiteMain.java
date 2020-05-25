package com.itbank.aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ASiteMain {
	public static void main(String args[]) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("aop.xml");
		ASite a = (ASite)factory.getBean("a");
		a.viewInfo();
		
		factory.close();
	}
}
