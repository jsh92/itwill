package com.day10;

public class FactorialTest {

	//재귀 호출 - 메서드 내부에서 메서드 자기 자신을 다시 호출하는 것
	//반복문의 효과가 있다
	/*
	 팩토리얼
	 4! = 4*3*2*1
	 
	 4! = 4 * 3!
	          3 * 2!
	              2 * 1!
	                  1
	                   		
	 수학적 함수로 표현
	 f(n) = n * f(n-1), f(1)=1                   			
	*/
	
	public static int factorial(int n) {
		int result=0;
		
		if(n==1) {
			result=1;
		}else {
			result= n * factorial(n-1); 
			/* 
			  4*f(3) 
			     3*f(2)
			        2*f(1)
			           1
			 */
			
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int res=factorial(4);
		System.out.println("4! => " + res);
	}

	
}
