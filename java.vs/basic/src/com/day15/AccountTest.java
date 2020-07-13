package com.day15;

public class AccountTest {

	public static void main(String[] args) {
		//int 3
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		for(int n : arr) {
			System.out.println(n);
		}
		
		//String 4
		String[] sArr = new String[4];
		sArr[0]= "홍길동";
		sArr[1]= "김길동";
		sArr[2]= "이길동";
		sArr[3]= "박길동";
		
		for(int i=0;i<sArr.length;i++) {
			System.out.println(sArr[i]);
		}
				
		for(String s : sArr) {
			System.out.println(s);
		}

		//변수인 경우
		int a = 10;
		
		String s = "홍길동";
		
		Account acc = new Account("100-01-2000", 100000);
		acc.withdraw(10000);
		acc.showInfo();
		
		Account acc2 = new Account("100-01-2000", 200000);
		acc2.withdraw(10000);
		acc2.showInfo();
		
		Account acc3 = new Account("100-01-2000", 300000);
		acc3.withdraw(10000);
		acc3.showInfo();
		
		//배열인 경우
		System.out.println("\n\n=====Account 배열======");
		Account[] accArr = new Account[3];
		
		accArr[0] = new Account("100-01-2000", 100000);
		accArr[1] = new Account("200-01-3000", 200000);
		
		Account acc1 = new Account("300-01-4000", 300000);
		accArr[2] = acc1;
		
		/*
		accArr[0].withdraw(10000);
		accArr[0].showInfo();
		accArr[1].withdraw(10000);
		accArr[1].showInfo();
		accArr[2].withdraw(10000);
		accArr[2].showInfo();
		*/
		
		System.out.println("\n=======for 문 이용=======");
		for(int i=0;i<accArr.length;i++) {
			accArr[i].withdraw(10000);
			accArr[i].showInfo();
		}//for
		
	}

}
