package com.day11;

public class ArrayMax {

	public static void main(String[] args) {
		//배열 요소 중 최대값 구하기
		int[] arr = {10,57,19,35,77,26};
		
		int max = arr[0];  //우선 0번째 요소를 최대값으로 지정
		//=> 10 => 57 => 77
		
		//1번째 요소부터 차례대로 max값과 비교
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];  //57=> 77
			}
		}//for
		
		System.out.println("=====배열 요소의 값=====");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}//for
		
		System.out.println("\n\n최대값 : " + max);
	}

}
