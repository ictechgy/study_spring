package com.itbank.di2;


public class BlueCar implements Car {

	Speaker speaker;
	StrongWindow strong;
	int price;
	public BlueCar(Speaker speaker, StrongWindow strong, int price) {
		this.speaker = speaker;
		this.strong = strong;
		this.price = price;
	}
	
	
	
	public BlueCar(StrongWindow strong) {
		this.strong = strong;
	}
	
	public BlueCar(Speaker speaker, StrongWindow strong) {
		this.speaker = speaker;
		this.strong = strong;
	}
	
	
	
	@Override
	public void start() {
		System.out.println("그린카 달려요");
		System.out.println(price+"만원");
	}

	@Override
	public void stop() {
		System.out.println("그린카 멈춰요");
	}

	

	
	@Override
	public void soundUp() {
		//System.out.println("그린카 사운드 UP");
		speaker.soundUp();
	}

	@Override
	public void soundDown() {
		//System.out.println("그린카 사운드 DOWN");
		speaker.soundDown();
	}

	public void strongWindow() {
		strong.strongWindow();
	}
	
	
	
}
