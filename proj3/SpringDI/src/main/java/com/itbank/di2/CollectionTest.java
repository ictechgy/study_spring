package com.itbank.di2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

public class CollectionTest {

	public static void main(String[] args) {

		ArrayList list = new ArrayList<>();
		list.add("감자");
		list.add(100);
		list.add(11.55);
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		HashSet bag = new HashSet();
		bag.add("휴대폰");
		bag.add("볼펜");
		bag.add("휴지");
		bag.add("볼펜");
		
		System.out.println(bag);
		//원래 주소가 찍혀야하지만 toString을 오버라이딩했기때문에 값이 바로 나온다.
		//중복값은 필터링해서 하나는 사라진다.
		//원래 Set은 쓸 때
		
		LinkedList queue = new LinkedList();
		queue.add("어제우유");
		queue.add("오늘우유");
		queue.remove();
		//remove할 것을 지정하지는 않았지만 선입선출에 의해 먼저 들어간것이 사라진다.
		
		System.out.println(queue);
		
		
		HashMap map = new HashMap();
		map.put("1","엄마");
		map.put("2","아빠");
		System.out.println(map.get("1"));
		
	}

}
