package com.day7;

import java.util.Scanner;

public class WhileTest1 {
	
	public static void main(String[] args) {
		//반복문 - while : 횟수가 가변적인 경우 주로 사용
		/*
		 	while(조건식){
		 		반복할 내용;
		 	}
		 	=> 조건식이 참인 동안 반복할 내용을 반복  
		*/
		
		Scanner sc = new Scanner("\n\n가나다 하나 둘\n\n라\n\n");
		String str="";
		
		//public boolean hasNext()
		
		while(sc.hasNext()) {
			str=sc.nextLine();
			System.out.println("출력 : " +  str);
		}//while
		
		str =sc.nextLine();
		System.out.println("while 탈출 후1 : " + str);
		
		str = sc.nextLine(); //실행 에러 - No line found
		System.out.println("while 탈출 후2 : " + str);  

		
	}

}
