package com.itbank.di2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class GoldCar implements Car {

	@Autowired
	@Qualifier("apple")
	Speaker speaker;
	
	@Autowired
	StrongWindow strong;
	
	@Override
	public void start() {
		System.out.println("골드카 달려요");
	}

	@Override
	public void stop() {
		System.out.println("골드카 멈춰요");
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
