package com.day15;

public class BookSales {
	private String title;	//책 제목
	private int quantity;	//수량
	private int price;		//단가
	private int salesPrice;  //판매금액
	
	//static 변수
	private static int totalPrice;	//판매금액의 총액
	
	//생성자
	public BookSales(String title, int quantity, int price) {
		this.title=title;
		this.quantity=quantity;
		this.price=price;
	}
	
	//getter/setter
	public int getSalesPrice() {
		return salesPrice;
	}
	
	public static int getTotalPrice() {
		return totalPrice;
	}
	
	//메서드
	public void calcSalesPrice() {
		salesPrice = price * quantity; //판매금액 구하기
	}
	
	public void calcTotalPrice() {
		totalPrice += salesPrice;		//누적 판매금액 구하기
	}
	
}



