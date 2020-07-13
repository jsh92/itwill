package com.day6;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		//양수, 음수, 0
		//=> if
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력!");
		int n=sc.nextInt();
		
		String result="";
		if(n>0) {
			result="양수";
		}else if(n<0) {
			result="음수";
		}else {
			result="0";
		}
		
		System.out.println("결과 : " + result);
		
		//=> 삼항연산자
		result = (n>0)?"양수":(n<0)?"음수":"0";
		System.out.println("삼항연산자 이용 : " + result);
	}

}










