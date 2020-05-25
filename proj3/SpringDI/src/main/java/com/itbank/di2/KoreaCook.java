package com.itbank.di2;

public class KoreaCook implements Cook {

	@Override //Annotation 현재는 빨리 오버라이드 하라는 용도로서 아무 기능도 없음
	//기능이 있는 Annotation도 있다.
	public void order() {
		System.out.println("한국 음식 주문");
	}

	@Override
	public void make() {
		System.out.println("한국 음식 만듦");
	}

	@Override
	public void pay() {
		System.out.println("한국 음식 계산");
	}

}
