package com.itbank.aopxml;

import org.springframework.stereotype.Component;

@Component("board")
public class BoardClass implements Board {

	@Override
	public void insert() {
		System.out.println("게시판에 글 추가");
	}

	@Override
	public void delete() {
		System.out.println("게시판의 글 삭제");
	}

	@Override
	public void update() {
		System.out.println("게시판의 글 수정");
	}

	@Override
	public String select() {
		System.out.println("게시판 글 검색");
		return "글검색결과";
	}

	@Override
	public void selectAll() {
		System.out.println("게시판 글 전체 검색");
		String[] arr = new String[100];
		arr[100] = "추가적인 글 Overflow";
	}

}
