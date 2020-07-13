package com.day17;

class Card{
	public static final int WIDTH = 120;
	public static final int HEIGHT = 200;
	
	//final 변수는 선언시 초기화하는 대신 생성자에서 단 한번 초기화할 수 있다
	//=> 인스턴스마다 다른 값을 갖게 할 수 있다
	public final String KIND;
	final int NUMBER;
	
	Card(String k, int num){
		this.KIND=k;
		this.NUMBER=num;
	}
	
	public void showInfo() {
		System.out.println("카드 종류 : " + KIND);
		System.out.println("카드 숫자 : " + NUMBER+"\n");
	}
}//class

public class CardTest {

	public static void main(String[] args) {
		Card c1 = new Card("Heart", 3);
		c1.showInfo();
		
		System.out.println("카드의 가로 크기 : " + Card.WIDTH);
		System.out.println("세로 크기 : " + Card.HEIGHT+"\n");
		
		Card c2 = new Card("Diamond", 7);
		c2.showInfo();
		
		//Card.WIDTH=100;  //error
		//c2.KIND = "Clover"; //error
		
		
	}

}
