package com.sql.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�, ��ȭ��ȣ�� �Է��ϼ���");
		String name=sc.nextLine();
		String tel=sc.nextLine();
		
		//jdbc�̿��Ͽ� db�� �����Ͽ� person ���̺��� insert
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			//1. ����̹� ã��(����̹� �ε�)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����!");
			
			//2. db������ �����ϱ� ���� Connection��ü ����
			String url="jdbc:oracle:thin:@DESKTOP-25B9RCN:1521:xe";
			String user="javauser", uPwd="javauser123";
			con=DriverManager.getConnection(url, user, uPwd);
			System.out.println("db���� ����!");
			
			//3. sql������ ó���ϱ� ���� PreparedStatement��ü ����
			String sql="insert into person(no, name, tel)" + 
				"values(person_seq.nextval, ?, ?)";
			ps=con.prepareStatement(sql);
			
			//in parameter setting
			ps.setString(1, name);
			ps.setString(2, tel);
			
			//4. ����
			int cnt=ps.executeUpdate();
			System.out.println("ó����(�Էµ�) ���� ���� : " + cnt);
		} catch (ClassNotFoundException e) {
			System.out.println("class not found!"); 
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("sql���� �߻�!");
			e.printStackTrace();
		}finally {
			//5.�ڿ��ݳ�, ����
			try {
				if(ps!=null) ps.close();
				if(con!=null) con.close();				
			} catch (SQLException e) {
				e.printStackTrace();
			}			
		}
			
		
	}

}