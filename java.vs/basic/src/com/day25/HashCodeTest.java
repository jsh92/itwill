package com.day25;

public class HashCodeTest {

	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		String s3 = "abc";
		String s4 = "abc";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());  //4개 모두 동일
		
		/* String 클래스는 문자열의 내용이 같으면, 
		  동일한 해시코드를 반환하도록 hashCode 메서드를 오버라이딩하였다

		 System.identityHashCode(Object x) 
		 - Object 클래스의 hashCode 메서드처럼 객체의 주소값으로 해시코드를 생성
		 => 모든 객체에 대해 항상 다른 해시코드값을 반환함
		*/

		int hcode = System.identityHashCode(s1);
		System.out.println("s1 주소값  : " + hcode);
		System.out.println("s2 주소값  : " + System.identityHashCode(s2));
		System.out.println("s3 주소값  : " + System.identityHashCode(s3));
		System.out.println("s4 주소값  : " + System.identityHashCode(s4));
				
		Integer n1 = 123, n2 = 300;
		System.out.println("n1 해시코드 : "+n1.hashCode());
		System.out.println("n2 해시코드 : "+n2.hashCode());
		System.out.println("n1 주소값  : " + System.identityHashCode(n1));
		System.out.println("n2 주소값  : " + System.identityHashCode(n2));
		
		Person3 p1 = new Person3();
		Person3 p2 = new Person3();
		
		System.out.println("p1 해시코드 : "+p1.hashCode());
		System.out.println("p2 해시코드 : "+p2.hashCode());
		System.out.println("p1 주소값  : " + System.identityHashCode(p1));
		System.out.println("p2 주소값  : " + System.identityHashCode(p2));		
	}
}

class Person3{}