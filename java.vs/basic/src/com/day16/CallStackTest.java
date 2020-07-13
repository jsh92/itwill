package com.day16;

public class CallStackTest {

	public static void main(String[] args) {
		int a=10;
		int n=firstMethod(a);
	}

	public static int firstMethod(int k) {
		int b=20;
		secondMethod(); 
		
		return k+b;
	}
	
	public static void secondMethod() {
		int c = 30;
		System.out.println("hello!");
	}
}
