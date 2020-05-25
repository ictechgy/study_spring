package com.itbank.aop;

import org.springframework.stereotype.Component;

@Component("a")
public class ASiteClass implements ASite {

	@Override
	public void viewInfo() {
		System.out.println("개인정보 보기");
	}

}
