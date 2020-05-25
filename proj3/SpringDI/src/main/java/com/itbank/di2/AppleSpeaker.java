package com.itbank.di2;

import org.springframework.stereotype.Component;

@Component("apple")
public class AppleSpeaker implements Speaker {

	@Override
	public void soundUp() {
		System.out.println("애플 스피커 사운드 UP");
	}

	@Override
	public void soundDown() {
		System.out.println("애플 스피커 사운드 DOWN");

	}

}
