package com.itbank.di2;


public class BlackCar implements Car {
	
	StrongWindow strong;
	Speaker speaker;
	int speed;
	
	public void setStrong(StrongWindow strong) {
		this.strong = strong;
	}
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	@Override
	public void start() {
		System.out.println("블랙카 달려요");
		System.out.println("속도는"+speed);
	}

	@Override
	public void stop() {
		System.out.println("블랙카 멈춰요");
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
