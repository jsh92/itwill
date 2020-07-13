package com.day13;

public class Triangle2 {
	//1. 멤버변수
	int w;  //밑변  10
	int h; 	//높이  20
	
	//2. 생성자 - 멤버변수 초기화
	public Triangle2(int p_w, int p_h) {
		w=p_w;
		h=p_h;
	}
	
	//3. 메서드
	public int findArea() {
		return w * h /2;
	}
}
