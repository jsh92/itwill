package com.day20;

import java.util.Scanner;

/*
 인터페이스
 - 일종의 추상 클래스
 - 추상 메서드와 상수만 멤버로 가질 수 있다
 - 메서드 목록만 나열한 것
 - 밑그림만 그려져 있는 기본 설계도
 - 표준을 제시하는 용도로 사용
 - 일종의 약속, 최소한의 계약사항 명시
 
 interface 인터페이스명{
 	public static final 상수;
 	public abstarct 추상 메서드();
 }
 => public static final이나 public abstract은 생략 가능
 
 자식클래스에서 구현할 때 implements 키워드 사용
 class 자식 클래스 implements 인터페이스{
 
 }
 */

interface IAnimal{
	public abstract void sound();
	void showInfo();
}//

class Dog implements IAnimal{
	public void sound() {
		System.out.println("멍멍!");
	}
	
	public void showInfo() {
		System.out.println("Dog의 메서드");
	}
}//class

abstract class Mammal implements IAnimal{
	public void showInfo() {
		System.out.println("포유류의 메서드");
	}
	
	//sound()는 구현 불가
	//=> 추상 메서드가 남아 있으므로 자식도 추상 클래스가 됨
}//class

class Cow extends Mammal{
	public void sound() {
		System.out.println("음메~");
	}
	
	//=> 구현하지 못했던 sound() 추상 메서드를 구현했으므로 완전한 클래스가 됨
}//class

class Cat implements IAnimal{
	public void sound() {
		System.out.println("야옹");
	}
	
	/*
	void showInfo() {  //error:Cannot reduce the visibility of the inherited method from IAnimal
		System.out.println("Cat의 메서드");
	}
	//interface의 메서드는 public abstract 이므로 
	//오버라이딩할 때 접근 제한자의 범위가 더 좁아져서는 안된다
	*/
	
	public void showInfo() { 
		System.out.println("Cat의 메서드");
	}	
}//class

public class InterfaceTest {
	public static void main(String[] args) {
		//IAnimal ani = new IAnimal() //error: //error:Cannot reduce the visibility of the inherited method from IAnimal
		//=> 인터페이스는 객체 생성 불가		
		
		Dog d = new Dog();
		d.sound();
		d.showInfo();
		
		//Mammal m = new Mammal(); //error=> 추상메서드 객체 생성 불가
		Cow c = new Cow();
		c.sound();
		
		//인터페이스도 다형성 이용 가능
		IAnimal ani = new Cat();
		ani.sound();
		ani.showInfo();
		
		Mammal mam = new Cow();
		mam.sound();
		
		//사용자 입력 받아서 처리
		Scanner sc = new Scanner(System.in);
		System.out.println("\n1.강아지 2.고양이 3.소  선택!");
		int type=sc.nextInt();
		
		IAnimal iAni = null; 
		if(type==1) {
			iAni = new Dog();
		}else if(type==2) {
			iAni = new Cat();
		}else if(type==3) {
			iAni = new Cow();
		}else {
			System.out.println("잘못 입력!");
			return;
		}
		
		iAni.sound();
	}

}
