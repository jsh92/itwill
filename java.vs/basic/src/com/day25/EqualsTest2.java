package com.day25;

class Person2{
	private long id;
	
	Person2(long id){
		this.id=id;
	}
	
	//Object의 equals() 오버라이딩
	//public boolean equals(Object obj)
	
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Person2) {
			Person2 p = (Person2)obj;
			return this.id == p.id;  //id가 같으면 true를 리턴하도록 오버라이딩
		}else {
			return false;
		}
	}
	
}

public class EqualsTest2 {

	public static void main(String[] args) {
		Person2 p = new Person2(9901071234567L);
		Person2 p2 = new Person2(9901071234567L);
		Person2 p3 = new Person2(9812282934567L);
		
		if(p==p2) {
			System.out.println("p와 p2의 주소는 같다");
		}else {
			System.out.println("p와 p2의 주소는 다르다"); //
		}
				
		if(p.equals(p2)) {  //오버라이딩 메서드 호출
			System.out.println("p와 p2는 같은 사람이다."); //
		}else {
			System.out.println("p와 p2는 다른 사람이다"); 
		}
		
		if(p.equals(p3)) {
			System.out.println("p와 p3는 같은 사람이다."); 
		}else {
			System.out.println("p와 p3는 다른 사람이다"); //
		}
		
	}

}
