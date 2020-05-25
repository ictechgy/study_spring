package com.itbank.myBatisNew;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class FoodMain {
	public static void main(String[] args) throws Exception {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("myBatisNew.xml");
		
		FoodDAO dao = (FoodDAO)factory.getBean("dao");
		
		FoodDTO dto = new FoodDTO();
		Scanner sc = new Scanner(System.in);
		System.out.println("정보를 입력");
		System.out.print("ID : ");
		dto.setFoodId(sc.next());
		System.out.println("Name : ");
		dto.setFoodName(sc.next());
		System.out.println("Price : ");
		dto.setFoodPrice(sc.next());
		System.out.println("Content : ");
		dto.setFoodContent(sc.next());
		System.out.println("Company : ");
		dto.setFoodCompany(sc.next());
		
		dao.insert(dto);
				
		factory.close();
		sc.close();
		
	}
}
