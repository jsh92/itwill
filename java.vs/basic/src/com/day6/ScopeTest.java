package com.day6;

public class ScopeTest {

	public static void main(String[] args) {
		//변수의 범위(scope)
		int a=10;  //main 메서드에서 선언된 지역변수 - main을 벗어나면 소멸
					//main내에서 사용 가능
		
		//for(int a=0;a<3;a++) {  //error			
		//}
		
		for(int i=0;i<3;i++) {  //for 블럭안에서 선언된 i 는 for를 벗어나면 소멸
			System.out.println("i="+i);
		}
		
		for(int i=0;i<2;i++) {  //i 변수를 다시 선언할 수 있다
			int n=20;  //for를 벗어나면 n은 소멸
			System.out.println("n = " + n);
			System.out.println("i = " + i);
		}
		
		System.out.println("a="+a);
		//System.out.println("n="+n);  //error
		//System.out.println("i="+i);  //error
		
	}

}
