package com.sql.day1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class SelectTest {

	public static void main(String[] args) {
		//person 테이블 전체 조회
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공!");
			
			//2. db서버와 연결하기 위한 Connection객체 생성
			String url="jdbc:oracle:thin:@DESKTOP-25B9RCN:1521:xe";
			String user="javauser", password="javauser123";
			con=DriverManager.getConnection(url, user, password);
			System.out.println("db연결 성공!");
			
			//3. sql문장을 처리하기 위한 PreparedStatement객체 생성
			String sql="select * from person order by no desc";
			ps=con.prepareStatement(sql);
			
			//4. 실행
			rs=ps.executeQuery();
			System.out.println("번호\t이름\t전화번호\t\t등록일\t\t날짜2");
			System.out.println("----------------------------------------------------------");
			while(rs.next()) {
				int no=rs.getInt("no");
				String name=rs.getString("name");
				//String tel=rs.getString("tel");
				String tel=rs.getString(3); //컬럼 인덱스 사용도 가능
				Date regdate=rs.getDate("regdate");
				Timestamp regdate2=rs.getTimestamp("regdate");
				
				System.out.println(no+"\t" + name+"\t"
						+ tel+"\t" + regdate +"\t" + regdate2);				
			}			
		} catch (ClassNotFoundException e) {
			System.out.println("class not found!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("sql 예외!");
			e.printStackTrace();
		}finally {
			//5. 자원반납, 해제
			try {
				if(rs!=null) rs.close();
				if(ps!=null) ps.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

	}

}
