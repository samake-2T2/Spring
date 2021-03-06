package com.simple.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.simple.command.BoardVO;

@Repository("boardDAO")
public class BoardDAOImpl implements BoardDAO {

	@Autowired
	@Qualifier("ds")
	DataSource ds;

	@Override
	public void boardRegist(BoardVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		String sql = "insert into board values(board_seq.nextval, ?, ?, ?)";

		try {
			conn = ds.getConnection();

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getTitle());
			pstmt.setString(3, vo.getContent());

			pstmt.executeUpdate(); // 성공시 1, 실패시 0 반환

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	@Override
	public ArrayList<BoardVO> getList() {
		ArrayList<BoardVO> list = new ArrayList<>(); // 값을 담을 리스트

		// select
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select * from board";

		try {
			conn = ds.getConnection();

			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while(rs.next()) {
				int bno = rs.getInt("bno");
				String name = rs.getString("name");
				String title = rs.getString("title");
				String content = rs.getString("content");

				BoardVO vo = new BoardVO(bno, name, title, content);
				list.add(vo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return list;
	}

	@Override
	public void boardDelete(int bno) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "delete from board where bno = ?";
		
		try {
			conn = ds.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}



}
