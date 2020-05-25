package com.itbank.dao;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MemberMain4 {
	public static void main(String[] args) throws Exception {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("dao.xml");
		MemberDAO2 dao = (MemberDAO2)factory.getBean("dao2");
		
		ArrayList<MemberDTO> list = dao.selectAll();
		System.out.println("전체 멤버 수는" + list.size());
		for(int i=0; i<list.size(); i++) {
			MemberDTO dto = list.get(i);
			System.out.println("아이디 : " + dto.getId());
			System.out.println("패스워드 : " + dto.getPw());
			System.out.println("이름 : " + dto.getName());
			System.out.println("연락처 : " + dto.getTel());
			System.out.println("=============================");
		}
		
	}
}
