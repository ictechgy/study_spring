package com.itbank.di2;

import java.util.ArrayList;

public class GenericTest {
	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		box1.setName("상품");
		System.out.println(box1.getName());
		
		Box<Integer> box2 = new Box<Integer>();
		box2.setName(100);
		System.out.println(box2.getName());
		
		ArrayList<String> list = new ArrayList<String>(); //String 타입만 들어갈 수 있게 됨
		list.add("김아무개");
		list.add("박아무개");
		//이렇게 하면 가지고 나올 때 Object형으로 나오지 않고 String형으로 나온다.
		
		String name1 = list.get(0);
		System.out.println(name1);
	}
}
