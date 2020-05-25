package com.itbank.mvc7;
import java.sql.*;

public class MemberDAO {
	
	public void insert(MemberDTO dto) throws Exception {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		String url = "jdbc:mysql://localhost:3306/spring";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		

		String sql = "insert into members values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getName());
		ps.setString(4, dto.getTel());
		
		ps.executeUpdate(); 
		
		ps.close();
		con.close();
	}
	
	public void update(MemberDTO dto) throws Exception {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		String url = "jdbc:mysql://localhost:3306/spring";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		

		String sql = "update members set tel=? where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getTel());
		ps.setString(2, dto.getId());
		
		ps.executeUpdate(); 
		
		ps.close();
		con.close();
	}
	
	
}
