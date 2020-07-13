package com.day15;

import java.util.Scanner;

public class AccountTest2 {

	public static void main(String[] args) {
		Account[] accArr = new Account[4];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<accArr.length;i++) {
			System.out.println("계좌번호, 잔액, 출금액을 입력하세요");
			String accId = sc.nextLine();
			int bal = sc.nextInt();
			int money = sc.nextInt();
			sc.nextLine();
			
			accArr[i] = new Account(accId, bal);
			accArr[i].withdraw(money);  //출금
		}//for
		
		System.out.println("\n=======은행 고객 리스트========");
		for(int i=0;i<accArr.length;i++) {
			accArr[i].showInfo();
		}//for
		
	}

}
