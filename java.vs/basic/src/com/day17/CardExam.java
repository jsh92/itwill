package com.day17;

public class CardExam {

	public static void main(String[] args) {
		Card[] cardArr=new Card[3];
		cardArr[0]= new Card("Spade", 4);
		cardArr[1]= new Card("Diamond", 6);
		cardArr[2]= new Card("Heart", 10);
		
		for(int i=0;i<cardArr.length;i++) {
			cardArr[i].showInfo();
		}//for
		
	}

}
