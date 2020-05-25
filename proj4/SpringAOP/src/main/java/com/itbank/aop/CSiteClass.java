package com.itbank.aop;

import org.springframework.stereotype.Component;

@Component("c")
public class CSiteClass implements CSite {

	@Override
	public void orderView() {
		System.out.println("주문한 정보를 살펴보자");
	}

	@Override
	public void confirm() {
		System.out.println("주문한 것을 확인하자");
	}

}
