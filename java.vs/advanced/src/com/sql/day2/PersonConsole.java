package com.sql.day2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Scanner;

import com.db.DBUtil;

public class PersonConsole {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while(true) {
			showMenu();
			try {
				String type=sc.nextLine();
				switch(type) {
					case "1":
						writePerson();
						break;
					case "4":
						searchAll();
						break;
					case "7":
						System.out.println("종료합니다.");
						System.exit(0);
					default:
						System.out.println("잘못 입력!");
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}//while
		
	}

	private static void searchAll() throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
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
				
				System.out.println(no+"\t"+name+"\t"+tel+"\t"+regdate);				
			}
		}finally {
			DBUtil.dbClose(rs, ps, con);
		}		
	}

	private static void writePerson() throws SQLException {
		System.out.println("이름, 전화번호 입력하세요");
		String name=sc.nextLine();
		String tel=sc.nextLine();
		
		int cnt=insertPerson(name, tel);
		String result=cnt>0? "입력 성공!":"입력 실패!";
		System.out.println(result);
	}

	private static int insertPerson(String name, String tel) 
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

	private static void showMenu() {
		System.out.println("--------------------------Main Menu----------------------");
		System.out.println("1.등록 2.검색(번호로) 3.검색(이름으로) 4.전체조회 5.수정 6.삭제 7.종료");
		System.out.println("-------------------------------------------------------------");
	}

}
