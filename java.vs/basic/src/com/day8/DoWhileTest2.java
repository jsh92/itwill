package com.day8;

import java.util.Scanner;

public class DoWhileTest2 {

	public static void main(String[] args) {
		//사용자로부터 입력받은 숫자들의 합을 구해 출력
		//사용자가 0을 입력할 때까지 반복
		
		Scanner sc = new Scanner(System.in);
		int num=0;
		int sum=0;
		do {	
			//1. 반복문안에서 사용자로 부터 숫자 입력받기
			System.out.println("숫자 입력!");
			num=sc.nextInt();
			
			//2. 탈출조건 : 사용자가 입력한 값이 0이면 탈출
			
			//3. 반복문 안에서 입력받은 숫자를 누적한다
			sum+=num;
		}while(num!=0);
		
		//4. 반복문 탈출 후 누적한 숫자의 합을 출력한다
		System.out.println("\n입력한 숫자들의 합:" + sum);

	}

}


