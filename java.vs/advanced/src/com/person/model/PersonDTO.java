package com.person.model;

import java.sql.Timestamp;

/*
 DTO(Data Transfer Object) 
 - 데이터 전달 단위
 - 매개변수와 반환타입에 사용됨
 - 테이블의 컬럼들을 멤버변수로 갖는다
 - private멤버변수, public getter/setter => 필수
  */
public class PersonDTO {
	//1. 멤버변수 - 필수
	private int no;
	private String name; //길동
	private String tel;//010-100-1000
	private Timestamp regdate;
	
	//2. 생성자 - 선택 
	public PersonDTO() {
		super();
	}

	public PersonDTO(int no, String name, String tel, Timestamp regdate) {
		super();
		this.no = no;
		this.name = name;
		this.tel = tel;
		this.regdate = regdate;
	}

	//3. getter/setter - 필수
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Timestamp getRegdate() {
		return regdate;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}

	//toString() 오버라이드 - 선택
	@Override
	public String toString() {
		return "PersonDTO [no=" + no + ", name=" + name + ", tel=" + tel + ", regdate=" + regdate + "]";
	}
	
	
	  
}
