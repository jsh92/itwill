package com.day22;

import java.util.Scanner;

public class FinallyTest {

	public static void main(String[] args) {
		/*
		try{
		
		}catch(Exception e){
		
		}finally{
			예외 발생여부와 상관없이 반드시 실행되어야 하는 문장을 넣는다
			주로 자원 해제시 사용
		} 
		*/
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("0이나 2 입력!");
			int num = sc.nextInt();
			
			int result = 100/num;
			System.out.println("100/" + num +"=" + result);
		}catch(Exception e) {
			System.out.println("예외발생:" + e.getMessage());
		}finally {
			//예외가 발생되어도 실행되고, 예외가 발생되지 않아도 실행됨
			System.out.println("반드시 실행되어야 함!!!");
		}
		
		System.out.println("\n=====next!!======");
		
	}

}
