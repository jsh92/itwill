package com.day18;

import java.util.Scanner;

class Shape2{
	public double findArea() {
		return 0;
	}
}//class

class Circle2 extends Shape2{
	private int r;
	private final double PI=3.141592;
	
	Circle2(int r){
		this.r=r;
	}
	
	public double findArea() {
		return PI*r*r;
	}
}//class

class Rect2 extends Shape2{
	private int w, h;
	
	Rect2(int w, int h){
		this.w=w;
		this.h=h;
	}
	
	public double findArea() {
		return w*h;
	}
}//class

public class ShapeArray {
	public static void main(String[] args) {
		final int MAX_COUNT = 2; 
		Scanner sc = new Scanner(System.in);
		
		Shape2[] shArr=new Shape2[MAX_COUNT];
		int idx=0;
		
		while(true) {
			System.out.println("1.원 입력, 2.사각형 입력, 3.면적 출력, 4.종료");
			int type=sc.nextInt();
			
			switch(type) {
				case 1:
					if(idx==MAX_COUNT) {
						System.out.println("더 이상은 데이터를 입력할 수 없습니다.");
						break;
					}
					
					System.out.println("반지름 입력하세요");
					int r = sc.nextInt();
					
					shArr[idx++] = new Circle2(r);
					break;
				case 2:
					if(idx==MAX_COUNT) {
						System.out.println("더 이상은 데이터를 입력할 수 없습니다.");
						break;
					}
					
					System.out.println("가로, 세로 입력하세요");
					int w=sc.nextInt();
					int h=sc.nextInt();
					
					shArr[idx++] = new Rect2(w, h);
					break;
				case 3:
					if(idx==0) {
						System.out.println("데이터가 존재하지 않습니다.");
						break;
					}
					
					System.out.println("\n=====도형들의 면적======");
					for(int i=0;i<idx;i++) {
						double area=shArr[i].findArea();
						System.out.println("면적 : " + area);
					}//for
					
					break;
				case 4:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못 입력!!");
					continue;
			}//switch
		}//while
		
	}

}
