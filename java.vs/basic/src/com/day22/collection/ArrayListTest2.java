package com.day22.collection;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		//generic 컬렉션 - 컬렉션에 저장할 객체의 타입을 지정하는 것
		ArrayList<Integer> list = new ArrayList<Integer>(3);
		
		System.out.println("list의 요소의 개수 : " + list.size());  //0
		
		//1. 데이터 저장하기
		list.add(1); //autoboxing
		list.add(2);
		list.add(37);
		list.add(4);
		
		//2. 데이터 읽어오기
		for(int i=0;i<list.size();i++) {
			int n=list.get(i); //형변환 필요없다 
			//=> unboxing:저장된 값을 꺼낼 때도 기본형 형태의 값을 바로 얻는 것
			
			System.out.println(n);
		}//for
		
		//데이터 삭제
		list.remove(1); //index가 1인 요소 삭제
		
		System.out.println("\n====데이터 삭제 후======");
		for(int n : list) {
			System.out.print(n +"\t");
		}//for
		
		System.out.println("\n\n삭제 후 개수 : " + list.size());
		
	}

}
