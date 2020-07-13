package com.day25;

class Test{
	private int value;
	
	Test(int value){
		this.value=value;
	}
}//

public class EqualsTest {

	public static void main(String[] args) {
		Test t = new Test(100);
		Test t2 = new Test(100);
		
		if(t.equals(t2)) { //Object의 equals 메서드 호출
			System.out.println("t와 t2의 주소는 같다");
		}else {
			System.out.println("t와 t2의 주소는 다르다");
		}
		
		if(t == t2) {
			System.out.println("t와 t2의 주소는 같다");
		}else {
			System.out.println("t와 t2의 주소는 다르다");
		}
		
		/*
		 ※ 연산자 ==
		 [1] 기본형에서는 값 비교
		 [2] 참조형에서는 주소 비교
		 
		 ※ String의 equals() 메서드 - 문자열의 값 비교
		 					    - Object의 equals()를 오버라이딩한 것
		 					   
		 ※ Object의 equals() 메서드 - 주소 비교 					   	
		 */
		
		t=t2;
		if(t.equals(t2)) {
			System.out.println("t와 t2의 주소는 같아짐");
		}else {
			System.out.println("t와 t2의 주소는 다르다");
		}
	}

}
