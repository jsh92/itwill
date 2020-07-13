package com.day16;

//단계별 상속
class GrandFather{
	GrandFather(){
		System.out.println("GrandFather 생성자!");
	}
	
	public void showGrandFather() {
		System.out.println("GrandFather 클래스의 메서드 호출");
	}
}//class

class Father extends GrandFather{
	Father(){
		System.out.println("Father 생성자!");
	}
	
	public void showFather() {
		System.out.println("Father 클래스의 메서드 호출");
	}
}//class

class Child2 extends Father{
	Child2(){
		System.out.println("Child2 생성자!");
	}
	
	public void showChild2() {
		System.out.println("Child2 클래스의 메서드 호출");
	}
}//class

public class Inheritance2 {

	public static void main(String[] args) {
		Child2 ch = new Child2();
		/*
		 부모 생성자부터 순차적으로 실행됨
		 GrandFather() => Father() => Child2() 
		 */
		System.out.println("\n\n");
		ch.showChild2();
		ch.showGrandFather();
		ch.showFather();
	}

}
