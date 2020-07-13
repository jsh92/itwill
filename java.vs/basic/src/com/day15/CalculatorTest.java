package com.day15;

import java.util.Scanner;

class Calculator{
	//static 메서드
	public static int add(int a, int b) {
		return a+b;
	}
	
	//인스턴스 메서드
	public int subtract(int a, int b) {
		return a-b;
	}
}//class

public class CalculatorTest {

	public static void main(String[] args) {
		//static 메서드 호출 - 클래스명.메서드()
		//인스턴스 생성과 상관없이 클래스차원에서 호출 가능
		int result = Calculator.add(10, 20);
		System.out.println("두 수의 합 : " + result);
		
		//int n = Integer.parseInt("123");
		
		//인스턴스 메서드 호출 - 객체 생성 후 참조변수.메서드()
		Calculator cal = new Calculator();
		result = cal.subtract(30, 5);
		System.out.println("두 수의 차 : " + result);
		
		//Scanner sc = new Scanner(System.in);
		//int k = sc.nextInt();
		
	}

}
