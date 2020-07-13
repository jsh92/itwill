package com.person.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import com.db.DBUtil;

/*
 DAO(Data Access Object)
 - 데이터베이스 작업을 전담하는 객체
 - CRUD 작업을 함
 
 C : Create => insert
 R : Read => select
 U : Update
 D : Delete
  */
public class PersonDAO {
	/*
	public int insertPerson(String name, String tel) 
			throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			//1,2
			con=DBUtil.getConnection();
			
			//3.
			String sql="insert into person(no, name, tel)" + 
					"values(person_seq.nextval, ?, ?)";
			ps=con.prepareStatement(sql);
			
			//in parameter setting
			ps.setString(1, name);
			ps.setString(2, tel);
			
			//4.
			int cnt = ps.executeUpdate();
			System.out.println("처리된 행의 개수:"+ cnt);
			
			return cnt;
		}finally {
			DBUtil.dbClose(ps, con);
		}
		
	}
	 */
	
	//[1] 매개변수가 DTO인 메서드
	//=> 입력, 수정시 사용
	public int insertPerson(PersonDTO dto) 
			throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			//1,2
			con=DBUtil.getConnection();
			
			//3.
			String sql="insert into person(no, name, tel)" + 
					"values(person_seq.nextval, ?, ?)";
			ps=con.prepareStatement(sql);
			
			//in parameter setting
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getTel());
			
			//4.
			int cnt = ps.executeUpdate();
			System.out.println("처리된 행의 개수:"+ cnt);
			
			return cnt;
		}finally {
			DBUtil.dbClose(ps, con);
		}
		
	}
	
	//[2] 반환타입이 DTO인 메서드
	//=> select 결과 레코드가 한 개인 경우 사용
	public PersonDTO selectByNo(int no) throws SQLException {
		//번호로 조회
		Connection con = null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		//결과 레코드 하나를 저장하기 위한  용도로 DTO 생성 
		PersonDTO dto = new PersonDTO();
		try {
			//1,2
			con=DBUtil.getConnection();
			
			//3.
			String sql="select * from person where no=?";
			ps=con.prepareStatement(sql);
			
			ps.setInt(1, no);
			
			//4.
			rs=ps.executeQuery();
			
			if(rs.next()) { //결과 레코드가 1개인 경우				
				String name=rs.getString("name");
				String tel=rs.getString("tel");
				Timestamp regdate=rs.getTimestamp("regdate");
				
				//레코드 하나는 하나의 DTO
				dto.setName(name);
				dto.setNo(no);
				dto.setRegdate(regdate);
				dto.setTel(tel);
			}
			System.out.println("번호로 조회한 결과 dto="+dto);
			
			return dto;
		}finally {
			DBUtil.dbClose(rs, ps, con);
		}
		
	}
	
	//[3] 반환타입이 ArrayList인 메서드
	//=> select 결과 레코드가 여러개인 경우 사용
	public ArrayList<PersonDTO> selectAll() throws SQLException {
		//전체 조회
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		//여러개 레코드(DTO)를 저장하기 위한 컬렉션 
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		
		try {
			//1,2
			con=DBUtil.getConnection();
			
			//3.
			String sql="select * from person order by no desc";
			ps=con.prepareStatement(sql);
			
			//4.
			rs=ps.executeQuery();
			while(rs.next()) {
				int no=rs.getInt(1);
				String name=rs.getString(2);
				String tel=rs.getString(3);
				Timestamp regdate=rs.getTimestamp(4);
			
				//하나의 레코드를 하나의 DTO에 저장하고
				PersonDTO dto = new PersonDTO(no, name, tel, regdate);
				
				//각 DTO를 ArrayList에 저장
				list.add(dto);
			}
			
			System.out.println("전체 조회 결과 list.size="+ list.size());
			
			return list; //여러개 DTO 가 들어있는 ArrayList를 리턴
		}finally {
			DBUtil.dbClose(rs, ps, con);
		}	
	}
	
	public int deletePerson(int no) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			//1,2
			con=DBUtil.getConnection();
			
			//3.
			String sql="delete from person" + 
					" where no=?";
			ps=con.prepareStatement(sql);
			
			//
			ps.setInt(1, no);
			
			//4.
			int cnt = ps.executeUpdate();
			System.out.println("삭제 결과, cnt="+cnt+", 매개변수 no="+no);
			
			return cnt;
		}finally {
			DBUtil.dbClose(ps, con);
		}
	}
	
	public int updatePerson(PersonDTO dto) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			//1,2
			con=DBUtil.getConnection();
			
			//3.
			String sql="update person" + 
					" set name=?, tel=?" + 
					" where no=?";
			ps=con.prepareStatement(sql);
			
			//
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getTel());
			ps.setInt(3, dto.getNo());
			
			//4. 
			int cnt = ps.executeUpdate();
			System.out.println("수정 결과, cnt="+cnt+", 매개변수 dto="+dto);
			
			return cnt;
		}finally {
			DBUtil.dbClose(ps, con);
		}
	}
	
	/**
	 * 이름으로 조회하는 메서드
	 * @param name
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<PersonDTO> selectByName(String name) throws SQLException {		
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		ArrayList<PersonDTO> list=new ArrayList<PersonDTO>();
		
		try{
			//1,2 con
			con=DBUtil.getConnection();
			
			//3. ps
			String sql="select * from person where name=?";
			ps=con.prepareStatement(sql);
			
			//
			ps.setString(1, name);
			
			//4
			rs=ps.executeQuery();
			while(rs.next()) {
				int no=rs.getInt("no");
				String tel=rs.getString("tel");
				Timestamp regdate = rs.getTimestamp("regdate");
				
				PersonDTO dto = new PersonDTO(no, name, tel, regdate);
				list.add(dto);
			}
			
			System.out.println("이름으로 조회 결과, list.size="+list.size()
				+ ", 매개변수  name="+name);
			
			return list;
		}finally {
			DBUtil.dbClose(rs, ps, con);
		}
		
	}
	
}






