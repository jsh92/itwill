package com.day21;

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
	private Product[] pdArr = new Product[10];
	private int count;  //배열의 index로 사용
	
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
		pdArr[count++] = p;
		
		System.out.println(p.findInfo() + "를 구매하였습니다.\n");
	}
	
	public void showInfo() {
		System.out.println("구매자의 현재 보유 자산 : " + myMoney);
		System.out.println("현재 포인트 : " + point+"\n");
	}
	
	public void summary() {
		int sum=0;
		String str="";
		
		for(int i=0;i<count;i++) {
			sum+= pdArr[i].price;  //구매한 상품의 가격 누적
			str += pdArr[i].findInfo()+" ";
		}//for
		
		System.out.println("구매자가 구매한 상품들의 총 가격 : " + sum);
		System.out.println("구매한 상품 목록 : " + str);
	}
}//

public class ProductTest2 {
	public static void main(String[] args) {
		/*
		Buyer b = new Buyer(1000);
		
		//200만원인 Tv 구매
		b.buyProduct(new Tv(200));
		
		//150만원인 Computer 구매
		Product p=new Computer(150);
		b.buyProduct(p);
		
		//구매자의  현재 상태 출력
		b.showInfo();
		b.summary();
		*/
		
		Scanner sc = new Scanner(System.in);
		Buyer b = new Buyer(1000);
		
		while(true) {
			System.out.println("1.상품구매 2.구매내역 조회 3.종료");
			int type = sc.nextInt();
			
			switch(type) {
				case 1:
					System.out.println("구매할 상품을 선택하세요(1.TV 2.컴퓨터)");					
					int pdType = sc.nextInt();
					if(pdType!=1 && pdType!=2) {						
						System.out.println("상품 잘못 선택!!");
						continue;						
					}
					
					System.out.println("상품 가격을 입력하세요");
					int price = sc.nextInt();
					
					Product p = null;
					if(pdType==1) {
						p=new Tv(price);
					}else if(pdType==2) {
						p=new Computer(price);
					}
					
					b.buyProduct(p);
					b.showInfo();
					break;
				case 2:
					b.summary();
					break;
				case 3:
					System.out.println("종료합니다.");
					return;
				default:
					System.out.println("잘못 입력!");
			}//switch
			
		}//while
		
	}

}
