package com.itbank.dao2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class MemberDAO {
	
	@Autowired
	JdbcTemplate jdbc;
	
	public void insert(MemberDTO dto) {
		String sql = "insert into members values(?, ?, ?, ?)";
		jdbc.update(sql, dto.getId(), dto.getPw(), dto.getName(), dto.getTel());
	}
	
	public void delete(MemberDTO dto) {
		String sql = "delete from members where id = ?";
		jdbc.update(sql, dto.getId());
	}
	
	public void update(MemberDTO dto) {
		String sql = "update members set tel=? where id=?";
		jdbc.update(sql, dto.getTel(), dto.getId());
	}
	
	public MemberDTO select(MemberDTO dto) {
		String sql = "select * from members where id=?";
		Object[] o = {dto.getId()};		//물음표에 넣을 것들은 배열로 만들어야 하는데 어떤 값이 물음표로 들어갈지 모르니 Object형 배열로 해야한다. 
		return jdbc.queryForObject(sql, o, new MemberRowMapper()); //반환받은 값을 MemberDTO로 넣어야하는데 그걸 따로 클래스로 만들어서 써야함
		//반환값이 하나인 경우에는 queryForObject사용
	}
	
	public List<MemberDTO> selectAll() {
		String sql = "select * from members";
		return jdbc.query(sql, new MemberRowMapper()); 
	}
		
}
