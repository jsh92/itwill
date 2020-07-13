package com.day22;

import java.util.Scanner;

class AgeException2 extends Exception{
	
	AgeException2(){
		super("나이는 양수만 가능합니다.");
	}
}

public class AgeExceptionTest {
	public static int readAge() throws AgeException2{
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 입력!");
		int age=sc.nextInt();
		
		if(age<0) {
			throw new AgeException2();
		}
		
		return age;
	}
	
	public static void main(String[] args) {
		try {
			int age=readAge();
			System.out.println("나이 : " + age);
		}catch(AgeException2 e) {
			System.out.println("예외 메시지 : " + e.getMessage());
		}
		
		System.out.println("\n=======next!=======");
	}

	 
}
