package com.day15;

public class BankAccount {
	//멤버변수
	//[1] 인스턴스 변수
	private int balance;
	
	//[2] static변수(클래스 변수)
	private static int totalBalance; //각 계좌(객체)의 원금의 합계
	public static final double INTEREST_RATE=1.7;  //이자율
	
	//생성자
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	//getter/setter
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance=balance;
	}
	
	public static int getTotalBalance() {
		return totalBalance;
	}
	
	public static void setTotalBalance(int totalBalance) {
		//static에서는 this 사용 불가
		BankAccount.totalBalance = totalBalance;
	}
	
	//메서드
	public void calcTotalBalance() {
		totalBalance += balance;
	}
}
