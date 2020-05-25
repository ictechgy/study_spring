package com.itbank.di2;


public class NewCar implements Car {
	
	String name;
	Speaker speaker;
	StrongWindow strong;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public void setStrong(StrongWindow strong) {
		this.strong = strong;
	}
	

	@Override
	public void start() {
		System.out.println("뉴카 달려요. 이름은"+name);
	}

	@Override
	public void stop() {
		System.out.println("뉴카 멈춰요");
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
