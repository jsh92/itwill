package com.day15;

import java.util.Scanner;

class FoodSales{
	//멤버 변수
	private String menu;  
	private int quantity, price;
	private int salesPrice;
	
	private static final double DISCOUNT_RATE=0.15;
	private static int totalPrice;

	//생성자
	public FoodSales(String menu, int quantity, int price){
		this.menu = menu;
		this.quantity = quantity;
		this.price = price;
	}

	public int getSalesPrice(){
		return salesPrice;
	}

	public static int getTotalPrice(){
		return totalPrice;
	}

	//메서드
	public void calcSalesPrice(){
		int discount = (int)(price*quantity*DISCOUNT_RATE);
		salesPrice = price * quantity - discount;
	}

	public void calcTotalPrice(){
		totalPrice += salesPrice;
	}
}//class

class FoodSalesTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true)	{
			System.out.println("메뉴, 수량, 단가를 입력하세요!");
			String menu = sc.nextLine();
			int quantity = sc.nextInt();
			int price =sc.nextInt();

			FoodSales obj = new FoodSales(menu, quantity, price);
			obj.calcSalesPrice();
			obj.calcTotalPrice();
			
			System.out.println("\n판매금액=" + obj.getSalesPrice());
			System.out.println("총 판매금액=" + FoodSales.getTotalPrice());

			System.out.println("\n그만하시겠습니까?(Q)uit");
			sc.nextLine();
			String str = sc.nextLine();
			if (str.equalsIgnoreCase("Q")) break;
		}//while
		
		sc.close();
	}
	
}//class
