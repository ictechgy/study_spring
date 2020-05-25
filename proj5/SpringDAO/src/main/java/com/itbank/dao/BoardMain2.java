package com.itbank.dao;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardMain2 {

	public static void main(String[] args) throws Exception {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("dao.xml");
		
		BoardDAO2 dao = (BoardDAO2)factory.getBean("BoardDAO2");
		
		ArrayList<BoardDTO> list = dao.selectAll();
		for(int i=0; i<list.size(); i++) {
			BoardDTO dto = list.get(i);
			System.out.println("아이디 : "+dto.getId());
			System.out.println("제목 : "+dto.getTitle());
			System.out.println("내용 : "+dto.getContent());
			System.out.println("날짜 : "+dto.getDate());
			System.out.println("========================");
		}
		
	}

}
