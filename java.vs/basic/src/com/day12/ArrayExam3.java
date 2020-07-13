package com.day12;

import java.util.Scanner;

public class ArrayExam3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[8];
		String str ="";

		while(true)	{
			System.out.println("복권판매점 번호(1~8)와 복권 판매량을 입력하세요.(끝낼때는 Q)");
			str = sc.nextLine();
			
			if (str.equalsIgnoreCase("Q")) break;	
			
			int gNo = Integer.parseInt(str);
			int quantity = sc.nextInt();
			sc.nextLine();
			
			num[gNo-1] += quantity;

			System.out.println("그룹번호 : " + gNo 
					+ ", 판매량:" + num[gNo-1]);
		}//while

	}

}
