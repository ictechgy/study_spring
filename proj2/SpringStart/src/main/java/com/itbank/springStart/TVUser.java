package com.itbank.springStart;

public class TVUser {
	public static void main(String[] args) {
		Tv tv = new SamsungTV();
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		
	}

}
