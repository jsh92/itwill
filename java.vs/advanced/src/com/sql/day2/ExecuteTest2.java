package com.sql.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExecuteTest2 {

	public static void main(String[] args) {
		//수정 - execute메서드 이용
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 번호를 입력하세요");
		int no = sc.nextInt();
		
		System.out.println("이름, 전화번호를 입력하세요");
		sc.nextLine();
		String name=sc.nextLine();
		String tel=sc.nextLine();
		
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
			//2. db서버와 연결하기 위한 Connection객체 생성
			String url="jdbc:oracle:thin:@DESKTOP-25B9RCN:1521:xe";
			String user="javauser", pwd="javauser123";
			con=DriverManager.getConnection(url, user, pwd);
						
			//3. sql문장을 처리하기 위한 PreparedStatement객체 생성
			String sql="update person"
					+ " set name=?,tel=?"  
					+ " where no=?";
			ps=con.prepareStatement(sql);
			
			//in parameter setting
			ps.setString(1, name);
			ps.setString(2, tel);
			ps.setInt(3, no);
			
			//4.
			boolean bool=ps.execute();
			System.out.println("update 결과 bool="+bool);
			if(!bool) {
				int cnt=ps.getUpdateCount(); //처리된 행의 개수 리턴
				System.out.println(cnt+"개 행이 수정되었습니다.");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//5.
			try {
				if(ps!=null) ps.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
