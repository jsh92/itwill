package com.day12;

public class Array2Rank {

	public static void main(String[] args) {
		//2차원 배열
		/*
		 자바의 다차원 배열에서 각 영역은 모두 reference 를 표시하는 공간이고, 
		 마지막 배열 공간만이 실제 데이터를 나타내는 공간임
		*/
		
		//[1] 배열 선언, 메모리 할당과 초기화를 별도로
		//배열 선언
		int[][] arr;
		
		//메모리 할당
		arr=new int[2][3];  //2행 3열
		
		//초기화
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=25;
		arr[1][0]=11;
		arr[1][1]=34;
		arr[1][2]=58;
		
		//출력
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j] + "\t");
			}//안쪽 for
			System.out.println();
		}//바깥  for
		
		//배열 선언과 메모리 할당을 동시에
		int[][] arr2 = new int[3][2];
		
		//[2] 배열선언, 메모리할당, 초기화를 모두 동시에
		int[][] arr3 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		System.out.println("\n");
		for(int i=0;i<arr3.length;i++) { //3
			for(int j=0;j<arr3[i].length;j++) { //4
				System.out.print(arr3[i][j]+"\t");
			}
			System.out.println();
		}//for
		
		System.out.println("\narr3의 행의 개수 : " + arr3.length);
		System.out.println("arr3의 열의 개수 : " + arr3[0].length);
		
		//
		int arr4[][];  	//가능
		int[] arr5[];	//가능
		
		int[][] arr6 = new int[][] {{11,21,31},{41,51,61}};
		
		int[][] arr7;
		arr7 = new int[][] {{1,2},{3,4},{5,6}};
		
		//int[][] arr8 = new int[2][2];
		//arr8 = {{1,2},{3,4}};  //error
	}

}
