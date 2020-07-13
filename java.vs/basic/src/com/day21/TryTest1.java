package com.day21;

import java.util.Scanner;

public class TryTest1 {

	public static void main(String[] args) {
		System.out.println("===예외 처리하지 않은 경우===");
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수 입력!");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int result = n1/n2; //n2가 0인 경우 ArithmeticException: / by zero
		//예외가 발생하면 프로그램이 비정상 종료됨
		System.out.println("나눗셈 결과 : " + result);
		
	}

}
