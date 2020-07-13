package com.day11;

import java.util.Scanner;

public class ArrayParam {

	//국,영,수 점수가 들어간 배열을 매개변수로 받아 평균을 리턴하는 메서드
	//배열이 매개변수인 경우
	public static double findTotal(int[] score) {
		//call by reference : 매개변수에 주소가 넘어감
		//=> 메서드에서 매개변수의 값을 변경하면 해당 메서드를 호출한 곳(main)에서도
		//변경의 영향을 받는다(값이 변경된다)
		
		int sum=0;
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
		}
		
		score[0]++; //96
		
		double avg = (double)sum/score.length;
		
		return avg;
	}
	
	public static int add(int a, int b) {
		//call by value : 매개변수에 값이 넘어감
		//=> 메서드에서 매개변수의 값을 변경해도 해당 메소드를 호출한 곳(main)에서는
		//영향 받지 않는다
		
		int c = a + b;
		a++; //6
		return c;
	}
	
	public static void main(String[] args) {
		int a=5, b=7;
		int result=add(a, b); //call by value
		System.out.println(result+", a="+a); //a=5
		
		int[] arr=new int[3];
		arr[0]=95;
		arr[1]=81;
		arr[2]=77;
		
		//int[] arr2= {100, 96, 87};
		
		double avg=findTotal(arr); //call by reference
		System.out.println(avg+", arr[0]=> "+arr[0]);
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr3=new int[3];
		System.out.println("국,영,수 점수를 입력하세요");
		
		for(int i=0;i<arr3.length;i++) {
			arr3[i]=sc.nextInt();		
		}
		
		avg=findTotal(arr3);
		System.out.println(avg);
	}

}
