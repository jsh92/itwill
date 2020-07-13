package com.day18;

import java.util.Scanner;

public class ShapeArray2 {
	final static int MAX_COUNT = 2; 
	static Scanner sc = new Scanner(System.in);
	
	static Shape2[] shArr=new Shape2[MAX_COUNT];
	static int idx=0;
		
	public static void showMenu() {
		System.out.println("1.원 입력, 2.사각형 입력, 3.면적 출력, 4.종료");
	}
	
	public static void inputCircle() {
		if(idx==MAX_COUNT) {
			System.out.println("더 이상은 데이터를 입력할 수 없습니다.");
			return;
		}
		
		System.out.println("반지름 입력하세요");
		int r = sc.nextInt();
		
		shArr[idx++] = new Circle2(r);
	}
	
	public static void inputRect() {
		if(idx==MAX_COUNT) {
			System.out.println("더 이상은 데이터를 입력할 수 없습니다.");
			return;
		}
		
		System.out.println("가로, 세로 입력하세요");
		int w=sc.nextInt();
		int h=sc.nextInt();
		
		shArr[idx++] = new Rect2(w, h);
	}
	
	public static void printAll() {
		if(idx==0) {
			System.out.println("데이터가 존재하지 않습니다.");
			return;
		}
		
		System.out.println("\n=====도형들의 면적======");
		for(int i=0;i<idx;i++) {
			double area=shArr[i].findArea();
			System.out.println("면적 : " + area);
		}//for
	}
	
	public static void main(String[] args) {
		
		while(true) {
			showMenu();
			
			int type=sc.nextInt();
			
			switch(type) {
				case 1:
					inputCircle();
					
					break;
				case 2:
					inputRect();
					
					break;
				case 3:
					printAll();
					
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
