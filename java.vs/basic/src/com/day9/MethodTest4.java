package com.day9;

public class MethodTest4 {
	//[1] 매개변수(입력값)도 없고, 반환값도 없는 메서드 정의
	public static void func1() {
		System.out.println("*******");
	}
	
	//[2] 매개변수만 있고, 반환값은 없는 메서드 정의
	public static void func2(int count) {
		for(int i=0;i<count;i++) {
			System.out.print("*");
		}//for
		
		System.out.println();		
	}
	
	//[3] 매개변수는 없고, 반환값만 있는 메서드 정의
	public static float func3() {
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		
		float avg=sum/10f;
		
		return avg;
	}
	
	//[4] 매개변수도 있고, 반환값도 있는 메서드 정의
	public static int add(int a, int b) {
		int c = a+b;
		
		return c;
	}
	
	public static void main(String[] args) {
		//1. 매개변수도 없고, 반환값도 없는 메서드 호출
		func1();
		
		//2. 매개변수만 있고, 반환값은 없는 메서드 호출
		func2(5);
		
		int cnt=10;
		func2(cnt);
	
		//3. 매개변수는 없고, 반환값만 있는 메서드 호출
		float average = func3();
		System.out.println("\n1~10까지 합계의 평균 : " + average);
		
		//4. 매개변수도 있고, 반환값도 있는 메서드 호출
		int sum = add(10, 20);
		System.out.println("\n두 수의 합:" + sum);
		
		int n1=5, n2=7;
		int sum2 = add(n1, n2);
		System.out.println(n1 + " + " + n2 + " = " + sum2);
		
		
	}

}




