package com.day13;

import java.util.Scanner;

public class TriangleTest4 {

	public static void main(String[] args) {
		//4. 별도의 클래스에서 삼각형 면적 구하는 메서드 만들어서 처리
		//(멤버변수 이용)
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변, 높이 입력!");
		int w=sc.nextInt(); //10
		int h=sc.nextInt(); //20
				
		//객체 생성 후 참조변수.메서드() 로 호출
		Triangle2 tr = new Triangle2(w, h); //생성자에 매개변수를 넘겨준다
		int area=tr.findArea();
		
		System.out.println("\n삼각형 면적 : " + area);
		
		//멤버변수의 값 변경
		tr.w=100;
		tr.h=200;
		
		area=tr.findArea();
		System.out.println("변경된 면적 : " + area);
	}

}
