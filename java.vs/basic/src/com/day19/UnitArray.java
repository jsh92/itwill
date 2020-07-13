package com.day19;

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

public class UnitArray {

	public static void main(String[] args) {
		//Unit => 4
		Unit[] uArr = new Unit[4];
		uArr[0] = new Marine(10, 20);
		uArr[1] = new Tank(30, 50);
		uArr[2] = new Marine(40, 60);
		uArr[3] = new Dropship(17, 34);
		
		//[1] 오버라이딩 메서드 호출
		for(int i=0;i<uArr.length;i++) {
			uArr[i].move(90, 120);
		}//for
		
		System.out.println("\n--확장 for---");
		for(Unit u : uArr) {
			u.move(100, 200);
		}
				
		//[2] 자식만의 메서드 호출
		for(int i=0;i<uArr.length;i++) {
			if(uArr[i] instanceof Marine) {
				Marine m = (Marine)uArr[i];
				m.stimpack();
			}else if(uArr[i] instanceof Tank) {
				Tank t = (Tank)uArr[i];
				t.changeMode();						
			}else if(uArr[i] instanceof Dropship) {
				Dropship d = (Dropship)uArr[i];
				d.load();
				d.unload();
			}			
		}//for
		
		System.out.println("\n====확장 for====");
		for(Unit u : uArr) {
			if(u instanceof Marine) {
				Marine m = (Marine)u;
				m.stimpack();
			}else if(u instanceof Tank) {
				Tank t = (Tank)u;
				t.changeMode();						
			}else if(u instanceof Dropship) {
				Dropship d = (Dropship)u;
				d.load();
				d.unload();
			}
		}//for
		
	}

}
