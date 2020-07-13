package com.herbmall.test;

public class Person {
	//싱글톤 패턴 - 인스턴스를 하나만 생성하는 디자인 패턴
	private static Person instance;
	
	//private 생성자
	private Person() {
		
	}
	
	//static 메서드
	public static Person getInstance() {
		if(instance==null) {
			instance=new Person();
		}
		return instance;
	}
	
	public void showInfo() {
		System.out.println("Person 클래스의 메서드!");
	}
	
}
