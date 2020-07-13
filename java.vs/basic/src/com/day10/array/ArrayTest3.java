package com.day10.array;

public class ArrayTest3 {

	public static void main(String[] args) {
		int[] score = {83,99,76,95,67,70,88,100,96,73};
		
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]);
		}

		//5점 가산
		/*int a=72;
		a=a+5;
		a+=5;
		
		score[0]+=5;
		*/
		
		System.out.println("\n\n======5점 가산 후========");
		for(int i=0;i<score.length;i++) {
			if(score[i]>95)
				score[i]=100;
			else	
				score[i]+=5;
			
			System.out.println(score[i]);
		}
		
	}

}
