package com.day10;

import java.util.Scanner;

public class MethodExam2 {
	public static double findPieceWages(int qty, int sellPrice)	{		
		double pieceWages =0;

		if (qty>=200){
			pieceWages=sellPrice*0.35;
		}else if (qty>=100){
			pieceWages=sellPrice*0.25;
		}else{
			pieceWages=sellPrice*0.15;
		}//if

		return pieceWages;
	}

	public static int addOdd (int start, int end) {		
		if(start%2==0) {
			start++;
		}
		
		int sum=0;
		for(int i=start;i<=end;i+=2) {
			sum+=i;
		}
		
		return sum;
	}
	
	public static boolean isNumeric(String value){		
		char ch = ' ';
		boolean isNumber = true;
		
		for(int i=0; i < value.length() ;i++) {
			ch = value.charAt(i);
			
			if(!(ch>='0' && ch<='9')) {
				isNumber = false;
				break;
			}
		}//for

		return isNumber;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("판매수량, 판매금액을 입력하세요.");
		int qty = sc.nextInt();	
		int price =sc.nextInt();
		
		double pieceWages=findPieceWages(qty, price);
		System.out.println("성과급 : " + pieceWages);
		
		System.out.println("\n두 수 입력하세요.");
		int n1 = sc.nextInt();	
		int n2 =sc.nextInt();
		
		int sum=addOdd(n1, n2);
		System.out.println("홀수의 합:" + sum);
		
		System.out.println("\n값을 입력하세요.");
		sc.nextLine();
		String val = sc.nextLine();
		
		boolean bool = isNumeric(val);
		if(bool) {
			System.out.println("숫자입니다.");
		}else {
			System.out.println("숫자가 아닙니다.");
		}
				
		if(isNumeric(val)) {
			System.out.println("숫자입니다.");
		}else {
			System.out.println("숫자가 아닙니다.");
		}
		
	}

}

