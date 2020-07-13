package com.day8;

import java.util.Scanner;

public class ForExam5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
		int  num1 =  sc.nextInt();  //3, 4
		int  num2 =	sc.nextInt();   

		int sum = 0;
		//num1 = (num1%2==1)?num1:num1+1;
		
		if(num1%2==0) { 
			num1++;
		}
		
		for (int i=num1;i<=num2 ;i+=2 ){
		    sum+=i;
		}
		
		System.out.println(num1 +"~"+ num2 +"사이의 홀수의 합:" + sum);

		//2
		System.out.println("두 수를 입력하세요");
		num1 =  sc.nextInt();  //3, 4
		num2 =  sc.nextInt();   
					
		System.out.println("1. 홀수의 합, 2. 짝수의 합 선택");
		int type =  sc.nextInt();  
		if(type!=1 && type !=2){
			System.out.println("1 또는 2를 선택하셔야 합니다!!");
			return;
		}
		
		sum = 0;
		int begin=num1;
		String sType = (type==1)? "홀수":"짝수";

		if((type==1 && (num1%2==0))  || (type==2 && (num1%2==1))){
			begin++;
		}

		for (int i=begin;i<=num2 ;i+=2 ){
			  sum+=i;
		}
		
		System.out.println(num1 +"~"+ num2 +"사이의"+ sType+"의 합:" + sum);



	}
}
