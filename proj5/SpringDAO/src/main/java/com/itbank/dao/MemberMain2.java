package com.itbank.dao;

import java.util.Scanner;

import javax.swing.JOptionPane;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MemberMain2 {
	public static void main(String[] args) throws Exception {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("dao.xml");
		MemberDAO dao = (MemberDAO)factory.getBean("dao");
		MemberDTO dto = new MemberDTO();
		Scanner sc = new Scanner(System.in);
		System.out.println("찾고자 하는 레코드의 id값 입력");
		dto.setId(sc.next());  //사실 ID값만 필요하니 String 타입 변수 하나만을 쓰도록 해도 된다.
		
		MemberDTO dto2 = dao.select(dto);
		JOptionPane.showMessageDialog(null, dto2.getId());
		JOptionPane.showMessageDialog(null, dto2.getPw());
		JOptionPane.showMessageDialog(null, dto2.getName());
		JOptionPane.showMessageDialog(null, dto2.getTel());
		
	}
}