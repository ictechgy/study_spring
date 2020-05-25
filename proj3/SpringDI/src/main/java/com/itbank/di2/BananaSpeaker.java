package com.itbank.di2;

import org.springframework.stereotype.Component;

@Component("banana")
public class BananaSpeaker implements Speaker {

	@Override
	public void soundUp() {
		System.out.println("바나나 스피커 사운드 UP");
	}

	@Override
	public void soundDown() {
		System.out.println("바나나 스피커 사운드 DOWN");

	}

}
