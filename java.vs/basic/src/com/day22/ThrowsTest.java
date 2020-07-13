package com.day22;

public class ThrowsTest {

	public static void main(String[] args) {
		try {
			method1();
		}catch(Exception e) {
			System.out.println("예외메시지:"+e.getMessage());
			e.printStackTrace();
		}
		
	}

	public static void method1() throws Exception{
		method2();
	}
	
	public static void method2() throws Exception{
		throw new Exception("고의로 예외를 발생시킴!!");
		
		/* 메서드에서 예외를 처리하는 방법
		 [1] try~catch로 직접 예외처리
		 [2] throws 로 예외 떠넘기기(예외 전달, 메서드에 예외 선언하기)
		 
		 RuntimeException 계열의 예외들은 예외처리 하지 않아도 됨
		 하지만 RuntimeException계열이 아닌 Exception 들은 반드시 예외처리 해야 함
		 예외처리 하지 않으면 컴파일 에러남		  
		 */
	}
	
}
