package com.itbank.aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CSiteMain {
	public static void main(String args[]) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("aop.xml");
		CSite c = (CSite)factory.getBean("c");
		c.orderView();
		c.confirm();
		
		
		factory.close();
	}
}
