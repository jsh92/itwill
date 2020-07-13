package com.day22;

import java.util.Scanner;
class Exam1{   
	public static void main(String[] args)	{
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("주민번호를 입력하세요");
			String ssn = sc.nextLine();

			if (ssn.length() !=13){
				throw  new Exception("주민번호를 잘못 입력했습니다, 13자리를 입력하세요");
			}

			System.out.println("\n주민번호 : "  +ssn);
		}catch(Exception e) {
			System.out.println(e.getMessage()); 
			e.printStackTrace();
		}

		System.out.println("\n프로그램이 정상적으로 종료되었습니다!!"); 
	}
}
