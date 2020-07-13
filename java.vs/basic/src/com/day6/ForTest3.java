package com.day6;

import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {
		//1~3까지 합 구하기
		/*
		 sum = 0
		 sum = sum + i
		 
		 			sum
		 ------------------------			
		 i : 1		0 + 1
		     2		0+1 + 2
		     3		0+1+2 + 3
		 */

		int sum=0;  //누적하기 전에 반드시 0으로 초기화
		for(int i=1;i<=3;i++) {  //i: 1,2,3
			sum+=i;  //sum=sum+i
			
			//System.out.println("i:"+i+", sum="+sum);
		}//for
		
		System.out.println("\n1~3까지의 합 : " + sum);
		
		//1~50  홀수의 합
		sum=0;
		for(int i=1;i<=50;i+=2) {
			sum+=i;
		}
		System.out.println("1~50까지 홀수의 합:"+ sum);
		
		//1~ n 짝수의 합
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력!");
		int n=sc.nextInt();
		
		sum=0;
		for(int i=2;i<=n;i+=2) {
			sum+=i;
		}//for
		System.out.println("1~"+n +" 까지 짝수의 합: " +sum);
	}

}









