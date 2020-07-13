package com.day7;

public class ForExam3 {

	public static void main(String[] args) {
		for(int i=1;i<=99;i++) {
			if(i%7==0 || i%9==0) {
				System.out.print(i+"\t");
			}//if
		}//for

		System.out.println("\n\n=====5개씩 출력=====");
		int cnt=0;
		for(int i=1;i<=99;i++) {
			if(i%7==0 || i%9==0) {
				System.out.print(i+"\t");
				//cnt++;
				
				if(++cnt % 5 == 0)
					System.out.println();
			}//if
		}//for
		
		
	}

}
