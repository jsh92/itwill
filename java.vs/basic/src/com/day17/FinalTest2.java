package com.day17;

class Parent4{
	public void method1() {
		System.out.println("method1()!!");
	}
	
	public final void method2() {
		System.out.println("method2()!!");
	}
}//class

class Child4 extends Parent4{
	public void method1() {
		System.out.println("오버라이딩 메서드!");
	}
	
	/*
	public void method2() {  //error
		//=> Cannot override the final method from Parent4
		//=> 오버라이딩할 수 없다
	}
	*/
}

public class FinalTest2 {

	public static void main(String[] args) {
		
		
	}

}
