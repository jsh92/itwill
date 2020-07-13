package com.day14;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 나이, 전화번호 입력!");
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String tel = sc.nextLine();
		
		Person p = new Person(name, age, tel);
		p.showInfo();
		
		//getter/setter 이용 연습
		//멤버변수의 값 변경
		p.setName("홍길동");
		p.setAge(25);
		p.setTel("010-100-3000");
		
		//멤버변수의 값 읽어오기
		System.out.println("\n변경된 이름 : " + p.getName());
		System.out.println("나이 : " + p.getAge());
		System.out.println("전화번호 : " + p.getTel());
		
	}

}
