package com.herbmall.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionPoolMgr {
	
	public ConnectionPoolMgr() {
		//����̹� �ε�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����!");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����!");
			e.printStackTrace();
		}
	}
	
	public Connection getConnection(String user, String upwd,
			String url) throws SQLException {
		//con
		Connection con = DriverManager.getConnection(url, user, upwd);
		System.out.println("db���� ���� con="+con);
		
		return con;
	}
	
	public Connection getConnection(String user, String upwd) 
			throws SQLException {
		String url="jdbc:oracle:thin:@DESKTOP-T2R3QU8:1521:xe";
		
		Connection con=getConnection(user, upwd, url);
		return con;
	}
	
	public Connection getConnection() 
			throws SQLException {
		String url="jdbc:oracle:thin:@DESKTOP-T2R3QU8:1521:xe";
		String user="herb", upwd="herb123";
		
		Connection con=getConnection(user, upwd, url);
		return con;
	}
	
	public void dbClose(Connection con, PreparedStatement ps,
			ResultSet rs) throws SQLException {
		if(rs!=null) rs.close();
		if(ps!=null) ps.close();
		if(con!=null) con.close();		
	}
	
	public void dbClose(Connection con, PreparedStatement ps) 
			throws SQLException {
		if(ps!=null) ps.close();
		if(con!=null) con.close();		
	}
	
	
}




