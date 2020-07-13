package com.day15;

class BBB{
	static int cv=1;  //static 변수의 명시적 초기화
	int iv = 10;  //인스턴스 변수의 명시적 초기화
	
	static {
		cv = 2;  //static 초기화 블럭에서 static변수 초기화
		System.out.println("static 초기화 블럭 호출! cv = " + cv);
		//0 => 1 => 2
	}
	
	BBB(){
		iv = 20;  //생성자에서 인스턴스 변수 초기화
		System.out.println("생성자 호출! iv = " + iv);
		//0 => 10 => 20
	}
}//class

public class InitTest {

	public static void main(String[] args) {
		System.out.println("InitTest 클래스의 main메서드 호출!!");
		
		System.out.println("BBB의 cv = " + BBB.cv);
		
		BBB b = new BBB();
		System.out.println("BBB 객체 b의 iv = " + b.iv);
		
		/*
		 [1] static변수의 초기화 시점
		 	- 해당 클래스가 메모리에 로드되면 static변수가 생성되고
		 	static 초기화 블럭이 단 한번 호출되어 초기화됨  
		 [2] 인스턴스 변수의 초기화 시점
		 	- 인스턴스가 생성될때 인스턴스별로 인스턴스 변수가 생성되고
		 	생성자가 호출되어 초기화됨
		 
		 ※※ 클래스 변수는 항상 인스턴스 변수보다 먼저 생성되고 초기화 됨

		 ※ static 변수의 초기화 순서
		 default 값 => 명시적 초기화 => static 초기화 블럭
		 
		 ※ 인스턴스 변수의 초기화 순서
		 default 값 => 명시적 초기화 => 생성자  	
		*/
	}

}
