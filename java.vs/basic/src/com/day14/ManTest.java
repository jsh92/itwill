package com.day14;

public class ManTest {

	public static void main(String[] args) {
		Man m = new Man();
		//m.age = 20;  //error: private
		m.setAge(20); //setter를 이용해 멤버변수의 값 할당
		m.height = 180;
		
		//System.out.println("나이 : " + m.age);  //error
		int age=m.getAge();
		System.out.println("나이 : " + age);  
		
		System.out.println("나이 : " + m.getAge());  //getter를 이용해
												//멤버변수의 값을 읽어온다
		System.out.println("키 : " + m.height);		

		Man2 m2 = new Man2();
		m2.setAge(25);
		System.out.println("\n\n나이는 " +  m2.getAge());
		
		//m2.age=-5;
		m2.setAge(-5);
		System.out.println("나이는 " + m2.getAge());
		
	}

}
