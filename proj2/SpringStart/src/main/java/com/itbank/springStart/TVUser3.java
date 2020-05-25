package com.itbank.springStart;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser3 {
	public static void main(String[] args) {
		
		//추상적(불안정) 클래스 AbstractApplicationContext
		AbstractApplicationContext factory = new GenericXmlApplicationContext("di.xml"); //xml을 읽어오는 객체 생성
		//xml이 아닌 것이 올 수도 있긴 하다.AbstractApplicationContext 가 상위클래스이다.
		
		Tv tv = (Tv) factory.getBean("tv");  //반환 Object형으로 나온다.
		
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		
	}

}
