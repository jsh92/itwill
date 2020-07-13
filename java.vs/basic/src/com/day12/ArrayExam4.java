package com.day12;

public class ArrayExam4 {

	public static void main(String[] args) {
		int[][] arr7=new int[3][3];
		for(int i=0; i < arr7.length;i++) {
			for(int j=0; j < arr7[i].length;j++) {
				if (i==j)
					arr7[i][j]=1;
			}
		}//for
				
		for(int i=0; i < arr7.length;i++) {
			for(int j=0; j < arr7[i].length;j++) {
				System.out.print(arr7[i][j]+"\t");
			}
			System.out.println();
		}//for

		System.out.println();
		int[][] arr8=new int[3][3];
		for(int i=0; i < arr8.length;i++) {
			for(int j=0; j < arr8[i].length;j++) {
				//if (i==j || i+j==2)
				if (i==j || i+j==arr8.length-1)
					arr8[i][j]=1;
			}
		}//for
				
		for(int i=0; i < arr8.length;i++) {
			for(int j=0; j < arr8[i].length;j++) {
				System.out.print(arr8[i][j]+"\t");
			}
			System.out.println();
		}//for

	}

}
