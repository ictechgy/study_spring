package com.itbank.di2;


public class YellowCar implements Car {
	
	String name;
	StrongWindow strong;
	Speaker speaker;
	
	public YellowCar(String name, StrongWindow strong, Speaker speaker) {
		this.name = name;
		this.strong = strong;
		this.speaker = speaker;
	}
	

	@Override
	public void start() {
		System.out.println("노랑카 달려요");
		System.out.println(name+"달린다구요");
	}

	@Override
	public void stop() {
		System.out.println("노랑카 멈춰요");
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
