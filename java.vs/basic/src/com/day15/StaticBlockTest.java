package com.day15;

class AAA{
	static int[] arr = new int[10]; //명시적 초기화
	
	/* 
	 static 초기화 블럭 - static변수의 복잡한 초기화에 사용됨
	
	 static{
	 
	 }
	 */
	
	static {
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}//for
	}
	
	/*
	  명시적 초기화를 통해 배열 arr을 생성 
	 static 초기화 블럭을 이용해서 배열의 각 요소들을 임의의 값으로 채웠다
	 */

}//class

public class StaticBlockTest {
	public static void main(String[] args) {
		System.out.println("===AAA 클래스의 arr 배열 요소==");
		
		for(int i=0;i<AAA.arr.length;i++) {
			System.out.print(AAA.arr[i]+" ");
		}//for
	}

}
