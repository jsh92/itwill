package com.day11;

import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		//for 문 안에서 배열 초기화하기
		//[1] 일정한 규칙이 있는 값으로 초기화하는 경우
		//5, 10,15,20,25
		int a;
		a=7;
		
		//1. 배열 선언
		int[] arr;
		
		//2. 메모리 할당
		arr=new int[5];
		
		//3. 초기화
		/*
		arr[0]=5;       1
		arr[1]=10;		2
		arr[2]=15;		3
		arr[3]=20;		4
		arr[4]=25;		5
		*/
		for(int i=0;i<arr.length;i++) {
			arr[i]=(i+1)*5;
		}
		
		//4. 출력
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}//for
		
		//[2] 사용자로 부터 입력 받은 값(double)으로 초기화하는 경우 -4개
		Scanner sc = new Scanner(System.in);
		
		double[] dArr=new double[4];
		
		/*
		System.out.println("실수를 입력하세요");
		double num=sc.nextDouble();
		dArr[0]=num;
		dArr[1]=sc.nextDouble();
		dArr[2]=sc.nextDouble();
		dArr[3]=sc.nextDouble();
		*/
		
		for(int i=0;i<dArr.length;i++) {
			System.out.println("실수를 입력하세요");
			//double num=sc.nextDouble();
			//dArr[i]=num;
			dArr[i]=sc.nextDouble();
		}
		
		for(int i=0;i<dArr.length;i++) {
			System.out.println("dArr[" + i +"] = " + dArr[i]);
		}//for
		
	}

}




