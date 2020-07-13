package com.day13;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		//클래스를 작성한 다음, 클래스로부터 객체를 생성하여 사용
		//객체를 사용한다는 것 - 객체가 가지고 있는 속성과 기능을 사용한다는 뜻
		
		//1. 객체 생성 - 해당 클래스의 멤버변수와 메서드를 메모리에 할당
		Account acc = new Account();
		
		//int[] arr=new int[3];
		//int a;
		
		//해당 객체의 메서드 사용
		acc.showInfo();  //멤버변수는 default값으로 초기화됨
		
		//두번째 객체 생성
		Account acc2;
		acc2 = new Account("100-02-123", "홍길동", 100000);
		
		//멤버변수 사용
		//acc2.accId="100-02-123";
		//acc2.name="홍길동";
		//acc2.balance=100000;
		
		//메서드 사용
		acc2.showInfo();
		acc2.withdraw(30000);  	//3만원 출금
		acc2.deposit(50000);	//5만원 입금
		acc2.showInfo();

		//비교
		//Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		
		/*
		 1. 객체 생성하는 방법
		 클래스명  참조변수 = new 클래스명();
		 
		 2. 객체 사용 - 멤버변수나 메서드 사용
		 참조변수.멤버변수
		 참조변수.메서드()		 
		 */
	}

}
