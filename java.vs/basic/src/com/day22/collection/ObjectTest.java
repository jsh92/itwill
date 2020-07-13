package com.day22.collection;

class AAA{
	public void display() {
		System.out.println("this="+this);
	}
}//

public class ObjectTest {

	public static void main(String[] args) {
		AAA obj = new AAA();
		
		System.out.println("obj 객체를 표현하는 기본 문자열 : " + obj.toString());
		System.out.println("obj 객체를 표현하는 기본 문자열 약식 : " + obj);
		System.out.println(obj);
		
		obj.display();
		
		//toString()메서드의 결과 : 클래스명@16진수 해시코드
		
	}

}
