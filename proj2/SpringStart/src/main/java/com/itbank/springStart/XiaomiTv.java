package com.itbank.springStart;

public class XiaomiTv implements Tv {

	public void powerOn() {
		System.out.println("샤오미 TV 켜짐");
	}

	public void powerOff() {
		System.out.println("샤오미 TV 꺼짐");
	}

	public void volumeUp() {
		System.out.println("샤오미 TV 볼륨Up");
	}

	public void volumeDown() {
		System.out.println("샤오미 TV 볼륨Down");
	}
	
}