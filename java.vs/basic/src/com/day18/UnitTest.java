package com.day18;

class Unit{
	protected int x, y; //유닛의 위치
	
	Unit(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
		
		System.out.println("각 유닛이 지정된 위치로 이동하는 메서드");
	}
	
	public void stop() {
		System.out.println("멈춘다.");
	}
}//class

class Marine extends Unit{
	Marine(int x, int y){
		super(x, y);
	}
	
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
		
		System.out.println("보병이 x="+x+", y=" +y +"인 위치로 이동한다");		
	}
	
	public void stimpack() {
		System.out.println("스팀팩을 사용한다.");
	}
}//class

class Tank extends Unit{
	Tank(int x, int y){
		super(x, y);
	}
	
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
		
		System.out.println("탱크가 x="+x+", y="+y+"인 위치로 이동!");		
	}
	
	public void changeMode() {
		System.out.println("공격모드를 변환한다");
	}
}//class

class Dropship extends Unit{
	Dropship(int x, int y){
		super(x, y);
	}
	
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
		
		System.out.println("x="+x+", y="+y +"인 위치로 수송선이 이동함!");
	}
	
	public void load() {
		System.out.println("선택된 대상을 태운다");
	}
	
	public void unload() {
		System.out.println("선택된 대상을 내린다.");
	}
}//class

public class UnitTest {

	public static void main(String[] args) {
		Unit u = new Marine(10, 20);
		u.move(40, 50);
		
		System.out.println("\n=====배열 이용=======");
		Unit[] uArr=new Unit[5];
		uArr[0] = new Marine(20, 30);
		uArr[1] = new Tank(30, 40);
		uArr[2] = new Marine(50, 70);
		uArr[3] = new Dropship(20, 90);
		uArr[4] = new Tank(100, 60);
		
		for(int i=0;i<uArr.length;i++) {
			uArr[i].move(90, 75);
		}//for
		
		
	}

}
