package com.day26;

public class Anonymous1 {
	//익명 클래스 - 클래스의 선언과 객체 생성을 동시에 함. 일회성 사용
	/*
	new 부모 클래스() {
		//멤버 선언
	}
	*/
	
	Object obj = new Object() {
		public void method1() {
			
		}
	};
	
	static Object obj2 = new Object() {
		public void method1() {}
	};
	
	public void func() {
		Object obj3 = new Object() {
			public void method1() {}
		};
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
