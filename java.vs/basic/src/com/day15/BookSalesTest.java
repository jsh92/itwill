package com.day15;

import java.util.Scanner;

public class BookSalesTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("책제목, 수량, 단가를 입력하세요");
			String title=sc.nextLine();
			int qty=sc.nextInt();
			int price=sc.nextInt();
			
			BookSales bs = new BookSales(title, qty, price);
			bs.calcSalesPrice(); //판매금액 구하기
			bs.calcTotalPrice(); //누적 판매금액 구하기
			
			System.out.println("\n판매금액 : " + bs.getSalesPrice());
			System.out.println("누적 판매금액 : " 
					+ BookSales.getTotalPrice()+"\n");
			
			System.out.println("그만하려면 Q");
			sc.nextLine();
			String quit = sc.nextLine();
			if(quit.equalsIgnoreCase("Q")) break;
		}//while
		
	}

}
