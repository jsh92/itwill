package com.day19;

abstract class Animal{  //추상 클래스
	public abstract void sound();  //추상 메서드
	
	public void showInfo() {
		System.out.println("Animal의 showInfo() 메서드");
	}
	
	/*
	  추상 메서드 - 메서드의 구현부가 없는 것, {}블럭이 없고 선언부만 존재
	  			자식 클래스에서 알맞게 구현해야 함 (오버라이딩 해야 함)
	  			
	  			public abstract 반환타입  메소드명(매개변수);
	  			
	 추상 클래스 - 미완성 클래스
	  			추상메서드를 포함하고 있으면 추상 클래스가 됨
	  			추상 메서드가 없더라도 abstract를 붙이면 추상 클래스가 됨
	  			추상 클래스는 미완성 클래스이므로 객체 생성할 수 없다

	 abstract class 클래스명{
	 	추상 메서드();
	 } 			
	 
	 abstract class 클래스명{
	 	일반 메서드();
	 }
	 
	※ 추상 클래스
	- 상속의 관계를 형성하기 위한 상위 클래스로 
	    인스턴스화시키기 위해서 정의한 클래스가 아닌 경우 추상 클래스로 만든다

	※ 추상 메서드
	- 오버라이딩의 관계를 형성하기 위해 정의된 메서드, 
	    비어있는 메서드는 추상 메서드로 만든다
	 */
	
}//

class Dog extends Animal{
	public void sound() {
		System.out.println("멍멍!");
	}
}//

class Cat extends Mammal{
	public void sound() {
		System.out.println("야옹");
	}
}//

abstract class Mammal extends Animal{  //포유류
	public void breed(int n) {
		System.out.println(n +"마리 새끼를 낳는다");
	}
	
	//추상 클래스를 상속받은 자식 클래스에서 추상 메서드를 모두 구현해야
	//일반 클래스가 됨
	//하나라도 구현하지 않은 추상 메서드가 남아 있다면 자식 클래스도 추상 클래스가
	//되어야 함
}//

public class AbstractTest {
	public static void main(String[] args) {
		//Animal ani = new Animal(); //error:추상 클래스는 객체 생성 불가
		
		Dog d = new Dog();  //자식이 추상 메서드를 오버라이딩하면
							//자식은 완전한 클래스가 되어 객체 생성이 가능해짐
		d.sound();
		
		Cat c = new Cat();
		c.sound();
		
		Animal ani = new Cat();  //추상 클래스도 다형성 이용 가능
		ani.sound();
		
		//Mammal m = new Mammal();  //error : 자식도 추상클래스이므로
									//객체 생성 불가
		Mammal m = new Cat();
		m.sound();
		m.breed(2);
		
	}

}
