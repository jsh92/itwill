package com.day25;

class Person{
	public void display() {
		System.out.println("this=" + this);
	}
}//

public class ObjectTest {

	public static void main(String[] args) {
		Person p = new Person();
		Person p2 = new Person();
		
		System.out.println("p와 p2의 주소가 같은가?"+p.equals(p2));
		System.out.println("p.getClass() : "+p.getClass());
		System.out.println("p의 해시코드값 : "+p.hashCode());
		System.out.println("toString() : "+p.toString());
		System.out.println("p="+p);
		System.out.println("p 클래스의 이름 : "+p.getClass().getName());
		System.out.println(Integer.toHexString(p.hashCode()));
		
		p.display();
		
		p=p2;
		if(p.equals(p2)) {
			System.out.println("p와 p2의 주소가 같다");
		}else {
			System.out.println("p와 p2의 주소가 다르다");
		}
		
		/*
		 toString() 메서드의 결과 :   클래스명@16진수 해시코드 
		 getClass().getName() + '@' + Integer.toHexString(hashCode())
		*/
	}

}
