package com.itbank.myBatisNew;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class FoodMain2 {
	public static void main(String[] args) throws Exception {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("myBatisNew.xml");
		
		FoodDAO dao = (FoodDAO)factory.getBean("dao");
		
		FoodDTO dto = new FoodDTO();
		Scanner sc = new Scanner(System.in);
		System.out.println("찾으려는 정보를 입력");
		System.out.print("ID : ");
		dto.setFoodId(sc.next());
		
		dto = dao.select(dto);
		
		System.out.println("FoodID : " + dto.getFoodId());
		System.out.println("FoodName : " + dto.getFoodName());
		System.out.println("FoodPrice : " + dto.getFoodPrice());
		System.out.println("FoodContent : " + dto.getFoodContent());
		System.out.println("FoodCompany : " + dto.getFoodCompany());
		
		
		factory.close();
		sc.close();
		
	}
}
