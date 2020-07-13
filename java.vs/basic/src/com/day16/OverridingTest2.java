package com.day16;

class Shape{
	public void draw() {
		System.out.println("도형을 그리는 메서드!");
	}
}//class

class Triangle extends Shape{
	/*
	 오버라이딩 메서드의 조건
	 - 부모의 선언부와 완전히 일치해야 함
	 (메서드이름, 매개변수, 반환타입)
	 
	 - 접근 제한자는 같거나 더 넓어져야 함
	 예) 부모 클래스의 메서드가 default라면
	 	자식의 오버라이딩 메서드는 default, protected, public 이어야 함
	 
	 - 예외는 같거나 더 적게 선언해야 함 
	 */
	public void draw() {
		System.out.println("삼각형을 그립니다.");
	}
}//class

public class OverridingTest2 {
	public static void main(String[] args) {
		Shape sh = new Shape();
		sh.draw();
		
		Triangle tr = new Triangle();
		tr.draw();
		
		Shape sh2 = new Triangle();
		sh2.draw(); 
	}
}
