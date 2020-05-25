package com.itbank.dao2;

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
	//내가 호출하는 메소드가 아니다. jdbc 템플릿이 가져온 결과값인 rs를 MemberDTO에 매칭시킬 때 쓰는 메소드

}
