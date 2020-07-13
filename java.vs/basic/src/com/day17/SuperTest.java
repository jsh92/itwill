package com.day17;

class Parent{
	protected int x=10;
}//class

class Child extends Parent{
	public void method() {
		System.out.println("x="+x);	//10
		System.out.println("this.x="+ this.x);	//10
		System.out.println("super.x="+ super.x);	//10
		
		/*
		 this	- 자신의 멤버를 참조하는 this 
		 this() - 자신의 생성자를 호출하는 this()
		 
		 super	- 부모의 멤버를 참조하는 super
		 super()- 부모의 생성자를 호출하는 super()
		*/
	}
}//class

public class SuperTest {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.method();
	}

}
