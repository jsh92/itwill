package com.day7;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		//while을 이용한 무한루프
		/*
		  while(true){
		  	 반복할 명령;
		  	 
		  	 특정조건인 경우 break;	  
		  }		  
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("정수를 입력하세요. (끝낼때는 0 입력)");
			int n=sc.nextInt();
			
			String result="";
			if(n==0) {
				break;
			}else if(n>0) {
				result="양수";
			}else {
				result="음수";
			}
			
			System.out.println(result+"\n");
		}//while

		System.out.println("\n\n------next-----");
	}

}
