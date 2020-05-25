package com.itbank.aop;

import org.springframework.stereotype.Component;

@Component("b")
public class BSiteClass implements BSite {

	@Override
	public String search() {
		System.out.println("물건 검색 하다");
		return "물건검색메소드 OK";
	}

	@Override
	public void basket() {
		System.out.println("장바구니에 넣기");
		int[] arr = new int[2];
		arr[2] = 100;
	}

	@Override
	public void request() {
		System.out.println("물건 주문 하기");
	}

}
