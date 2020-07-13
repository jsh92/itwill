package com.day18;

import java.util.Scanner;

class ShapeManager{
	final int MAX_COUNT = 2; 
	Scanner sc = new Scanner(System.in);
	
	Shape2[] shArr=new Shape2[MAX_COUNT];
	int idx=0;
		
	public void showMenu() {
		System.out.println("1.원 입력, 2.사각형 입력, 3.면적 출력, 4.종료");
	}
	
	public void inputCircle() {
		if(idx==MAX_COUNT) {
			System.out.println("더 이상은 데이터를 입력할 수 없습니다.");
			return;
		}
		
		System.out.println("반지름 입력하세요");
		int r = sc.nextInt();
		
		shArr[idx++] = new Circle2(r);
	}
	
	public void inputRect() {
		if(idx==MAX_COUNT) {
			System.out.println("더 이상은 데이터를 입력할 수 없습니다.");
			return;
		}
		
		System.out.println("가로, 세로 입력하세요");
		int w=sc.nextInt();
		int h=sc.nextInt();
		
		shArr[idx++] = new Rect2(w, h);
	}
	
	public void printAll() {
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
}

public class ShapeArray3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ShapeManager sm = new ShapeManager();
		
		while(true) {
			sm.showMenu();
			
			int type=sc.nextInt();
			
			switch(type) {
				case 1:
					sm.inputCircle();
					
					break;
				case 2:
					sm.inputRect();
					
					break;
				case 3:
					sm.printAll();
					
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
