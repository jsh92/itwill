package com.sql.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class ResultSetTest {

	public static void main(String[] args) {
		//ResultSet의 커서를 자유롭게 이동시키기 위한 설정
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			//1. 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공!");
			
			//2. 
			String url="jdbc:oracle:thin:@DESKTOP-25B9RCN:1521:xe";
			String user="javauser", pwd="javauser123";			
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("db연결 성공!");
			
			//3. 
			String sql="select * from person order by no";
			
			//ResultSet의 커서를 자유롭게 이동시키기 위한 설정
			ps=con.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			
			//4. 
			rs = ps.executeQuery();
			rs.afterLast(); //커서를 마지막 다음행으로 이동
			while(rs.previous()) {
				int no =rs.getInt(1);
				String name=rs.getString(2);
				String tel=rs.getString(3);
				Timestamp regdate=rs.getTimestamp(4);
				
				System.out.println(no+"\t"+name+"\t"+tel+"\t"+regdate);
			}
			
			rs.absolute(2); //2번째 행으로 이동
			System.out.println("\n===2번째 행의 내용===\n"
					+rs.getInt(1)+"\t" + rs.getString(2));
			System.out.println("현재 행 : "+rs.getRow());
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//5. 
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
