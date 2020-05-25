package com.itbank.springStart;

public class TVUser2 {
	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory();
		Tv tv = (Tv)factory.getBean("x");
		
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		
	}

}
