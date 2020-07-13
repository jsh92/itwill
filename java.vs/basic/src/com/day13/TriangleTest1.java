package com.day13;

import java.util.Scanner;

public class TriangleTest1 {

	public static void main(String[] args) {
		//1. main에서 삼각형 면적 구하기
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 밑변, 높이를 입력하세요");
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int area = w * h / 2;
		
		System.out.println("삼각형 면적 : " + area);
	}

}
