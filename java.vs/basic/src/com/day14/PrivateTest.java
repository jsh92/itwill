package com.day14;

import com.day13.CCC;

public class PrivateTest {

	public static void main(String[] args) {
		AAA obj = new AAA();
		obj.name = "홍길동";  //default는 동일 패키지이므로 접근 가능
		//obj.age = 20; //error, private인 age는 다른 클래스이므로 접근 불가
		//=> The field AAA.age is not visible
		
		obj.showInfo(); //public 메서드는 어디에서든 호출 가능
		
		BBB b = new BBB();
		//b.num1=10;  //error: private
		b.num2=20;	//default
		b.num3=30;	//protected	
		b.num4=40;	//public
		
		b.showInfo();
		
		CCC c = new CCC();
		//c.val1 = 100;  //error: private
		//c.val2 = 200;	//error: default
		//c.val3 = 300;	//error: protected, The field CCC.val3 is not visible	
		c.val4 = 400;	//public
		
		c.showInfo();
		
		//DDD d = new DDD();  //error: default
	}

}//class

/*
 접근 제한자 - 클래스나 멤버에 사용되어 외부로부터의 접근을 제한하는 역할
 public > protected > default(생략형) > private
 
 [1] private - 같은 클래스에서만 접근 가능
 [2] default - 같은 패키지에서만 접근 가능
 [3] protected - 같은 패키지는 물론 다른 패키지일지라도 상속관계에서는 접근 가능
 [4] public - 어디에서나 접근 가능 
 
 클래스, 생성자 - public, default
 메서드, 멤버변수 - public, protected, default, private
 지역변수 - 사용불가
  */

class AAA{
	private int age;  	//같은 클래스에서만 접근 가능
	String name;		//같은 패키지에서만 접근 가능
	
	public void showInfo() {
		System.out.println("나이 : " + age);
		System.out.println("이름 : " + name);
	}
}//class





