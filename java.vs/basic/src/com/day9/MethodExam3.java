package com.day9;

import java.util.Scanner;

public class MethodExam3 {
	
	//윤년인지, 평년인지 구하는 메서드
	public static String getYear(int year){
		/*
				윤년
				1) 400으로 나누어 떨어지면 윤년 
				또는
				2) 4로 나누어 떨어지고, 100으로 나누어 떨어지지 않으면 윤년
		 */
		String result="";
		
		if (year%400==0 || (year%4==0 && year%100!=0))	{
			result="윤년";
		}else{
			result="평년";
		}

		return result;
	}

	//홀수인지 짝수인지 구하는 메서드 만들기
	public static String  getOdd(int num){
		String result = "";
		
		if(num%2==0){
			result="짝수";
		}else{
			result="홀수";
		}//if

		return result;
	}

	//주민번호를 이용하여 남자인지, 여자인지 성별 구하는 메서드
	public static String  getGender(int gender){
		String result = "";
		
		if(gender==1 || gender==3){
			result="남자";
		}else{
			result="여자";
		}//if

		return result;
	}

	public static void main(String[] args){		
		Scanner sc = new Scanner(System.in);

		while(true){
			System.out.println("연도를 입력하세요");
			int y = sc.nextInt();
			String result = getYear(y);
			System.out.println(y + "=> " + result);

			System.out.println("\n숫자를 입력하세요");
			int n = sc.nextInt();
			result = getOdd(n);
			System.out.println(n + "=> " + result);

			System.out.println("\n주민번호의 성별을 입력하세요(1,2,3,4)");
			int g = sc.nextInt();  //1 \n
			result = getGender(g);
			System.out.println(g + "=> " + result);

			System.out.println("\n끝내려면 Q를 입력!!");
			sc.nextLine();
			String quit=sc.nextLine(); //
			
			if (quit.equalsIgnoreCase("Q")) break;
		}//while

	}
}

