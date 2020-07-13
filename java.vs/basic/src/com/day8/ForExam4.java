package com.day8;

import java.util.Scanner;

public class ForExam4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력하세요");
		String value =  sc.nextLine();
		//String value = "12a34";
		
		char ch = ' ';
		boolean isNumber = true;
		// 반복문과 charAt(int i)를 이용해서 문자열의 문자를 하나씩 읽어서 검사한다.
			
		for(int i=0; i < value.length() ;i++) {  //5번 반복, 0,1,2,3,4
			ch = value.charAt(i); //'1', '2', 'a'
			if(!(ch>='0' && ch<='9')) {
				isNumber = false;
				break;
			}
		}//for
		
		if (isNumber) {
			System.out.println(value+"는 숫자입니다.");
		} else {
			System.out.println(value+"는 숫자가 아닙니다.");
		}//if

	}

}
