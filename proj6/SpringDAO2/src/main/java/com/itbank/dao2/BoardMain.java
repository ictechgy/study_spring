package com.itbank.dao2;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardMain {
	public static void main(String[] args) {
		
		AbstractApplicationContext factory = new GenericXmlApplicationContext("dao2.xml");
		BoardDAO dao = (BoardDAO)factory.getBean("board");

		BoardDTO dto = new BoardDTO();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("게시글에 대한 것을 작성할 것입니다.");
		System.out.println("ID : ");
		dto.setId(sc.next());
		System.out.println("Title : ");
		dto.setTitle(sc.next());
		System.out.println("Content : ");
		dto.setContent(sc.nextLine());
		System.out.println("Date : ");
		dto.setDate(sc.next());
		
		dao.insert(dto);
		
		factory.close();
		sc.close();
		
	}
}
