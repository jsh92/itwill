package com.day19;

class Parent{
	protected int x=100;
	
	public void method() {
		System.out.println("Parent메서드");
	}
}//class

class Child extends Parent{
	int x=200;
	
	public void method() {
		System.out.println("Child 메서드");
	}
}//class

public class PolymoTest {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.method();
		System.out.println("ch.x=" + ch.x+"\n"); //200
		
		Parent p = new Child();  //다형성
		p.method();  //자식의 오버라이딩 메서드
		System.out.println("p.x=" + p.x); //부모 참조변수로는
		//부모의 멤버만 접근 가능 => 100
				
	}

}
