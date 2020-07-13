package com.day16;

/*
 this.멤버 => 자신의 멤버를 가리키는 this
 this() => 생성자를 호출하는 this()
 		   자신의 생성자들 중 다른 생성자 호출
 		   생성자의 첫줄에서만 호출 가능	 
*/

class Car{
	private String color;
	private String gearType;  //auto, manual
	private int door; //차 문의 개수
	
	Car(String color, String gearType, int door){
		this.color=color;
		this.gearType=gearType;
		this.door=door;
	}
	
	Car(){
		this("White", "Auto", 4);  //다른 생성자 호출
		
		/*this.color="White";
		this.gearType="Auto";
		this.door=4;*/
	}
	
	Car(String color){
		this(color, "Auto", 4);  //매개변수가 3개인 다른 생성자 호출
	}
	
	public void showInfo() {
		System.out.println("색상 : " + color);
		System.out.println("변속기 종류 : " + gearType);
		System.out.println("차 문의 개수 : " + door+"\n");
	}
}//class

public class CarTest {
	public static void main(String[] args) {
		Car c = new Car();
		c.showInfo();
		
		Car c2 = new Car("Black");
		c2.showInfo();
		
		Car c3 = new Car("Red", "Manual", 2);
		c3.showInfo();
				
	}

}
