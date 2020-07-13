package com.day15;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount(100000);
		
		ba1.calcTotalBalance();
		System.out.println("첫번째 계좌의 원금 : " + ba1.getBalance());
		System.out.println("이자율 : " + BankAccount.INTEREST_RATE);
		System.out.println("계좌들의 원금의 합계 : " 
			+ BankAccount.getTotalBalance());
		
		BankAccount ba2 = new BankAccount(200000);
		ba2.calcTotalBalance();
		System.out.println("\n두번째 계좌의 원금 : " + ba2.getBalance());
		System.out.println("원금 합계 : " 
			+ BankAccount.getTotalBalance());
		
	}

}
