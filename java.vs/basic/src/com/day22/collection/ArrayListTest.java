package com.day22.collection;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		/*
		 컬렉션 프레임워크
		 - 데이터 그룹을 저장하는 클래스들을 표준화한 설계 
		 - 메모리 크기를 동적으로 확장할 수 있다
		 - 저장, 검색, 삭제 등의 메서드 제공
		 
		 컬렉션 인터페이스 3종류
		 [1] List
		 	순서가 유지되고, 중복도 허용
		 	구현 클래스 - ArrayList, Vector등
		 [2] Set
		 	순서가 유지되지 않고, 중복도 허용되지 않는다
		 	구현 클래스 - HashSet
		 [3] Map
		 	키, 값 (key, value)쌍으로 저장되는 데이터 집합
		 	순서가 유지되지 않고, 키는 중복허용되지 않고, 값은 중복 허용됨
		 	구현 클래스 - HashMap, Hashtable, Properties
		 */
		
		//1. 저장
		ArrayList list = new ArrayList(3);
		list.add(new Integer(10));
		//add(Object obj) <= 매개변수에 Object의 자식객체를 넣어준다
		list.add(new Integer(20)); //boxing -기본형을 참조형인 Wrapper클래스로
									//변환하는 것
		list.add(35); //jdk 5.0 부터는 기본자료형을 넣을 수 있게 됨
		//=> AutoBoxing : 자동으로 기본형을 참조형으로 변환해줌
		
		//2. 검색(데이터 읽어오기)
		for(int i=0;i<list.size();i++) {
			Object obj = list.get(i);
			Integer n = (Integer)obj; //downcasting
			
			//public int intValue()
			//=> Returns the value of this Integer as an int.
			int k = n.intValue(); //Integer => int
			System.out.println(i + "번째 요소 : " + k);
		}//for
		
		System.out.println("\nlist의 실제 데이터 개수 : "+list.size());
		
		list.add(new Double(3.14));
		list.add(4.56f);
		list.add("java");
		//=> 모든 자료형을 저장할 수 있다
		
		Double d=(Double)list.get(3);
		System.out.println("3번째 요소 => "+ d);
		
		String s = (String)list.get(5);
		System.out.println("5번째 요소 - " + s);
		
		//데이터 삭제
		list.remove(3);  //index가 3인 요소 삭제
		Float f = (Float)list.get(3);
		System.out.println("index가 3인 요소 삭제 후 3번째 요소값 : " + f);
		
		System.out.println("삭제 후 요소의 개수 : " + list.size());
		
		
	}

}
