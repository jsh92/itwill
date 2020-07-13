package com.day26;

public class InnerTest {
	//내부 클래스 - 인스턴스 클래스 
	class InstanceInner{
		int iv=100;
		//static int cv = 200; //error
		//=> 내부 클래스중 static 클래스만 static 멤버를 가질 수 있다
		
		static final int CONST=300; //final static은 사용 가능
	}
	
	//static클래스
	static class StaticInner{
		int iv=1000;
		static int cv =2000; 
		static final int CONST = 3000;
	}
	
	public void method() {
		//지역 클래스
		class LocalInner{
			int iv = 10;
			//static int cv = 20; //error
			static final int CONST = 30;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(InnerTest.StaticInner.cv);
		System.out.println(StaticInner.CONST);
		System.out.println(InstanceInner.CONST);
	}

}
