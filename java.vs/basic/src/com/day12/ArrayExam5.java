package com.day12;

public class ArrayExam5 {
	public static void main(String[] args){
		int[][] arr = {			
			{10,10,10,10,10},
			{20,20,20,20,20},
			{30,30,30,30,30},
			{45,45,45,45,45}
		};

		int total = 0;
		float average = 0;
		for(int i=0; i < arr.length;i++) {
			for(int j=0; j < arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				total += arr[i][j];
			}
			System.out.println();
		}

		average = (float)total /(arr.length * arr[0].length); //4*5

		System.out.println("\nÃÑÇÕ : "+total);
		System.out.println("Æò±Õ : "+average);
	}
}

