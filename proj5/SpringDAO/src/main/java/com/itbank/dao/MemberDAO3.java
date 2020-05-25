package com.itbank.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("dao3")
public class MemberDAO3 {
	
	@Autowired
	JdbcTemplate jdbc;  //bean으로 생성한 jdbc 객체 받아오기(커넥션 풀은 생성된 상태)
	
	//기존의 드라이버로드 및 연결객체생성은 물론이거니와 PrepareStatement부분도 다 사라지게 된다.
	
	public void insert(MemberDTO dto) {
		String sql = "insert into member values (?,?,?,?)";
		jdbc.update(sql, dto.getId(), dto.getPw(), dto.getName(), dto.getTel());
	}
	public void delete(MemberDTO dto) {
		String sql = "delete from member where id=?";
		jdbc.update(sql, dto.getId());
	}
	public void update(MemberDTO dto) {
		String sql = "update member set tel=? where id=?";
		jdbc.update(sql, dto.getTel(), dto.getId());
	}
	//jdbc.update() 를 쓰느냐 jdbc.execute()를 쓰느냐는 sql질의문을 executeUpdate()로 처리하느냐, executeQuery()로 처리하느냐와 동일한 맥락으로 보면 된다.
	public List<MemberDTO> selectAll() throws Exception {
		return null;
	}
	public MemberDTO select(MemberDTO dto) throws Exception {
		return null;
	}

}
