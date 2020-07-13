package com.day21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {

	public static void main(String[] args) {
		/*
		 다중 catch문
		 - 예외 종류에 따라 각각 다른 처리를 할 수 있다
		 - 자식부터 부모순으로 와야 함
		*/

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("두 정수 입력!");
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			
			int res = n1/n2;
			System.out.println("나누기 결과:" + res);
		}catch(ArithmeticException e) {
			System.out.println("예외: 0으로 나누면 안됨!! "+ e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println("예외: 입력값이 잘못됨! " + e.getMessage());
		}catch(Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
		
		System.out.println("\n======next!!!======");
	}

}
