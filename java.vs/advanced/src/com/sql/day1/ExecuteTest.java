package com.sql.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExecuteTest {

	public static void main(String[] args) {
		//table, sequence 만들기

		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			//1.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
			//2.
			String url="jdbc:oracle:thin:@DESKTOP-25B9RCN:1521:xe";
			String user="javauser", pwd="javauser123";			
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("db연결 성공!");
			
			//3.
			String sql="create table pd2("
				+ "no	number	primary key,"	
				+ "pdname	varchar2(50),"	
				+ "price	number,"	
				+ "regdate	date default sysdate"
				+ ")";	
			ps=con.prepareStatement(sql);
			
			//4. 
			boolean bool=ps.execute();
			//=> select인 경우는 true를 리턴, 나머지는 false를 리턴
			
			System.out.println("table 생성 실행 결과 bool="+bool);
			
			sql="create sequence pd2_seq"
				+" start with 1"	
				+" increment by 1"	
				+" nocache";
			
			ps=con.prepareStatement(sql);
			
			bool=ps.execute();			
			
			System.out.println("sequence생성 결과 bool="+bool);
			System.out.println("table, sequence가 생성됨!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps!=null) ps.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
