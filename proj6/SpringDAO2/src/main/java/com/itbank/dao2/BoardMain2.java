package com.itbank.dao2;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardMain2 {
	public static void main(String[] args) {
		
		AbstractApplicationContext factory = new GenericXmlApplicationContext("dao2.xml");
		BoardDAO dao = (BoardDAO)factory.getBean("board");

		BoardDTO dto = new BoardDTO();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("게시글 하나 검색");
		System.out.println("찾고자 하는 게시글 ID : ");
		dto.setId(sc.next());
		
		dto = dao.select(dto);
		
		System.out.println("ID : " + dto.getId());
		System.out.println("Title : " + dto.getTitle());
		System.out.println("Content : " + dto.getContent());
		System.out.println("Date : " + dto.getDate());
		
		factory.close();
		sc.close();
	}
}
