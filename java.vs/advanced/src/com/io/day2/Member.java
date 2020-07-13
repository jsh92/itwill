package com.io.day2;

import java.io.Serializable;

//직렬화 가능 클래스(네트워크 통해 전송한다고 표시)
public class Member implements Serializable {
	private String userid;
	transient private String pwd;//직렬화 대상에서 제외(비밀번호는 보내지 않겠다, pwd는 null이 출력됨)

	private int age;
	
	public Member() {
		super();
	}

	public Member(String userid, String pwd, int age) {
		super();
		this.userid = userid;
		this.pwd = pwd;
		this.age = age;
	} 
	
	public void showInfo() {
		System.out.println("-------" + userid + "의 정보-------");
		System.out.println("아이디 : " + userid);
		System.out.println("비밀번호 : " + pwd);
		System.out.println("나이 : " + age);
	}
	
	
}
