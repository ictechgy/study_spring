package com.itbank.dao;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MemberMain {
	public static void main(String[] args) throws Exception {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("dao.xml");
		MemberDAO dao = (MemberDAO)factory.getBean("dao");
		
		MemberDTO dto = new MemberDTO();
		Scanner sc = new Scanner(System.in);
		System.out.println("회원가입정보 입력");
		dto.setId(sc.next());
		dto.setPw(sc.next());
		dto.setName(sc.next());
		dto.setTel(sc.next());
		dao.insert(dto);
	}
}
