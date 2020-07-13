package com.day20;

abstract class Unit{
	protected int x, y; //유닛의 위치
	
	Unit(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public abstract void move(int x, int y);
	
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
		Unit[] uArr = new Unit[4];
		uArr[0] = new Marine(10, 20);
		uArr[1] = new Tank(30, 40);
		uArr[2] = new Dropship(60, 70);
		uArr[3] = new Marine(90, 45);
		
		for(int i=0;i<uArr.length;i++) {
			uArr[i].move(120, 140);
		}//for
				
	}

}
