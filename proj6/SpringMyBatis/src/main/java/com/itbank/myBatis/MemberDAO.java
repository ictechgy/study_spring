package com.itbank.myBatis;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class MemberDAO {
	
	@Autowired
	SqlSessionTemplate myBatis;
	
	public void insert(MemberDTO dto) {
		myBatis.insert("member.insert", dto);
	}
	
	public void delete(MemberDTO dto) {
		myBatis.delete("member.delete", dto);
	}
	
	public void update(MemberDTO dto) {
		myBatis.update("member.update", dto);
	}
	
	public MemberDTO select(MemberDTO dto) {
		return myBatis.selectOne("member.select", dto);
	}
	
	public List<MemberDTO> selectAll() {
		return myBatis.selectList("member.selectAll");
	}
		
}
