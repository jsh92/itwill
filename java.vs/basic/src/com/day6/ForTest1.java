package com.day6;

public class ForTest1 {

	public static void main(String[] args) {
		/*
		 반복문 - 반복적인 작업을 수행할 때 사용
		 1) for - 주로 반복 횟수가 정해진 경우 사용 
		 2) while
		 3) do ~ while
		 4) 확장 for
		 
		          시작값;최종값;증감식
		 for(초기식;조건식;증감식){
		 	반복할 명령;
		 }		 
		 */
		
		//i: 0,1,2  => 3번 반복됨 
		for(int i=0;i<3;i++) {
			System.out.println("Hello java!");
		}//for
		
		for(int i=0;i<4;i++) {  //4번 반복
			System.out.println("i="+i);
		}//for
		
		for(int i=3;i>0;i--) {  //i : 3,2,1 => 3번 반복
			System.out.println(i);
		}//for
		
		/*
		 1. jsp
		 2. jsp
		 3. jsp
		 4. jsp
		 5. jsp		  
		 */
		
		for(int i=0;i<5;i++) {
			System.out.println(i+1 +". jsp");
		}//for
		
		/*
		 2
		 4
		 6
		 8
		 */
		
		System.out.println("\n------------------");
		for(int i=2;i<10;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}//for
		
		//1씩 증가 : i++ => i=i+1 => i+=1 
		//2씩 증가 : i+=2 
		
		for(int i=2;i<10;i+=2) {
			System.out.println("i : "+i);
		}//for
		
		/*
		 1 3 5 7 9 11
		 */
		
		for(int i=1;i<13;i+=2) {
			System.out.print(i+"\t");
		}//for
		
		System.out.println("\n\n===========");
		for(int i=10;i>-8;i-=2) { //10, 8, 6, ..0, -2, -4, -6
			if(i>0) {
				System.out.println(i + " java");
			}else if(i==0) {
				System.out.println(i + " oracle");
			}else {
				System.out.println(i + " spring");
			}
		}//for
		
	}

}








