package com.day14;

public class Person {
	//1. 멤버변수
	private String name;
	private int age;
	private String tel;
	
	//2. 생성자
	public Person(String name, int age, String tel) {
		this.name=name;
		this.age=age;
		this.tel=tel;
	}
	
	//3. getter/setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel=tel;
	}
	
	//4. 메서드
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("전화번호 : " + tel);		
	}
}
