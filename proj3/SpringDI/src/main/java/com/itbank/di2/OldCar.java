package com.itbank.di2;


public class OldCar implements Car {
	int price;
	Speaker speaker;
	StrongWindow strong;
	
	public OldCar(int price, Speaker speaker, StrongWindow strong) {
		this.price = price;
		this.speaker = speaker;
		this.strong = strong;
	}
	
	
	
	@Override
	public void start() {
		System.out.println("올드카 달려요");
		System.out.println("가격은"+price);
	}

	@Override
	public void stop() {
		System.out.println("올드카 멈춰요");
	}

	
	
	@Override
	public void soundUp() {
		speaker.soundUp();
	}

	@Override
	public void soundDown() {
		speaker.soundDown();
	}

	public void strongWindow() {
		strong.strongWindow();
	}
	
	
	
}
