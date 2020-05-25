package com.itbank.dao;
import java.sql.*;

import org.springframework.stereotype.Repository;

@Repository("BoardDAO")
public class BoardDAO {
	
	public void insert(BoardDTO dto) throws Exception {
		//1. 드라이버 로딩
		Class.forName("com.mysql.jdbc.Driver"); //클래스를 못찾은경우를 위해 예외처리 해주어야함
		System.out.println("1번. 드라이버 로딩성공");
		
		//2. DB연결
		String url = "jdbc:mysql://localhost:3306/spring";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2번. DB연결");
		
		//3. SQL문 객체화
		String sql = "insert into board values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3번. SQL문 객체화");
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getTitle());
		ps.setString(3, dto.getContent());
		ps.setString(4, dto.getDate());
		
		//4. SQL문 실행요청
		ps.executeUpdate(); //또는 ps.executeQuery(); -> 결과값이 반환. Update는 결과가 숫자로 반환
		System.out.println("4번. SQL문 실행 요청");
		
		ps.close();
		con.close();
	}
	
	public void delete(BoardDTO dto) throws Exception {  //매개변수로 DTO를 다 받아도 되고 레코드 구분 특정 값(Primary Key)만 받아서 처리해도 된다.
		//1. 드라이버 로딩
		Class.forName("com.mysql.jdbc.Driver"); //클래스를 못찾은경우를 위해 예외처리 해주어야함
		System.out.println("1번. 드라이버 로딩성공");
		
		//2. DB연결
		String url = "jdbc:mysql://localhost:3306/spring";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2번. DB연결");
		
		//3. SQL문 객체화
		String sql = "delete from board where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3번. SQL문 객체화");
		ps.setString(1, dto.getId());
		
		//4. SQL문 실행요청
		ps.executeUpdate(); //또는 ps.executeQuery(); -> 결과값이 반환. Update는 결과가 숫자로 반환
		System.out.println("4번. SQL문 실행 요청");
		
		ps.close();
		con.close();
	}
	
	public void update(BoardDTO dto) throws Exception {
		//1. 드라이버 로딩
		Class.forName("com.mysql.jdbc.Driver"); //클래스를 못찾은경우를 위해 예외처리 해주어야함
		System.out.println("1번. 드라이버 로딩성공");
		
		//2. DB연결
		String url = "jdbc:mysql://localhost:3306/spring";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2번. DB연결");
		
		//3. SQL문 객체화
		String sql = "update Board set content=? where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3번. SQL문 객체화");
		ps.setString(1, dto.getContent()); //변경되는 값이 dto에 들어온다고 가정
		ps.setString(2, dto.getId());
		
		//4. SQL문 실행요청
		ps.executeUpdate(); //또는 ps.executeQuery(); -> 결과값이 반환. Update는 결과가 숫자로 반환
		System.out.println("4번. SQL문 실행 요청");
		
		ps.close();
		con.close();
	}
	
	public BoardDTO select(BoardDTO dto) throws Exception {
		//1. 드라이버 로딩
		Class.forName("com.mysql.jdbc.Driver"); //클래스를 못찾은경우를 위해 예외처리 해주어야함
		System.out.println("1번. 드라이버 로딩성공");
		
		//2. DB연결
		String url = "jdbc:mysql://localhost:3306/spring";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2번. DB연결");
		
		//3. SQL문 객체화
		String sql = "select * from Board where title=?";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3번. SQL문 객체화");
		ps.setString(1, dto.getTitle());
		
		//4. SQL문 실행요청
		ResultSet rs = ps.executeQuery(); //결과값을 집합형태로 받는다. 
		System.out.println("4번. SQL문 실행 요청");
		BoardDTO dto2 = null;
		while(rs.next()) { //검색결과는 레코드(행)단위로 가져오게 된다. 따라서 next로 다음 행으로 넘어가줘야 함. 처음에는 빈 행쪽을 가리키는 상태
			dto2 = new BoardDTO();
			String id = rs.getString(1);
			String title = rs.getString(2);
			String content = rs.getString(3);
			String date = rs.getString(4);

			dto2.setId(id);
			dto2.setTitle(title);
			dto2.setContent(content);
			dto2.setDate(date);
		}
		rs.close();
		ps.close();
		con.close();
		return dto2;
	}
}
