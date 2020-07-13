package com.day17;

/*
 final - 마지막의, 변경할 수 없는
 
 1) final 클래스 - 부모 클래스가 될 수 없다
 2) final 메서드 - 오버라이딩할 수 없다
 3) final 멤버변수 - 값을 변경할 수 없는 상수
    final 지역변수
*/
final class Parent3{
	
}//class

/*
class Child3 extends Parent3{  //error
	//=> The type Child3 cannot subclass the final class Parent3
	//=> 부모 클래스가 될 수 없다
}//class
*/

public class FinalTest {

	public static void main(String[] args) {
		
		
	}

}
