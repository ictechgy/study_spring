package com.itbank.dao;

import java.util.Scanner;

import javax.swing.JOptionPane;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardMain {

	public static void main(String[] args) throws Exception {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("dao.xml");
		
		BoardDAO dao = (BoardDAO)factory.getBean("BoardDAO");
		BoardDTO dto = new BoardDTO();
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("검색하고자 하는 제목 입력");
		//dto.setTitle(sc.next());
		
		String title = JOptionPane.showInputDialog("검색하고자 하는 제목 입력");
		dto.setTitle(title);
		
		BoardDTO dto2 = dao.select(dto);
		
		JOptionPane.showMessageDialog(null, dto2.getId());
		JOptionPane.showMessageDialog(null, dto2.getTitle());
		JOptionPane.showMessageDialog(null, dto2.getContent());
		JOptionPane.showMessageDialog(null, dto2.getDate());
		
	}

}
