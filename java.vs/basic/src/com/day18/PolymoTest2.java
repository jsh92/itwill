package com.day18;

import java.util.Scanner;

class Shape{
	public void draw() {
		System.out.println("그리는 메서드");
	}
	
	public void delete() {
		System.out.println("지우는 메서드");
	}
	
	public void display() {
		System.out.println("Shape - display()메서드!!");
	}
}//class

class Circle extends Shape{
	public void draw() {
		System.out.println("원을 그립니다.");
	}
	
	public void delete() {
		System.out.println("원을 지웁니다.");
	}
	
	public void sayCircle() {
		System.out.println("Circle만의 메서드!");
	}
}//class

class Triangle extends Shape{
	public void draw() {
		System.out.println("삼각형을 그립니다.");
	}
	
	public void delete() {
		System.out.println("삼각형을 지웁니다.");
	}
	
	public void sayTriangle() {
		System.out.println("Triangle만의 메서드!");
	}
}//class

public class PolymoTest2 {
	public static void main(String[] args) {
		//기본 사용법
		Circle c = new Circle();
		c.draw();
		c.delete();
		c.sayCircle();
		c.display();  //부모로부터 상속받은 메서드
		
		//다형성 이용
		System.out.println("\n=====다형성 이용======");
		Shape sh = new Circle(); //부모의 참조변수에 자식 인스턴스 할당
		sh.draw();	//자식의 오버라이딩 메서드 호출
		sh.delete();
		sh.display(); //부모 메서드
		//sh.sayCircle(); //error : 자식만의 메서드 사용 불가
		
		sh = new Triangle();
		sh.draw();
		sh.delete();
		
		//사용자로부터 원이나 삼각형 중 선택하도록 처리
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n1.원, 2.삼각형 선택하세요!");
		int type=sc.nextInt();
		
		//기존 방식 이용
		if(type==1) {
			Circle c2 = new Circle();			
			c2.draw();
			c2.delete();
		}else if(type==2) {
			Triangle tr = new Triangle();
			tr.draw();
			tr.delete();
		}else {
			System.out.println("잘못 입력!");
		}
		
		//다형성 이용
		System.out.println("\n----[ 다형성 이용 ]-----");
		Shape sh3 = null;
		if(type==1) {
			sh3=new Circle();
		}else if(type==2) {
			sh3=new Triangle();
		}else {
			System.out.println("잘못 입력!!");
			return;
		}//if
		
		sh3.draw();
		sh3.delete();
		
		//메서드로 만들어서 처리
		System.out.println("\n===메서드 만들어서 호출===");
		Shape sh4 =createShape(type);
		if(sh4!=null) {
			sh4.draw();
			sh4.delete();
		}
		
	}//main

	//type에 따라 원이나 삼각형을 리턴해주는 메서드
	public static Shape createShape(int type) {
		Shape sh3 = null;
		
		if(type==1) {
			sh3=new Circle();
		}else if(type==2) {
			sh3=new Triangle();
		}
		
		return sh3;
	}
	
}//class
