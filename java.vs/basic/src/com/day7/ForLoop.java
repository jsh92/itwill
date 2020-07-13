package com.day7;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		//무한 루프 - 무한히 반복되는 무한 루프		
		/*
		 for(;;){
		 	반복할 명령;
		 	
		 	if(조건식) break;
		 }
		 
		 => 무한루프안에서는 break를 사용해서 반복문을 빠져나오게 해야 함
		 */
		
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.println("게임중!!!!");
			
			System.out.println("계속하시겠습니까?(Y/N)");
			String type = sc.nextLine();
			if(type.equalsIgnoreCase("N"))
				break;
		}//for
		
		System.out.println("\n=======next========");	
	}

}
