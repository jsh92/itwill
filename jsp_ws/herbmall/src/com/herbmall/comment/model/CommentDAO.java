package com.herbmall.comment.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.herbmall.db.ConnectionPoolMgr2;

public class CommentDAO {
	private ConnectionPoolMgr2 pool;
	
	public CommentDAO() {
		pool = new ConnectionPoolMgr2();
	}
	
	public int uploadComment(CommentVO vo) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con=pool.getConnection();
			String sql="insert into comments(no, name, pwd, content,bdno)\r\n" + 
					"values(comments_seq.nextval,?,?,?,?)";
			ps=con.prepareStatement(sql);
			
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getPwd());
			ps.setString(3, vo.getContent());
			ps.setInt(4, vo.getBdNo());
			
			int cnt = ps.executeUpdate();
			return cnt;
		}finally {
			pool.dbClose(con, ps);
		}
	}
	
	public List<CommentVO> showComment() throws SQLException{
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<CommentVO> list = new ArrayList<CommentVO>();
		try {
			con=pool.getConnection();
			String sql="select * from comments";
			ps=con.prepareStatement(sql);
			
			rs=ps.executeQuery();
			
			while(rs.next()) {
				CommentVO vo = new CommentVO();
				vo.setNo(rs.getInt("no"));
				vo.setName(rs.getString("name"));
				vo.setPwd(rs.getString("pwd"));
				vo.setContent(rs.getString("content"));
				vo.setRegdate(rs.getTimestamp("regdate"));
				vo.setBdNo(rs.getInt("bdNO"));
				list.add(vo);		
			}
			return list;
		}finally {
			pool.dbClose(con, ps, rs);
		}
		
		
	}
}
