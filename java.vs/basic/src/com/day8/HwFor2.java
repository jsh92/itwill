package com.day8;

import java.util.Scanner;

public class HwFor2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("4자리 이상의 숫자를 입력하세요");
		String str =  sc.nextLine();
		//String str = "12345";
		
		int sum = 0;
		for(int i=0; i < str.length(); i++){  //5
			sum += str.charAt(i) - '0';  //'1' => 49-48 = 1
		}
		
		System.out.println("sum="+sum+"\n");

		System.out.println("4자리 이상의 숫자를 입력하세요");
		int num =  sc.nextInt();
		//int num = 12345;
		
		sum = 0;
		while(num > 0){
			sum += num%10;  //5+4+3+2+1
			num /= 10; //1234, 123, 12, 1, 0
		}
		
		System.out.println("sum="+sum);

	}

}
