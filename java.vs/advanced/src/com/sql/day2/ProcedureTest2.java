package com.sql.day2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class ProcedureTest2 {

	public static void main(String[] args) {
		//프로시저 - out 매개변수 이용
		/*
		 create or replace procedure infoProf_proc
			(v_profno   in professor.profno%type,
			v_name  out professor.name%type,
			v_pay out professor.pay%type)
			is
			begin
			    select name, pay into v_name, v_pay
			    from professor
			    where profno=v_profno;
			end; 
		  */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("교수번호 입력!");
		int profno = sc.nextInt();
		
		Connection con=null;
		CallableStatement cs=null;
		try {
			//1.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
			//2. con
			String url="jdbc:oracle:thin:@DESKTOP-T2R3QU8:1521:xe";
			String user="hr", pwd="hr123";
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("db연결 성공");
			
			//3. cs
			String sql="call infoProf_proc(?,?,?)";
			cs=con.prepareCall(sql);
			
			//in parameter setting
			cs.setInt(1, profno);
			
			//out parameter 등록
			cs.registerOutParameter(2, oracle.jdbc.OracleTypes.VARCHAR);
			cs.registerOutParameter(3, oracle.jdbc.OracleTypes.NUMBER);
			
			//4. 
			boolean bool=cs.execute();
			System.out.println("프로시저 실행 결과 bool="+bool);
			
			//out parameter 값 읽어오기
			String name=cs.getString(2);
			int pay=cs.getInt(3);
			
			System.out.println("교수이름 : " + name);
			System.out.println("급여 : " + pay);			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//5.
			try {
				if(cs!=null) cs.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}









