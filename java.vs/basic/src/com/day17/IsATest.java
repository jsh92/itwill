package com.day17;

/*
※ 클래스를 재사용하는 방법
[1] 상속관계 이용
is a 관계가 성립하면 상속을 이용
~는 일종의 ~이다

예) SportCar는 일종의 Car이다
SportCar is a Car.

[2] 포함관계 이용
has a 관계가 성립하면 포함관계 이용
~는 ~를 가지고 있다

예) Circle은 Point를 가지고 있다
Circle has a point.
 */

//상속관계 이용
class Point{
	protected int x, y;
	
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}	
}//class

class Circle extends Point{
	private int r;
	
	Circle(int x, int y, int r){
		super(x, y);
		this.r=r;
	}
	
	public void showInfo() {
		System.out.println("원점의 x좌표 : " + x);
		System.out.println("원점의 y좌표 : " + y);
		System.out.println("반지름 : " + r);		
	}
}//class

public class IsATest {

	public static void main(String[] args) {
		Circle c = new Circle(10, 20, 50);
		c.showInfo();
				
	}

}
