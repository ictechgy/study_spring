package com.itbank.dao2;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardMain3 {
	public static void main(String[] args) {
		
		AbstractApplicationContext factory = new GenericXmlApplicationContext("dao2.xml");
		BoardDAO dao = (BoardDAO)factory.getBean("board");
		
		System.out.println("전체 게시글을 검색합니다.");

		List<BoardDTO> list = dao.selectAll();
		
		for(int i=0; i<list.size(); i++) {
			BoardDTO dto = list.get(i);
			System.out.println("ID : " + dto.getId());
			System.out.println("Title : " + dto.getTitle());
			System.out.println("Content : " + dto.getContent());
			System.out.println("Date : " + dto.getDate());
			System.out.println("----------------------------");
		}
		
		factory.close();
		
	}
}
