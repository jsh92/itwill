package com.day13;

import java.util.Scanner;

class Circle2{
	//1.멤버변수 (속성, 상태정보, 데이터)
	int radius;  //반지름  10  20  30
			
	//2. 생성자
	Circle2(int p_radius){
		radius=p_radius;				
	}
		
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

public class CircleTest2 {

	public static void main(String[] args) {
		//객체 생성 후 참조변수.메서드()로 메서드 호출
		Circle2 c = new Circle2(10); //객체 생성시 생성자 호출부분에서 매개변수를
		//반드시 넘겨야 함
		//new 오른쪽 부분이 생성자를 호출하는 부분
		
		double area=c.findArea();
		System.out.println("원의 면적 : " + area);
		
		double girth=c.findGirth();
		System.out.println("원의 둘레 : " + girth);
		
	}

}
