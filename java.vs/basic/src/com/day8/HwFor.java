package com.day8;

public class HwFor {
	public static void main(String[] args){	
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}//for
		
		System.out.println("\n\n");
		
		for(int i=1; i<=5; i++)	{
			for(int j=1; j<=i; j++)	{
				System.out.print("*");
			}
			
			System.out.println();
		}//for

		System.out.println();

		for(int i=5; i>=1; i--)	{
			for(int j=1; j<=i; j++)	{
				System.out.print("*");
			}
			
			System.out.println();
		}//for

		System.out.println();
		System.out.println("1부터 10까지의 합");
		for(int i=1; i<=10; i++){
			for(int j=1; j<=i; j++)	{
				System.out.print(j);
				if(j<i)	System.out.print("+");
			}
			
			System.out.println();
		}//for
		
	}//main
}//class

