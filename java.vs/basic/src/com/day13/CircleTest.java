package com.day13;

import java.util.Scanner;

class Circle{
	//1.멤버변수 (속성, 상태정보, 데이터)
	int radius;  //반지름  10  20  30
			
	//3. 메서드 (기능, 행동)
	//원의 면적 구하는 기능
	public double findArea() {
		double area = radius*radius*3.14;
		return area;
	}
	
	//원의 둘레 구하는 기능
	public double findGirth() {
		double girth = 2*3.14*radius;
		return girth;
	}
	
}//class

public class CircleTest {

	public static void main(String[] args) {
		//원의 면적을 구하시오. 
		//=> findArea()메서드 사용
		//=> static 메서드가 아니므로 객체 생성 후 참조변수.메서드() 로 호출
		
		//1. 객체 생성
		Circle c = new Circle();
		
		//2. 메서드 호출(사용)
		//먼저 멤버변수에 값 할당
		c.radius=10;
		double area = c.findArea();
		
		System.out.println("원의 면적 : " + area);
		
		//멤버변수의 값 변경
		int r = 20;
		c.radius=r;
		area=c.findArea();
		System.out.println("변경된 반지름 이용한 원의 면적 : " +  area);
		
		//사용자로부터 반지름 입력받아서 처리
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름 입력하세요");
		r = sc.nextInt();
		c.radius=r;  //30
		
		area=c.findArea();
		System.out.println("반지름이 " + r +"인 원의 면적 : " + area);
		
		//원의 둘레 구하기
		double girth = c.findGirth();
		System.out.println("원의 둘레 : " + girth);
		
	}

}
