package com.day23;

import java.util.ArrayList;
import java.util.Scanner;

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
	
	//구매자가 구매한 상품들을 저장할 배열
	private ArrayList<Product> pdList = new ArrayList<Product>();
	
	Buyer(int myMoney){
		this.myMoney=myMoney;
	}
	
	public void buyProduct(Product p) {
		if(myMoney < p.price) {
			System.out.println("잔액이 부족하여 구매할 수 없습니다!!");
			return;
		}
		
		myMoney -= p.price;  //상품가격만큼 보유 자산은 줄고
		point += p.bonusPoint; //상품 포인트만큼 포인트는 늘어난다
		
		//구매한 상품을 배열에 저장
		pdList.add(p);
		
		System.out.println(p.findInfo() + "를 구매하였습니다.\n");
	}
	
	public void showInfo() {
		System.out.println("구매자의 현재 보유 자산 : " + myMoney);
		System.out.println("현재 포인트 : " + point+"\n");
	}
	
	public void summary() {
		int sum=0;
		String str="";
		
		if(pdList.isEmpty()) {
			System.out.println("구매한 상품이 없습니다.");
			return;
		}
		
		for(int i=0;i<pdList.size();i++) {
			Product p=pdList.get(i);
			
			sum+= p.price;  //구매한 상품의 가격 누적
			str += p.findInfo()+" ";
		}//for
		
		System.out.println("구매자가 구매한 상품들의 총 가격 : " + sum);
		System.out.println("구매한 상품 목록 : " + str);
	}
	
	public void refund(Product p) {
		//구매한 상품 반환(환불)
		if(pdList.remove(p)) {
			myMoney += p.price;
			point -= p.bonusPoint;
			
			System.out.println(p.findInfo()+"가 반품처리되었습니다.");
		}else {
			System.out.println(p.findInfo() + "가 구매목록에 없어서 반품 불가!");
		}
	}
}//

public class ProductTest2 {
	public static void main(String[] args) {
		Buyer b = new Buyer(1000);
		
		//총 구매가격과 목록 출력 summary
		b.summary();
		
		//170만원인 컴퓨터 구매
		Product com = new Computer(170);
		b.buyProduct(com);
		
		//300만원인 TV 구매
		b.buyProduct(new Tv(300));
		
		//250만원인 컴퓨터 구매
		b.buyProduct(new Computer(250));
		
		//총 구매가격과 목록 다시 출력 summary
		b.summary();
		
		//showInfo 호출
		b.showInfo();
		
		//170만원 컴퓨터 반품
		//b.refund(new Computer(170)); //반품 불가
		b.refund(com);
		
		//최종 showInfo, summary 호출
		b.showInfo();
		b.summary();
	}

}
