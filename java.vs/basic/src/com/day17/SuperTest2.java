package com.day17;

class Parent2{
	protected int x=10;
	
}//class

class Child2 extends Parent2{
	private int x=20;
	
	public void method() {
		System.out.println("x="+x);	//20
		System.out.println("this.x="+ this.x);	//20
		System.out.println("super.x="+ super.x);//10		
	}
}//class

public class SuperTest2 {
	public static void main(String[] args) {
		Child2 ch = new Child2();
		ch.method();
	}

}
