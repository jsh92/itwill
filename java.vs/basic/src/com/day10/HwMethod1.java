package com.day10;

import java.io.IOException;
import java.util.Scanner;

public class HwMethod1 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0~9 사이의 숫자를 입력하세요.");
		char ch=(char)System.in.read();
		int n=convToInt(ch);
		System.out.println(ch+" => "+n);
		System.out.println(n+" * 100 = " + n*100);
		
		System.out.println("\n반복 횟수를 입력하세요");
		int count = sc.nextInt();
		printTriangle(count);
		printTriangle2(count);
	}
	
	public static int convToInt(char ch){
		int result = ch-48;  //ch-'0'

		return result;
	}

	public static void printTriangle(int count){
		for (int i=0;i<count ;i++ ){  //0,1,2
			for (int j=0;j<i ;j++ )	{ //0,1
				System.out.print("A");
			}//for
			System.out.println("B");
		}//for
	}

	public static void printTriangle2(int count){
		for (int i=0;i<count ;i++ )	{  //0, 1, 2
			for (int j=0;j<=i ;j++ ){ //0,1,2				
				if(j==i)	
					System.out.print("B");
				else 
					System.out.print("A");
			}//for
			System.out.println();
		}//for
	}
	
}//class