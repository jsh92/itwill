package com.day7;

import java.util.Scanner;

public class ForExam4{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
			
		int sum=0;
		while(true){
			System.out.println("숫자 입력!");
			int n=sc.nextInt();
			
			if(n==0) break; 
				
			sum+=n; //		
		}//while
		
		System.out.println("합:"+ sum);
		
		//2.
		System.out.println("갯수 입력!");
		int count=sc.nextInt();
		
		sum=0;
		for(int i=0;i<count;i++) {
			System.out.println("정수 입력!");
			
			int num=sc.nextInt();
			sum+=num;
		}//for
		
		double avg=(double)sum/count;
		System.out.println("평균:" + avg);
		
		//public static long round(double a)	
		avg=Math.round(avg*100)/100.0;
		System.out.println("반올림 후 : " + avg);
	}

}






