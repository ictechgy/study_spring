package com.itbank.myBatis;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MemberMain {
	public static void main(String[] args) throws Exception {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("myBatis.xml");
		
		MemberDAO dao = (MemberDAO)factory.getBean("dao");
		
		MemberDTO dto = new MemberDTO();
		Scanner sc = new Scanner(System.in);
		System.out.println("회원가입 정보를 입력");
		System.out.print("ID : ");
		dto.setId(sc.next());
		System.out.println("PW : ");
		dto.setPw(sc.next());
		System.out.println("NAME : ");
		dto.setName(sc.next());
		System.out.println("Tel : ");
		dto.setTel(sc.next());
		
		dao.insert(dto);
		
		factory.close();
		sc.close();
		
	}
}
