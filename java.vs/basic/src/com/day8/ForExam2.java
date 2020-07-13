package com.day8;

import java.util.Scanner;

public class ForExam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1=0, num2=0;
		while(true){
			System.out.println("\n두 개의 정수를 입력하세요(피제수 제수 순으로 입력)");
			num1 =  sc.nextInt();
			num2 =  sc.nextInt();

			if (num1==0 && num2==0) break;
			
			if(num2==0) {
				System.out.println("제수가 0이므로 연산을 생략합니다.");
				continue;
			}//if

			System.out.println("몫 : " + num1/num2 +", 나머지:"+num1%num2);
		}//while

	}

}
