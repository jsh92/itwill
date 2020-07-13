package com.day10;

public class OverloadingTest {
	
	/*
	오버로딩 메서드
	- 하나의 클래스에서 동일한 이름을 가진 여러 개의 메서드를 오버로딩 메서드라고 함
	단, 매개변수의 개수나 자료형이 달라야 함
	*/
	
	public static int add(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public static float add(float a, float b) {
		return a+b;
	}
	
	public static float add(float a, float b, float c) {
		return a+b+c;
	}
	
	public static String add(String a, String b) {
		return a+b;
	}
	
	/*
	public static double add(int a, int b) {
		return a+b;
	}
	=> 반환타입이 다른것은 오버로딩 메서드가 아님
	   매개변수가 같으므로 에러!	
	*/
	
	public static void main(String[] args) {
		int result=add(10, 20);
		System.out.println("두 정수의 합 : " + result);
		
		float f=add(3.14f, 7.89f);
		System.out.println("두 실수의 합 : " + f);
		
		float f1=1.23f, f2=2.56f, f3=7.44f;		
		f=add(f1, f2, f3);
		System.out.println("세 실수의 합 : " + f);
		
		String s1="hello, ", s2="java!";
		String str =add(s1, s2);
		System.out.println("두 문자열 연결 : " + str);
		
	}

}
