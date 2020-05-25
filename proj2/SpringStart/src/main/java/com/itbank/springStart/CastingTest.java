package com.itbank.springStart;

import java.util.ArrayList;

public class CastingTest {
	public static void main(String[] args) {
		ArrayList food = new ArrayList();
		//자료형 타입 아무거나 넣을 수 있음(제네릭 설정 안해둠)
		
		//전부 Object 형식으로 자동형변환(업캐스팅)되어 들어간다. (제네릭 설정하면?)
		food.add("떡볶이"); //String -> Object
		food.add(10000); //int <-> Integer -> Object
								//int를 Integer로 변환하는 것을 boxing이라고 한다. Integer는 int의 wrapper Class
		food.add(1.5);//Double
		
		
		//가져와보자 그냥은 가져올 수가 없다.
		String s = (String)food.get(0); //다운캐스팅(강제형변환)
		int pay = (Integer)food.get(1); //Object형에서 Integer로 다운캐스팅 한뒤에 int로 들어갈 때 unboxing
		
	}
}
