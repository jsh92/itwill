package com.day21;

import java.util.Scanner;

public class ThrowTest {

	public static void main(String[] args) {
		//throw문 - 강제로 예외 발생시킬 때 사용
		/* 자바 가상머신에 의해 인식될 수 있는 예외 상황이 아니지만,
		프로그램의 성격에 따라 개발자가 정의한 예외상황인 경우 
		(예: 나이 입력시 0 보다 작은 값이 입력되었다)
		
		 throw new Exception ("에러 메시지!");
		*/

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("나이 입력!");
			int age=sc.nextInt();
			
			if(age<0) {
				throw new Exception("나이는 양수만 가능합니다!");
				//=> public Exception(String message)
			}
			
			System.out.println("나이 : "+ age);
		}catch(Exception e) {
			System.out.println("예외발생 : " + e.getMessage());
		}
		
		System.out.println("\n======next=======");
		
		
	}

}
