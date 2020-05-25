package com.itbank.dao2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("board")
public class BoardDAO {
	
	@Autowired
	JdbcTemplate jdbc;
	
	public void insert(BoardDTO dto) {
		String sql = "insert into board values(?, ?, ?, ?)";
		jdbc.update(sql, dto.getId(), dto.getTitle(), dto.getContent(), dto.getDate());
	}
	
	public BoardDTO select(BoardDTO dto) {
		String sql = "select * from board where id=?";
		Object[] o = {dto.getId()};
		return jdbc.queryForObject(sql, o, new BoardRowMapper());
	}
	
	public List<BoardDTO> selectAll() {
		String sql = "select * from board";
		return jdbc.query(sql, new BoardRowMapper());
	}
}
