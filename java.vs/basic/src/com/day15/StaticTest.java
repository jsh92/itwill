package com.day15;

public class StaticTest {
	private int num1;
	private static int num2;
	
	public int add() {
		return num1 + num2;
	}
	
	public static int multiply(int a, int b) {
		//int result = num1 * num2; //error
		//static 메서드에서는 static만 접근 가능
		//=> 인스턴스 멤버변수인 num1은 접근 불가
		
		return a *  b;
	}
	
	public static void main(String[] args) {
		int result = StaticTest.multiply(10, 30);
		//=> static 메서드 호출 : 클래스명.메서드()
		System.out.println("두 수의 곱 : " + result);
		
		result = multiply(20, 40);
		//=> 같은 클래스에서는 클래스명 생략하고 메서드명만 호출 가능
		System.out.println("두 수의 곱 : " + result);
		
		//result = add(); //error
		//=> static에서는 static만 접근 가능하므로
		//static 메서드인 main에서는 인스턴스 메서드 접근 불가
		
		StaticTest.num2 = 7;
		StaticTest obj = new StaticTest();
		obj.num1 = 5;
		
		result = obj.add(); //같은 클래스지만 객체 생성 후 인스턴스 메서드 접근
		System.out.println("두 수의 합 : " + result);
	}

}
