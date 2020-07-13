package com.day8;

public class DoWhileTest1 {

	public static void main(String[] args) {
		//do~while
		/*
		 do{
		 	명령문;
		 }while(조건식);
		  
		 => 조건이 거짓이더라도 최소한 한번은 명령문을 실행
		 이후 조건이 참인 동안 명령문을 반복 
		 */
		
		int k=0;
		do {
			System.out.println("k="+k);
			
			k++;
		}while(k>3);

		System.out.println("\n=================");
		
		k=0;
		do {
			System.out.println("k : " + k);
			
			k++;
		}while(k<3);		
		
	}

}
