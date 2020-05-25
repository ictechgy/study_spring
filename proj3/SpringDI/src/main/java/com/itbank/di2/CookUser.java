package com.itbank.di2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CookUser {

	public static void main(String[] args) {
		
		AbstractApplicationContext factory = new GenericXmlApplicationContext("di2.xml");
		
		Cook cook = (Cook)factory.getBean("cook");
		cook.order();
		cook.make();
		cook.pay();
		
		
		//다 쓴 뒤에 메모리에서 연결과 관련된 자원(스트림)을 닫아주자
		factory.close();
		
	}
	

}
