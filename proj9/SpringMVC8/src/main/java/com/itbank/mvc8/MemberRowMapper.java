package com.itbank.mvc8;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MemberRowMapper implements RowMapper<MemberDTO> {

	@Override
	public MemberDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		MemberDTO dto = new MemberDTO();
		dto.setId(rs.getString(1));
		dto.setPw(rs.getString(2));
		dto.setName(rs.getString(3));
		dto.setTel(rs.getString(4));
		return dto;
	}

}
