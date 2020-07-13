package com.day11;

public class ArrayCopy {

	public static void main(String[] args) {
		/*
		배열 변수의 복사 - 배열 변수 자체만 복사
		배열의 인스턴스는 복사되지 않음		
		배열은 참조형이므로 배열복사하게 되면 같은 메모리 영역을 가리키게 됨
		*/
		
		int[] arr = new int[3];
		int[] copy = arr; //copy와 arr은 같은 메모리 영역을 가리키게 됨
		
		arr[0]++;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n\n=========copy 배열의 요소=======");
		
		for(int i=0;i<copy.length;i++) {
			System.out.print(copy[i]+" ");
		}
		

	}

}
