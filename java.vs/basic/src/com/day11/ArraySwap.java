package com.day11;

public class ArraySwap {

	public static void main(String[] args) {
		//배열변수의 복사를 이용해서 두 배열을 맞바꾼다 - swap
		
		int[] arr = {10, 20, 30};
		int[] oddArr = {1, 3, 5, 7, 9};

		System.out.println("==처음 상태의 arr 배열 요소==");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n\n==oddArr 배열 요소==");
		for(int i=0;i<oddArr.length;i++) {
			System.out.print(oddArr[i]+" ");
		}
		
		//swap
		int[] temp;
		
		temp=arr;  //10,20,30
		arr=oddArr; //1,3,5,7,9
		oddArr=temp; //10, 20, 30
		
		System.out.println("\n\n\n-------swap 후 arr 요소-------");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		
		System.out.println("\n\n-------swap 후 oddArr 요소------");
		for(int i=0;i<oddArr.length;i++) {
			System.out.print(oddArr[i]+"\t");
		}
	}

}
