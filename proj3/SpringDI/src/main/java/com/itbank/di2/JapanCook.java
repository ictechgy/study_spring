package com.itbank.di2;

import org.springframework.stereotype.Component;

@Component("japan")
public class JapanCook implements Cook {

	@Override 
	public void order() {
		System.out.println("일본 음식 주문");
	}

	@Override
	public void make() {
		System.out.println("일본 음식 만듦");
	}

	@Override
	public void pay() {
		System.out.println("일본 음식 계산");
	}

}
