package com.itbank.dao2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MemberMain3 {
	public static void main(String[] args) throws Exception {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("dao2.xml");
		
		MemberDAO dao = (MemberDAO)factory.getBean("dao");
		
		List<MemberDTO> list = dao.selectAll();
		for (int i=0; i<list.size(); i++) {
			MemberDTO dto = list.get(i);
			System.out.println("ID : " + dto.getId());
			System.out.println("PW : " + dto.getPw());
			System.out.println("Name : " + dto.getName());
			System.out.println("Tel : " + dto.getTel());
			System.out.println("-------------------");
		}
		
		factory.close();
		
	}
}
