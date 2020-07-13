package com.day14;

public class Triangle {
	//1. 멤버변수
	private int width, height;
	
	//2. 생성자
	public Triangle(int width, int height) {
		this.width=width;
		this.height=height;
		
		/* this
		  - 자기 자신을 가리키는 this
		  - 자신의 멤버를 가리키는 this (this.멤버)  
		  - 인스턴스 자신을 가리키는 참조변수
		  - 인스턴스의 주소가 저장되어 있음	
		*/
	}
	
	//3. getter/setter
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width=width;
	}
	
	public int getHeight() {
		return height;				
	}
	
	public void setHeight(int height) {
		this.height=height;		
	}
	
	//4. 메서드
	public int findArea() {
		return width * height / 2;
	}
}
