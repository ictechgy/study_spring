package com.itbank.dao;
import java.sql.*;

public class DriverTest {
	
	public void insert() throws Exception {
		//1. 드라이버 로딩
		Class.forName("com.mysql.jdbc.Driver"); //클래스를 못찾은경우를 위해 예외처리 해주어야함
		System.out.println("1번. 드라이버 로딩성공");
		
		//2. DB연결
		String url = "jdbc:mysql://localhost:3306/shop";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2번. DB연결");
		
		//3. SQL문 객체화
		String sql = "insert into member values ('400','400','im','011')";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3번. SQL문 객체화");
		
		//4. SQL문 실행요청
		ps.executeUpdate(); //또는 ps.executeQuery(); -> 결과값이 반환. Update는 결과가 숫자로 반환
		System.out.println("4번. SQL문 실행 요청");
		
		ps.close();
		con.close();
	}
}
