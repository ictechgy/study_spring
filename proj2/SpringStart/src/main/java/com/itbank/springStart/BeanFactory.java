package com.itbank.springStart;

public class BeanFactory {
	public Object getBean(String name) {
		if(name.equals("s")) {
			return new SamsungTV();
		}else if(name.equals("x")) {
			return new XiaomiTv();
		}
		return null;
	}
}
