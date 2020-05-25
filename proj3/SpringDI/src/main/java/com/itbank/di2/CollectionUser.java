package com.itbank.di2;

import java.util.*;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionUser {

	public static void main(String[] args) {
		
		AbstractApplicationContext factory = new GenericXmlApplicationContext("di2.xml");
		
		CollectionBean collect = (CollectionBean)factory.getBean("collect");
		List<String> list = collect.getAddr();
		System.out.println(list);
		
		Set<String> hobby = collect.getHobby();
		System.out.println(hobby);
		
		Map<String, String> cookie = collect.getCookie();
		System.out.println(cookie);
		
		
		
		factory.close();
		
	}
	

}
