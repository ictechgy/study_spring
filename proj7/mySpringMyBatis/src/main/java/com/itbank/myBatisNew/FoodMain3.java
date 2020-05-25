package com.itbank.myBatisNew;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class FoodMain3 {
	public static void main(String[] args) throws Exception {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("myBatisNew.xml");
		
		FoodDAO dao = (FoodDAO)factory.getBean("dao");
		
		List<FoodDTO> list = dao.selectAll();
		
		for(int i=0; i<list.size(); i++) {
			FoodDTO dto = list.get(i);
			System.out.println("FoodID : " + dto.getFoodId());
			System.out.println("FoodName : " + dto.getFoodName());
			System.out.println("FoodPrice : " + dto.getFoodPrice());
			System.out.println("FoodContent : " + dto.getFoodContent());
			System.out.println("FoodCompany : " + dto.getFoodCompany());
		}
		
		factory.close();
		
	}
}
