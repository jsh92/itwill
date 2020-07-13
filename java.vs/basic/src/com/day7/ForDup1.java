package com.day7;

public class ForDup1 {

	public static void main(String[] args) {
		/* 중첩 for
		- for문 안에 for문이 들어간 것
		
		for(초기식;조건식;증감식){
			for(초기식;조건식;증감식){
				처리할 문장
			} //안쪽 for
		} //바깥 for
		 
		=> 바쁜 for가 안쪽 for 
		*/
		
		for(int i=0;i<3;i++) {
			System.out.println("========현재 i : " + i);
			
			for(int j=0;j<2;j++) {
				System.out.println("현재 j -> " + j);
			}//안쪽 for
			
			System.out.println();
		}//바깥 for

		/*
		===== i : 0
		  j -> 0
		  j -> 1
		  
		===== i : 1
		  j -> 0
		  j -> 1
		===== i : 2
		  j -> 0
		  j -> 1  
		*/
		
	}

}
