package com.day20;

interface Attackable{
	void attack(Unit2 u);  //해당 유닛을 공격하는 기능
}

interface Movable{
	void move(int x, int y); //지정된 위치로 이동하는 기능
}

//인터페이스끼리는 extends 키워드를 이용하여 서로 상속 가능
//다중 상속도 가능
interface Fightable extends Attackable, Movable{
}

abstract class Unit2{
	protected int x, y; //유닛의 위치
	protected int currentHp; //유닛의 체력
	
	Unit2(int x, int y, int currentHp){
		this.x=x;
		this.y=y;
		this.currentHp=currentHp;
	}
}//

class Fighter extends Unit2 implements Fightable{
	Fighter(int x, int y, int currentHp){
		super(x, y, currentHp);
	}
	
	public void attack(Unit2 u) {
		System.out.println("x=" + u.x +", y=" + u.y
			+"인 위치에 있고, 체력이 " + u.currentHp +"인 유닛을 공격한다.");
	}
	
	public void move(int x, int y) {
		System.out.println("x=" + x +", y=" + y +"인 위치로 이동한다.");
	}
}

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter(10, 20, 150);
		//40, 50 위치로 이동하기
		f.move(40, 50);
		
		//동일 위치에 있는 유닛 공격하기
		Unit2 u = new Fighter(40, 50, 100);
		f.attack(u);
		
		//자식은 부모의 인스턴스이기도 하다
		if(f instanceof Unit2) {
			System.out.println("f는 Unit2의 인스턴스이기도 하다");
		}
		if(f instanceof Fightable) {
			System.out.println("f는 Fightable을 구현한 클래스이다.");
		}
		if(f instanceof Attackable) {
			System.out.println("f는 Attackable을 구현한 클래스이다.");
		}
		if(f instanceof Movable) {
			System.out.println("f는 Movable을 구현한 클래스이다.");
		}
		if(f instanceof Object) {
			System.out.println("f는 Object의 인스턴스이기도 하다");
		}
		
		
		
		
		
	}

}
