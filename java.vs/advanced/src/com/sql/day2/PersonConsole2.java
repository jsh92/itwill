package com.sql.day2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Scanner;

import com.db.DBUtil;
import com.person.model.PersonDAO;
import com.person.model.PersonDTO;

public class PersonConsole2 {
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
					case "2":
						searchByNo();
						break;
					case "3":
						searchByName();
						break;
					case "4":
						searchAll();
						break;
					case "5":
						update();
						break;
					case "6":
						delete();
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

	private static void delete() throws NumberFormatException, SQLException {
		//1. 
		System.out.println("번호 입력!");
		String sNo = sc.nextLine();
		if(sNo==null || sNo.isEmpty()) {
			System.out.println("번호를 입력해야 합니다!");
			return;
		}
		
		//2. 
		PersonDAO dao = new PersonDAO();
		int cnt=dao.deletePerson(Integer.parseInt(sNo));
		
		//3. 
		String result = cnt>0? "삭제 성공!" : "삭제 실패!";
		System.out.println(result);
	}

	private static void update() throws SQLException {
		//1.
		System.out.println("번호, 이름, 전화번호 입력!");
		String sNo=sc.nextLine();
		String name=sc.nextLine();
		String tel=sc.nextLine();
		if(sNo==null || sNo.isEmpty()) {
			System.out.println("수정할 번호를 입력해야 합니다!!");
			return;
		}
		
		//2.
		PersonDAO dao = new PersonDAO();
		PersonDTO dto = new PersonDTO();
		dto.setName(name);
		dto.setNo(Integer.parseInt(sNo));
		dto.setTel(tel);
		int cnt=dao.updatePerson(dto);
		
		//3.
		String result="";
		if(cnt>0) {
			result="수정 성공!";
		}else {
			result="수정 실패!";
		}
		
		System.out.println(result);
	}

	private static void searchByName() throws SQLException {
		//1.
		System.out.println("이름 입력!");
		String name = sc.nextLine();
		
		//2.
		PersonDAO dao = new PersonDAO();
		ArrayList<PersonDTO> list = dao.selectByName(name);
		
		//3.
		if(list==null || list.isEmpty()) {
			System.out.println("해당 데이터가 존재하지 않습니다!");
			return;
		}
		
		for(int i=0;i<list.size();i++) {
			PersonDTO dto=list.get(i);
			
			System.out.println(dto.getNo()+"\t" + dto.getName()
				+"\t" + dto.getTel()+"\t" + dto.getRegdate());
		}//for
		
	}

	private static void searchByNo() throws NumberFormatException, SQLException {
		//1. 사용자 입력받기
		System.out.println("번호 입력!");
		String sNo = sc.nextLine();
		
		//2. db작업
		PersonDAO dao = new PersonDAO();
		PersonDTO dto = dao.selectByNo(Integer.parseInt(sNo));
		
		//3. 결과처리(화면처리)
		System.out.println("이름:"+ dto.getName());
		System.out.println("전화번호:"+ dto.getTel());
		System.out.println("등록일:"+ dto.getRegdate()+"\n");
	}

	private static void searchAll() throws SQLException {
		//1.		
		//2.
		PersonDAO dao = new PersonDAO();
		ArrayList<PersonDTO> list =dao.selectAll();
		
		//3.
		for(int i=0;i<list.size();i++) {
			PersonDTO dto=list.get(i);
			
			System.out.println(dto.getNo()+"\t"+dto.getName()
				+"\t"+dto.getTel()+"\t"+ dto.getRegdate());		
		}//for
		
	}

	private static void writePerson() throws SQLException {
		//1. 사용자 입력받기
		System.out.println("이름, 전화번호 입력하세요");
		String name=sc.nextLine();
		String tel=sc.nextLine();
		
		//2. db작업
		PersonDAO dao = new PersonDAO();
		PersonDTO dto= new PersonDTO();
		dto.setName(name);
		dto.setTel(tel);
		int cnt=dao.insertPerson(dto);
		
		//3. 화면 처리(결과 처리)
		String result=cnt>0? "입력 성공!":"입력 실패!";
		System.out.println(result);
	}

	
	private static void showMenu() {
		System.out.println("--------------------------Main Menu----------------------");
		System.out.println("1.등록 2.검색(번호로) 3.검색(이름으로) 4.전체조회 5.수정 6.삭제 7.종료");
		System.out.println("-------------------------------------------------------------");
	}

}
