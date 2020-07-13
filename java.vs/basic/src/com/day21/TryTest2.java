package com.day21;

import java.util.Scanner;

public class TryTest2 {

	public static void main(String[] args) {
		/*
		 예외(Exception) - 프로그램 실행도중 발생하는 오류
		 				  예외가 발생하면 프로그램이 비정상 종료됨
		 
		 에러의 종류
		 [1] 컴파일 에러 (Compile Error)
		 [2] 실행 에러 (Runtime Error)
		 	 에러(Error) - 메모리 부족과 같은 복구할 수 없는 심각한 에러
		 	 예외(Exception) - 발생하더라도 수습될 수 있는 덜 심각한 에러
		 	 
		 예외 처리 - 예외발생에 대비한 코드를 작성하는 것
		         프로그램 실행도중 발생한 에러를 처리하여, 프로그램이 비정상 종료되는 것을 막는것
		         
		 try{
		 	예외가 발생할 만한 코드를 넣는다
		 }catch(Exception e){
		 	예외 발생시 처리할 코드
		 }
		 */
		
		System.out.println("===예외 처리하는 경우===");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("두 정수 입력!");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			int result = n1/n2; //n2가 0인 경우 ArithmeticException: / by zero
			System.out.println("나눗셈 결과 : " + result);
		}catch(Exception e) {
			System.out.println("예외 발생 :" + e.getMessage());
		}
		
		System.out.println("\n=====다음 문장!!=====");
	}

}
