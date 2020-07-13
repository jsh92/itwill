package com.day15;

public class Person {
	private String name;
	private int age;
	static int count;
	//=> static 변수(클래스 변수)
	/*
	 - 클래스 차원에서 단 하나만 생성되어 모든 객체가 공유한다
	 - 해당 클래스가 메모리에 로드될 때 생성됨
	 
	 ※ static 변수나 static 메서드
	 - 클래스의 복사물인 인스턴스로 참조하지 않고 클래스 차원에서 바로 호출이 가능
	 - 클래스에 대한 인스턴스를 생성하지 않아도 해당 클래스의 메서드를 
	 	호출해서 사용할 수 있음
	 - 클래스의 이름으로 접근	  
	*/
	
	/*
	※ 멤버변수 - 클래스 영역에서 선언된 변수
	[1] 인스턴스 변수 - static이 붙지 않은 멤버 변수
	[2] static 변수(클래스 변수) - static이 붙은 멤버변수
	*/
	
	public Person(String name, int age){
		this.name=name;
		this.age=age;
		
		System.out.println(++count + "번째 객체 생성됨!");
	}
	
	public void display() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "\n");		
	}
}
