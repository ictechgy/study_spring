package com.itbank.dao;
import java.sql.*;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository("BoardDAO2")
public class BoardDAO2 {
	
	DBConnectionMgr pool;
	
	BoardDAO2(){
		pool = new DBConnectionMgr();  //pool = DBConnectioMgr.getInstance(); 
	}
	
	
	public BoardDTO select(BoardDTO dto) throws Exception {
		Connection con = pool.getConnection();
		
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
		pool.freeConnection(con,ps,rs);
		return dto2;
	}
	
	public ArrayList<BoardDTO> selectAll() throws Exception {
		Connection con = pool.getConnection();
		
		//3. SQL문 객체화
		String sql = "select * from Board";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3번. SQL문 객체화");
		
		//4. SQL문 실행요청
		ResultSet rs = ps.executeQuery(); //결과값을 집합형태로 받는다. 
		System.out.println("4번. SQL문 실행 요청");
		BoardDTO dto2 = null;
		ArrayList<BoardDTO> list = new ArrayList<>();
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
			list.add(dto2);
		}
		pool.freeConnection(con,ps,rs);
		return list;
	}
}
