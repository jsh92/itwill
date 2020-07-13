package com.day26;

import java.util.ArrayList;

class Card2{
	enum Kind { SPADE, DIAMOND, HEART, CLOVER }
	enum Number { TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN
				 , JACK, QUEEN, KING, ACE }
	
	final Kind KIND;
	final Number NUMBER;
	
	Card2(Kind k, Number n){
		this.KIND=k;
		this.NUMBER=n;
	}
	
	Card2(){
		this(Kind.SPADE, Number.TWO);
	}
	
	public String toString() {
		return "Card2[KIND=" + KIND + ", NUMBER=" + NUMBER + "]";
	}
}//

class Deck2{
	private ArrayList<Card2> cardList = new ArrayList<Card2>();
	
	Deck2(){
		//Card2.Kind[] kArr = Card2.Kind.values();
		//Card2.Number[] nArr = Card2.Number.values();
		
		for(Card2.Kind k : Card2.Kind.values()) {
			for(Card2.Number n : Card2.Number.values()) {
				cardList.add(new Card2(k, n));
			}
		}//for
	}
	
	public ArrayList<Card2> getCardList(){
		return cardList;
	}
	
	public Card2 pick(int index) {
		Card2 c = cardList.get(index);
		return c;
	}
}//

public class EnumTest3 {
	public static void main(String[] args) {
		Deck2 deck = new Deck2();
		
		Card2 c = deck.pick(0);
		System.out.println("첫번째 카드 : "+c);
		System.out.println("두번째 카드 : " + deck.pick(1)+"\n\n");
		
		ArrayList<Card2> list = deck.getCardList();
		for(int i=0;i<list.size();i++) {
			//Card2 card = list.get(i);
			//System.out.println(card);
			
			Card2 card =deck.pick(i);
			System.out.println(card);
		}
		
	}

}
