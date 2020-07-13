package com.herbmall.member.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.herbmall.board.model.BoardVO;
import com.herbmall.db.ConnectionPoolMgr2;

public class MemberDAO {
	private ConnectionPoolMgr2 pool;
	
	public MemberDAO(){
		pool=new ConnectionPoolMgr2();
	}
	
	public int insertMember(MemberVO vo) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			con=pool.getConnection();
			
			String sql="insert into member(no, userid, name, pwd, email,"
					+ " hp, zipcode, address, addressDetail)" + 
					" values(member_seq.nextval, ?,?,?,?,?,?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setString(1, vo.getUserid());
			ps.setString(2, vo.getName());
			ps.setString(3, vo.getPwd());
			ps.setString(4, vo.getEmail());
			ps.setString(5, vo.getHp());
			ps.setString(6, vo.getZipcode());
			ps.setString(7, vo.getAddress());
			ps.setString(8, vo.getAddressDetail());
			
			int cnt=ps.executeUpdate();
			System.out.println("회원가입 결과, cnt=" + cnt+", 매개변수 vo="+vo);
			
			return cnt;
		}finally {
			pool.dbClose(con, ps);
		}
	}
	
	public int duplicateId(String userid) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		int result=0;
		try {
			//1,2
			con=pool.getConnection();
			
			//3
			String sql="select count(*) from member" + 
					" where userid=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, userid);
			
			rs=ps.executeQuery();			
			if(rs.next()) {
				int count=rs.getInt(1);
				if(count>0) {  //해당 아이디가 이미 존재
					result=MemberService.EXIT_ID;
				}else {
					result=MemberService.NON_EXIT_ID;					
				}
			}
			
			System.out.println("아이디 중복확인 결과 result="+result);
			return result;
		}finally {
			pool.dbClose(con, ps, rs);
		}
	}
	
	public int loginCheck(String userid, String pwd) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		int result=0;
		try {
			//1,2
			con=pool.getConnection();
			
			//3
			String sql="select pwd from member" + 
					" where userid=? and outdate is null";
			ps=con.prepareStatement(sql);
			ps.setString(1, userid);
			
			rs=ps.executeQuery();
			if(rs.next()) {
				String dbPwd=rs.getString(1);
				if(dbPwd.equals(pwd)) { //로그인 성공
					result=MemberService.LOGIN_OK;
				}else { //비밀번호 불일치
					result=MemberService.PWD_DISAGREE;
				}
			}else {  //해당 아이디가 없는 경우
				result=MemberService.ID_NONE;
			}
			
			System.out.println("로그인 처리 결과 result="+result
					+", 매개변수 userid="+userid+", pwd="+pwd);
			
			return result;
		}finally {
			pool.dbClose(con, ps, rs);
		}
	}
	
	public MemberVO selectMember(String userid) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		MemberVO vo = new MemberVO();
		try {
			con=pool.getConnection();
			String sql="select * from member where userid = ?";
			ps=con.prepareStatement(sql);
			ps.setString(1, userid);
			
			rs=ps.executeQuery();
			while(rs.next()) {
				int no = rs.getInt("no");
				String name=rs.getString("name");
				String pwd = rs.getString("pwd");
				String email = rs.getString("email");
				String hp = rs.getString("hp");
				String zipcode = rs.getString("zipcode");
				String address = rs.getString("address");
				String addressdetail = rs.getString("addressdetail");
				Timestamp regdate = rs.getTimestamp("regdate");
				int mileage = rs.getInt("mileage");
			    Timestamp outdate = rs.getTimestamp("outdate");
				
			    vo = new MemberVO(no, userid, name, pwd, email, hp, zipcode,address,addressdetail, regdate, mileage,outdate);
			    
			}
			return vo;
		}finally {
			pool.dbClose(con, ps, rs);
		}
		
	}
	
	public int updateInfo(MemberVO vo) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con=pool.getConnection();
			String sql="update member" + 
					" set zipcode=?, address=?,addressDetail=?,hp=?,email=?" + 
					" where userid=?";
			ps=con.prepareStatement(sql);
			
			ps.setString(1, vo.getZipcode());
			ps.setString(2, vo.getAddress());
			ps.setString(3, vo.getAddressDetail());
			ps.setString(4, vo.getHp());
			ps.setString(5, vo.getEmail());
			ps.setString(6, vo.getUserid());
			
			int cnt = ps.executeUpdate();
			return cnt;
			
		}finally {
			pool.dbClose(con, ps);
		}
	}
	
	public int deleteMem(String userid) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			con=pool.getConnection();
			String sql="update member" + 
					" set outdate=sysdate" + 
					" where userid=?";
			ps=con.prepareStatement(sql);
			Date date = new Date();
			ps.setString(1, userid);
			
			int cnt = ps.executeUpdate();
			if(cnt>0) {
				System.out.println("outdate에 입력 성공");
			}else {
				System.out.println("outdate에 입력 실패");
			}
			
			return cnt;
		}finally {
			pool.dbClose(con, ps);
		}
		
	}
	
	
	
}








