package com.day9;

import java.util.Scanner;

public class CalculateTest {
	
	public static void main(String[] args) {
		//[1]
		int result = add(10, 50);
		System.out.println("두 수의 합 : " + result);
		
		//[2]
		int n1=7, n2=9;
		int res = add(n1, n2);
		System.out.println(n1+" 과 "  + n2 + " 의 합 : " + res);
		
		//[3]
		Scanner sc = new Scanner(System.in);
		System.out.println("\n두 정수 입력!");
		int num1=sc.nextInt(); //1
		int num2=sc.nextInt(); //3
		
		int res2=add(num1, num2);
		System.out.println("\n"+num1 + " + " + num2 + " = " + res2);
		
		//[1]
		float f=subtract(3.14f, 10.2f);
		System.out.println("\n\n두 실수의 차 : " + f);
		
		//[2]
		float f1=3.14f, f2=10.2f;		
		f = subtract(f1, f2);
		System.out.println(f1 + " - " + f2 + " = " + f);
		
		//[3]
		System.out.println("\n두 실수를 입력하세요");
		float m1 = sc.nextFloat(); //3.1
		float m2 = sc.nextFloat(); //4.1
		
		f=subtract(m1, m2);
		System.out.println("\n"+m1 + " - " + m2 + " = " + f);
		
		sc.close();
	}

	public static int add(int a, int b) {
		int c = a + b;
		
		return c;
	}
	
	public static float subtract(float a, float b) {
		float c = a-b;
		
		return c;
	}
	
}
