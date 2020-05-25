package com.itbank.dao2;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BoardRowMapper implements RowMapper<BoardDTO> {

	@Override
	public BoardDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		BoardDTO dto = new BoardDTO();
		dto.setId(rs.getString(1));
		dto.setTitle(rs.getString(2));
		dto.setContent(rs.getString(3));
		dto.setDate(rs.getString(4));
		return dto;
	}

}
