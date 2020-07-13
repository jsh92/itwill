package com.day21;

class Card{
	private final int KIND; //카드종류 1~4
	private final int NUMBER; //카드 숫자 1~10, J, Q, K
	
	private static final int SPADE=1;
	private static final int DIAMOND=2;
	private static final int HEART=3;
	private static final int CLOVER=4;
	
	public static final int MAX_KIND=4;
	public static final int MAX_NUMBER=13;
	
	Card(int k, int n){
		this.KIND=k;  //상수지만 생성자에서 단 한번 초기화, 객체별로 다른 값 할당 가능
		this.NUMBER=n;
	}
	
	Card(){
		this(SPADE, 1);  //자신의 다른 생성자 호출
	}
	
	public String findInfo() {
		String k="", n="";
		
		switch(KIND){
			case SPADE:
				k="SPADE";break;
			case DIAMOND:
				k="DIAMOND";break;
			case HEART:
				k="HEART";break;
			case CLOVER:
				k="CLOVER";break;				
		}
		
		switch(NUMBER) {
			case 11:
				n = "J";break;
			case 12:
				n = "Q";break;
			case 13:
				n = "K";break;
			default:
				n = NUMBER+"";
		}
		
		return "[Card: KIND=" + k+", NUMBER="+ n +"]";
	}
}//

//카드 한벌 - 52장의 카드
class Deck{
	private static final int MAX_CARD=52;
	
	//52장의 카드를 담을 배열
	private Card[] cardArr = new Card[MAX_CARD];
	private int idx;
	
	Deck() {
		//52장의 카드를 만들어서 카드 배열에 저장
		for(int i=1;i<=Card.MAX_KIND;i++) { //4
			for(int j=1;j<=Card.MAX_NUMBER;j++) { //13
				Card c = new Card(i, j);
				
				cardArr[idx++] = c;
			}
		}//for		
	}
	
	//getter
	public Card[] getCardArr() {
		return cardArr;
	}
	
	public Card pick(int index) {
		//index번째 카드 뽑기
		Card c=null;
		if(index<0 || index >= MAX_CARD) {
			c = pick();
		}else {
			c = cardArr[index];
		}
		
		return c;
	}
	
	public Card pick() {
		//임의의 카드 뽑기
		int rnd = (int)(Math.random()*52);
		return cardArr[rnd];
	}
	
	public void shuffle() {
		//카드 섞어주기
		for(int i=0;i<1000;i++) {
			int rnd = (int)(Math.random()*52);
			
			Card temp = cardArr[0];
			cardArr[0] = cardArr[rnd];
			cardArr[rnd] = temp;
		}//for
	}
}//

public class CardTest {
	public static void main(String[] args) {
		Deck d = new Deck();
		
		Card c=d.pick(0);
		String info=c.findInfo();
		System.out.println("첫번째 카드 정보 : " + info+"\n");
		
		System.out.println("====카드 섞기 전 52장의 카드 정보===");
		Card[] arr=d.getCardArr();
		for(int i=0;i<arr.length;i++) {
			String str = arr[i].findInfo();
			System.out.println(str);
		}//for
		
		//카드 섞기
		d.shuffle();
		System.out.println("\n======카드를 섞은 후=======");
		for(Card c2 : arr) {
			System.out.println(c2.findInfo());
		}//for
		
		
	}

}





