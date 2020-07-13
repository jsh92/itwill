package com.day26;

import com.day26.Card.Kind;
import com.day26.Card.Number;

class Card1{
	static final int SPADE=0;
	static final int DIAMOND=1;
	static final int HEART=2;
	static final int CLOVER=3;
	
	static final int TWO=0;
	static final int THREE=1;
	
	final int KIND;
	final int NUMBER;
	
	Card1(int k, int n){
		this.KIND=k;
		this.NUMBER=n;
	}
	
	public void showInfo() {
		System.out.println("KIND = " + KIND);
		System.out.println("NUMBER = " + NUMBER+"\n");
	}
}

class Card{
	enum Kind{SPADE, DIAMOND, HEART, CLOVER};
	enum Number{TWO, THREE};
	
	final Kind KIND;
	final Number NUMBER;
	
	Card(Kind k, Number n){
		this.KIND=k;
		this.NUMBER=n;
	}
	
	public void showInfo() {
		System.out.println("KIND = " + KIND);
		System.out.println("NUMBER = " + NUMBER+"\n");
	}
}

public class EnumTest2 {
	public static void main(String[] args) {
		Card1 c1 = new Card1(0, 0);
		c1.showInfo();
		
		Card c = new Card(Card.Kind.SPADE, Card.Number.TWO);
		c.showInfo();
		
		if(Card1.SPADE == Card1.TWO) { //0==0
			System.out.println("Card1의 SPADE와 Card1의 TWO는 같다");//
		}else {
			System.out.println("Card1의 SPADE와 Card1의 TWO는 다르다");
		}
		
		/*if(Card.Kind.SPADE == Card.Number.TWO) {//Incompatible operand types Card.Kind and Card.Number
			System.out.println("Card.Kind.SPADE와 Card.Number.TWO는 같다");
		}else {
			System.out.println("Card.Kind.SPADE와 Card.Number.TWO는 다르다");
		}
		*/
		
		/*
		  이전 방식으로는 타입이 달라도 값이 같으면, 조건식 결과가 true 였으나, 
		  새로 도입된 타입에 안전한 열거형에서는 실제 값이 같아도
		  타입이 다르면 조건식의 결과가 false 가 됨
		  
		  값 뿐만 아니라 타입까지 체크하기 때문에 타입에 안전한(typesafe) 열거형이라고 함
		 */
	}

}
