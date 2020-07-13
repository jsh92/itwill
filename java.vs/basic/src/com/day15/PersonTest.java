package com.day15;

public class PersonTest {

	public static void main(String[] args) {
		System.out.println("PersonTest 클래스의 main() 메서드!!");
		System.out.println("count = "  + Person.count+"\n");
		
		Person hong = new Person("홍길동", 20);
		hong.display();
		
		Person kim = new Person("김길동", 25);
		kim.display();
		
	}

}




