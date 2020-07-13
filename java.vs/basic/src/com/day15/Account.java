package com.day15;

public class Account {
	private String accId;
	private int balance;
	
	public Account(String accId, int balance) {
		this.accId=accId;
		this.balance=balance;
	}
	
	public void withdraw(int money) {
		balance -= money;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void showInfo() {
		System.out.println("°èÁÂ¹øÈ£ : " + accId);
		System.out.println("ÀÜ¾× : " + balance+"\n");		
	}
}
