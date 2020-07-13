package com.day11;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		//public static void sort(int[] a)
		//=> 해당 배열을 오름차순으로 정렬해주는 메서드
		
		int[] arr = {79,12,66,100,3,27,10,85};

		for(int n : arr) {
			System.out.print(n+" ");
		}//for
		
		Arrays.sort(arr);
		
		System.out.println("\n\n=====정렬 후 배열 요소=====");
		
		for(int n : arr) {
			System.out.print(n+" ");
		}//for
		
	}

}
