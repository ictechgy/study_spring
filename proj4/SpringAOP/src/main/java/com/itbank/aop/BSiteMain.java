package com.itbank.aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BSiteMain {
	public static void main(String args[]) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("aop.xml");
		BSite b = (BSite)factory.getBean("b");
		b.search();
		b.request();
		b.basket();

		factory.close();
	}
}
