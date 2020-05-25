package com.itbank.dao;

import java.util.Scanner;

public class DAOTest {
	public static void main(String[] args) throws Exception {
		MemberDAO test = new MemberDAO();
		MemberDTO dto = new MemberDTO();
		Scanner sc = new Scanner(System.in);
		
		dto.setId(sc.next());
		//dto.setPw(sc.next());
		//dto.setName(sc.next());
		dto.setTel(sc.next());
		
		//test.insert(dto);
		
		//test.delete(dto); //id값만 dto에 넣어줘도 됨
		
		test.update(dto);//바꿀 기존 레코드의 id값과 변경할 이후의 tel값 필요
	}
}