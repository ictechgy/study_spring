package com.itbank.aop;

import org.springframework.stereotype.Component;

@Component("board")
public class BoardClass implements Board {

	@Override
	public void insert() {
		System.out.println("insert() call");
	}

	@Override
	public String delete() {
		System.out.println("delete() call");
		return "OK 삭제완료";
	}

	@Override
	public void update() {
		System.out.println("update() call");
	}

	@Override
	public void select() {
		System.out.println("select() call");
		int[] num = new int[3];
		num[3] = 100;
	}

}
