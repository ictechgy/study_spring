package com.itbank.di2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("green")
public class GreenCar implements Car {

	@Override
	public void start() {
		System.out.println("그린카 달려요");
	}

	@Override
	public void stop() {
		System.out.println("그린카 멈춰요");
	}

	
	@Autowired
	@Qualifier("apple")
	Speaker speaker;
	
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
		
	}
	
	
	
}
