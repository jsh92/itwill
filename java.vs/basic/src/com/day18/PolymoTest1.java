package com.day18;

class Parent{
	public void showInfo() {
		System.out.println("부모의 showInfo()메서드!");
	}
	
	public void parentFunc() {
		System.out.println("부모의 parentFunc 메서드");
	}
}//class

class Child extends Parent{
	public void showInfo() {
		System.out.println("자식의 오버라이딩 메서드!!");
	}
	
	public void childFunc() {
		System.out.println("자식 만의 메서드!!!!!");
	}
}//class

public class PolymoTest1 {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.showInfo();
		p.parentFunc();
		
		Child ch = new Child();
		ch.showInfo();
		ch.childFunc();
		ch.parentFunc();
		
		Parent p2 = new Child(); //다형성 이용
		p2.showInfo(); //자식의 오버라이딩 메서드 호출
		p2.parentFunc(); //부모의 참조변수로 부모의 메서드만 호출 가능
		//p2.childFunc(); //error: 자식 만의 메서드는 호출 불가
		/*
		 다형성(Polymorphism) - 여러 가지 형태를 가질 수 있는 능력
		 - 부모의 참조변수로 자식의 인스턴스를 참조할 수 있도록 함으로써
		 	다형성이 구현됨
		 - 이때 부모의 참조변수로는 부모의 멤버만 접근 가능
		   하지만 자식에서 오버라이딩 했다면 자식의 오버라이딩 메서드가 호출됨!!!
		   
		   부모  참조변수 = new 자식();
		  => 부모의 참조변수로 자식의 오버라이딩 메서드가 호출됨 		   	
		 */
	}

}
