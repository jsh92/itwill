package com.sql.day2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class ProcedureTest {

	public static void main(String[] args) {
		//저장 프로시저 실행
		/*
		--exec personInsert('ccc','010-555-4444');
		
		create or replace procedure personInsert
		(p_name in varchar2,
		p_tel in varchar2)
		is
		begin
			insert into person(no, name, tel)
			values(person_seq.nextval, p_name,p_tel);
		
			commit;
		  exception when others then
		       raise_application_error(-20001, 'person 테이블에 insert 실패!');
		       rollback;
		end;
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 전화번호 입력!");
		String name=sc.nextLine();
		String tel=sc.nextLine();
		
		Connection con=null;
		CallableStatement cs=null;
		
		try {
			//1.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
			//2. con
			String url="jdbc:oracle:thin:@DESKTOP-25B9RCN:1521:xe";
			String user="javauser", pwd="javauser123";
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("db연결 성공!");
			
			//3. cs
			String sql="call personInsert(?,?)";
			cs=con.prepareCall(sql);
			
			//in parameter setting
			cs.setString(1, name);
			cs.setString(2, tel);
			
			//4. exec
			boolean bool=cs.execute();
			System.out.println("프로시저 실행 결과, bool="+bool);
			System.out.println("입력되었습니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(cs!=null) cs.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
