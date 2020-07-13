package com.sql.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 전화번호를 입력하세요");
		String name=sc.nextLine();
		String tel=sc.nextLine();
		
		//jdbc이용하여 db에 연결하여 person 테이블에 insert
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			//1. 드라이버 찾기(드라이버 로딩)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공!");
			
			//2. db서버와 연결하기 위한 Connection객체 생성
			String url="jdbc:oracle:thin:@DESKTOP-25B9RCN:1521:xe";
			String user="javauser", uPwd="javauser123";
			con=DriverManager.getConnection(url, user, uPwd);
			System.out.println("db연결 성공!");
			
			//3. sql문장을 처리하기 위한 PreparedStatement객체 생성
			String sql="insert into person(no, name, tel)" + 
				"values(person_seq.nextval, ?, ?)";
			ps=con.prepareStatement(sql);
			
			//in parameter setting
			ps.setString(1, name);
			ps.setString(2, tel);
			
			//4. 실행
			int cnt=ps.executeUpdate();
			System.out.println("처리된(입력된) 행의 개수 : " + cnt);
		} catch (ClassNotFoundException e) {
			System.out.println("class not found!"); 
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("sql예외 발생!");
			e.printStackTrace();
		}finally {
			//5.자원반납, 해제
			try {
				if(ps!=null) ps.close();
				if(con!=null) con.close();				
			} catch (SQLException e) {
				e.printStackTrace();
			}			
		}
			
		
	}

}
