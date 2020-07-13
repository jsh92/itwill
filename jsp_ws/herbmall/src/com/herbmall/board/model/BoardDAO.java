package com.herbmall.board.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.herbmall.db.ConnectionPoolMgr;

public class BoardDAO {
	private ConnectionPoolMgr pool;
	
	public BoardDAO() {
		pool=new ConnectionPoolMgr();
	}
	
	/**
	 * 글등록
	 * @param vo
	 * @return
	 * @throws SQLException
	 */
	public int insertBoard(BoardVO vo) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			//1,2
			con=pool.getConnection();
			
			//3
			String sql="insert into board(no, name, pwd, title, "
					+ " email, content)" + 
					" values(board_seq.nextval, ?,?,?,?,?)";
			ps=con.prepareStatement(sql);
			
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getPwd());
			ps.setString(3, vo.getTitle());
			ps.setString(4, vo.getEmail());
			ps.setString(5, vo.getContent());
			
			int cnt=ps.executeUpdate();
			System.out.println("글 등록 결과, cnt="+cnt+", 매개변수 vo="+vo);
			
			return cnt;
		}finally {
			pool.dbClose(con, ps);
		}
	}
	
	/**
	 * 글 목록
	 * @return
	 * @throws SQLException
	 */
	public List<BoardVO> selectAll(String condition, String keyword) 
			throws SQLException{
		/*
		 ※ 검색의 경우 
		 	select * from board 
			where title like '%안녕%';
			select * from board 
			where name like '%길%';
			select * from board 
			where content like '%내용%';
		*/
		
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		List<BoardVO> list = new ArrayList<BoardVO>();
		try {
			//1,2
			con=pool.getConnection();
			
			//3
			String sql="select * from board";
			if(keyword!=null && !keyword.isEmpty()) { //검색의 경우
				sql+=" where "+ condition +" like '%' || ? || '%'";
			}
			
			sql+=" order by no desc";
			
			ps=con.prepareStatement(sql);
			
			if(keyword!=null && !keyword.isEmpty()) { //검색의 경우
				ps.setString(1, keyword);				
			}
			
			rs=ps.executeQuery();
			while(rs.next()) {
				int no=rs.getInt("no");
				String title=rs.getString("title");
				String name=rs.getString("name");
				String pwd=rs.getString("pwd");
				String email=rs.getString("email");
				String content=rs.getString("content");
				int readcount=rs.getInt("readcount");
				Timestamp regdate=rs.getTimestamp("regdate");
				
				BoardVO vo = new BoardVO(no, name, pwd, title, email,
						regdate, readcount, content);
				list.add(vo);
			}
			
			System.out.println("글목록 결과 list.size="+list.size()
				+ ", 매개변수 condition="+condition
				+", keyword="+keyword);
			
			return list;
		}finally {
			pool.dbClose(con, ps, rs);
		}
	}
	
	/**
	 * 글 상세보기
	 * @param no
	 * @return
	 * @throws SQLException
	 */
	public BoardVO selectByNo(int no) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		BoardVO vo=new BoardVO();
		try {
			//1,2
			con=pool.getConnection();
			
			//3
			String sql="select * from board where no=?";
			ps=con.prepareStatement(sql);
			
			ps.setInt(1, no);
			
			//4
			rs=ps.executeQuery();
			if(rs.next()) {
				String title=rs.getString("title");
				String name=rs.getString("name");
				String pwd=rs.getString("pwd");
				String email=rs.getString("email");
				String content=rs.getString("content");
				Timestamp regdate=rs.getTimestamp("regdate");
				int readcount=rs.getInt("readcount");
				
				vo.setContent(content);
				vo.setEmail(email);
				vo.setName(name);
				vo.setNo(no);
				vo.setPwd(pwd);
				vo.setReadcount(readcount);
				vo.setRegdate(regdate);
				vo.setTitle(title);
			}
			
			System.out.println("글 상세보기 결과, vo="+vo+", 매개변수no="+no);
			
			return vo;
		}finally{
			pool.dbClose(con, ps, rs);
		}
	}
	
	/**
	 * 글 수정
	 * @param vo
	 * @return
	 * @throws SQLException
	 */
	public int updateBoard(BoardVO vo) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			//1,2
			con=pool.getConnection();
			
			//3
			String sql="update board" + 
					" set name=?,title=?,email=?,content=?" + 
					" where no=? and pwd=?";
			ps=con.prepareStatement(sql);
			
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getTitle());
			ps.setString(3, vo.getEmail());
			ps.setString(4, vo.getContent());
			ps.setInt(5, vo.getNo());
			ps.setString(6, vo.getPwd());
			
			int cnt=ps.executeUpdate();
			System.out.println("글 수정 결과, cnt="+cnt+", 매개변수 vo="+vo);
			
			return cnt;
		}finally {
			pool.dbClose(con, ps);
		}
	}
	
	public int updateReadCount(int no) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			con=pool.getConnection();
			
			String sql="update board" + 
					" set readcount=readcount+1" + 
					" where no=?";
			ps=con.prepareStatement(sql);
			
			ps.setInt(1, no);
			
			int cnt=ps.executeUpdate();
			System.out.println("조회수 증가 결과, cnt="+cnt+", 매개변수 no="+no);
			
			return cnt;
		}finally {
			pool.dbClose(con, ps);
		}
	}
	
	public List<BoardVO> selectMainNotice() throws SQLException {
		/*
		select A.*
		from
		(
		    select no, title
		    from board order by no desc
		)A
		where rownum<=6 */
		
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		List<BoardVO> list = new ArrayList<BoardVO>();
		try {
			//1,2
			con=pool.getConnection();
			
			//3
			String sql="select A.*" + 
					"		from" + 
					"		(" + 
					"		    select no, title" + 
					"		    from board order by no desc" + 
					"		)A" + 
					"		where rownum<=6";
			
			ps=con.prepareStatement(sql);
						
			rs=ps.executeQuery();
			while(rs.next()) {
				BoardVO vo = new BoardVO();
				
				vo.setNo(rs.getInt("no"));
				vo.setTitle(rs.getString("title"));
				
				list.add(vo);
			}
			
			System.out.println("메인 공지사항 조회 결과 list.size="
					+list.size());
			
			return list;
		}finally {
			pool.dbClose(con, ps, rs);
		}
		
	}
	
	
	
}





