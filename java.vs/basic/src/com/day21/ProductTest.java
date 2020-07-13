package com.day21;

/*
abstract class Product{
	protected int price; //상품 가격
	protected int bonusPoint; //포인트 점수
	private static final double POINT_RATE = 0.02; 
	//=> 포인트 점수는 상품의 2%
	
	Product(int price){
		this.price=price;
		this.bonusPoint=(int)(price * POINT_RATE);		
	}
	
	public abstract String findInfo(); //상품명 리턴
}//

class Tv extends Product{
	Tv(int price){
		super(price);
	}
	
	public String findInfo() {
		return "Tv";
	}
}//

class Computer extends Product{
	Computer(int price){
		super(price);
	}
	
	public String findInfo() {
		return "Computer";
	}
}//

class Buyer{  //구매자
	private int myMoney;
	private int point;
	
	Buyer(int myMoney){
		this.myMoney=myMoney;
	}
	
	public void buyProduct(Product p) {
		myMoney -= p.price;  //상품가격만큼 보유 자산은 줄고
		point += p.bonusPoint; //상품 포인트만큼 포인트는 늘어난다
		
		System.out.println(p.findInfo() + "를 구매하였습니다.\n");
	}
	
	public void showInfo() {
		System.out.println("구매자의 현재 보유 자산 : " + myMoney);
		System.out.println("현재 포인트 : " + point+"\n");
	}
}//
*/

public class ProductTest {
	public static void main(String[] args) {
		Buyer b = new Buyer(1000);
		
		//200만원인 Tv 구매
		b.buyProduct(new Tv(200));
		
		//150만원인 Computer 구매
		Product p=new Computer(150);
		b.buyProduct(p);
		
		//구매자의  현재 상태 출력
		b.showInfo();
	}

}
