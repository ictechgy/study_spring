package com.itbank.myBatisNew;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class FoodDAO {
	
	@Autowired
	SqlSessionTemplate myBatis;
	
	public void insert(FoodDTO dto) {
		myBatis.insert("food.insert", dto);
	}
	
	public FoodDTO select(FoodDTO dto) {
		return myBatis.selectOne("food.select", dto);
	}
	
	public List<FoodDTO> selectAll(){
		return myBatis.selectList("food.selectAll");
	}
	
	public void update(FoodDTO dto) {
		myBatis.update("food.update", dto);
	}
	
	public void delete(FoodDTO dto) {
		myBatis.delete("food.delete", dto);
	}
	
}
