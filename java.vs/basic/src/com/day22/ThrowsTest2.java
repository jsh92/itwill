package com.day22;

public class ThrowsTest2 {

	public static void main(String[] args) {
		method1();
	}

	public static void method1() {
		method2();
	}
	
	public static void method2() {
		try {
			throw new Exception("강제로 예외 발생시킴!");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
