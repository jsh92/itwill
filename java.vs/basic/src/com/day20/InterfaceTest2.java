package com.day20;

//AAA와 BBB 클래스는 직접적인 관계 (결합도가 높다)
//=> provider 인 BBB가 변경되면 User인 AAA도 변경해야 함
class AAA{
	/*
	public void methodA(BBB b) {
		b.method();
	}*/
	
	public void methodA(CCC c) {
		c.method();
	}
}//

class BBB{
	public void method() {
		System.out.println("BBB의 메서드!");
	}
}//

class CCC{
	public void method() {
		System.out.println("CCC의 메서드!");
	}
}
public class InterfaceTest2 {
	public static void main(String[] args) {		
		AAA a = new AAA();		
		//a.methodA(new BBB()); //
		
		//BBB b=new BBB();
		//a.methodA(b);
		
		a.methodA(new CCC());
		
		CCC c = new CCC();
		a.methodA(c);
	}

}










