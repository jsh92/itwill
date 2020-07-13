package com.day10.array;

public class ArrayTest1 {

	public static void main(String[] args) {
		/*
		 변수 - 데이터 한 개를 저장하기 위한 저장소
		 배열 - 동일한 타입의 데이터 여러 개를 저장하기 위한 저장소
		            참조형 (new 키워드로 메모리에 할당해야 함)
		      default값으로 초기화됨      
		            배열 이름에는 참조값(주소값)이 들어감
		            각 요소들은 인덱스(index, 첨자)로 접근 가능            
		 */
		
		//[1] 배열선언과 메모리 할당을 따로
		//1. 배열 선언
		int[] arr;
		
		//2. 메모리 할당
		arr = new int[3];  //정수 3개를 저장할 수 있는 배열
				
		//3. 초기화
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		//4. 출력
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		*/
		
		for(int i=0;i<3;i++) {
			System.out.println(arr[i]);
		}
		
		//[2] 배열선언과 메모리 할당을 동시에
		int[] arr2=new int[2];
		
		//초기화
		arr2[0]=4;
		arr2[1]=7;
		//arr2[2]=8;  //실행 error: ArrayIndexOutOfBoundsException
		
		//[3] 배열선언, 메모리 할당, 초기화 모두 동시에
		int[] arr3 = {15,30,21,77,95};
		
		for(int i=0;i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
		}//for
		
		System.out.println("\n\narr 배열의 크기 : " +  arr.length+"\n\n");
		
		//
		int arr4[];  //가능
		arr4 = new int[4];  //default값으로 초기화됨
		
		for(int i=0;i<arr4.length;i++) {
			System.out.println(arr4[i]);
		}
		
		//
		int[] arr5=new int[] {4,9,7,3};
		
		//
		int[] arr6;
		arr6 = new int[] {1,2,7};
		
		//
		//int[] arr6 = new int[4];
		//arr6= {5,6,4,9};  //error
		
		System.out.println(arr6);  //배열 이름에는 주소가 들어감
		
	}

}
