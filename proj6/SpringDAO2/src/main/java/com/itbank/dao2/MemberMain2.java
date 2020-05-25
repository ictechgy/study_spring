package com.itbank.dao2;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MemberMain2 {
	public static void main(String[] args) throws Exception {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("dao2.xml");
		
		MemberDAO dao = (MemberDAO)factory.getBean("dao");
		
		MemberDTO dto = new MemberDTO();
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 ID정보 입력");
		System.out.print("ID : ");
		dto.setId(sc.next());
			
		MemberDTO dto2 = dao.select(dto);
		
		System.out.println("ID : " + dto2.getId());
		System.out.println("PW : " + dto2.getPw());
		System.out.println("Name : " + dto2.getName());
		System.out.println("Tel : " + dto2.getTel());
		
		
		factory.close();
		
	}
}
