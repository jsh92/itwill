package com.day13;

import java.util.Scanner;

public class TriangleTest3 {

	public static void main(String[] args) {
		//3. 별도의 클래스에서 삼각형 면적 구하는 메서드 만들어서 처리
		//(멤버변수 없는 클래스)
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변, 높이 입력!!");
		int w = sc.nextInt();
		int h = sc.nextInt();
				
		//객체 생성 후 참조변수.메서드() 로 호출
		Triangle tr = new Triangle();
		int area=tr.findArea(w, h);
		
		System.out.println("면적 : " +  area);
	}

}
