package com.day22;

import java.util.Scanner;

//사용자 정의 예외 클래스 만들기
//Exception을 상속받고, Exception(String message) 생성자에 매개변수를 넣어주면 됨

//public Exception(String message)

class AgeException extends Exception{
	AgeException(String msg){
		super(msg); //public Exception(String message)에 msg를 넘기는 것 
	}
}//

public class UserExceptionTest {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("나이를 입력하세요");
			int age = sc.nextInt();
			if(age < 0) {
				throw new AgeException("나이는 음수 입력하면 안됨!");
			}
			
			System.out.println("나이 : " + age);
		}catch(AgeException e) {
			System.out.println("예외 메시지 : " + e.getMessage());
		}
		
		System.out.println("\n======next!======");
	}

}
