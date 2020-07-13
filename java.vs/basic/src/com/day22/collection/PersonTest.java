package com.day22.collection;

import java.util.ArrayList;

public class PersonTest {

	public static void main(String[] args) {
		//배열 이용
		Person[] pArr = new Person[3];
		pArr[0] = new Person("홍길동", 20);
		pArr[1] = new Person("김길동", 10);
		pArr[2] = new Person("이길동", 25);
		
		for(int i=0;i<pArr.length;i++) {
			pArr[i].showInfo();
		}//for
		
		System.out.println("\n====확장 for ===");
		for(Person p : pArr){
			p.showInfo();
		}
		
		//ArrayList 이용
		ArrayList<Person> pList = new ArrayList<Person>();
		
		pList.add(new Person("정길동", 21));
		pList.add(new Person("강길동", 22));
		Person p = new Person("오길동", 23);
		pList.add(p);
		
		System.out.println("\n====ArrayList=====");
		for(int i=0;i<pList.size();i++) {
			Person p2 = pList.get(i);
			p2.showInfo();
		}

		System.out.println("\n---- 확장 for------");
		for(Person p2 : pList) {
			System.out.println(p2); //toString()호출
		}
		
	}

}
