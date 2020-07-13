package com.day11;

public class EnhancedFor {

	public static void main(String[] args) {
		//확장 for문 (Enhanced For문)
		/*
		  - 배열이나 컬렉션의 요소들을 반복처리할 때 사용
		 
		 for(자료형  변수 : 배열){
		 
		 }
		*/
		int[] arr = {10,50,78,99,63};
		
		System.out.println("===확장 for 이용===");
		for(int n : arr) {
			System.out.print(n+" ");
		}
		
		System.out.println("\n\n=== for 이용===");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		String[] sArr = {"java","oracle","jsp"};
		
		System.out.println("\n\n\n----확장 for-----");
		for(String s : sArr) {
			System.out.print(s+"\t");
		}
		
		System.out.println("\n\n-----for------");
		for(int i=0;i<sArr.length;i++) {
			System.out.print(sArr[i]+"\t");
		}
		
	}

}
