package com.day6;

import java.util.Scanner;

public class SwitchExam1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		int mymonth = sc.nextInt();

		String str="";
		switch (mymonth){
			case 1 : 
			case 2 : 
			case 3 :
				str = mymonth + "월은 1사분기입니다.";
				break;
			case 4 : case 5 : case 6 : 
				str = mymonth + "월은 2사분기입니다.";
				break;
			case 7 : case 8 : case 9 : 
				str = mymonth + "월은 3사분기입니다.";
				break;
			case 10 : case 11 : case 12 : 
				str = mymonth + "월은 4사분기입니다.";
				break;
			default :
				str = "잘못 선택했어요";
				break;
		}

		System.out.println(str);
		
		sc.close();
	}
}
