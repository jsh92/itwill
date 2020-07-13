package com.day7;

public class ForDup2 {

	public static void main(String[] args) {
		//구구단 출력
		for(int dan=2;dan<=9;dan++) {
			for(int j=1;j<=9;j++) {
				System.out.println(dan + " * " + j + " = " + dan*j);	
			}//안쪽 for
			
			System.out.println();
		}//바깥 for
		
		//가로 구구단 출력
		System.out.println("\n\n======가로 구구단=======");
		for(int i=1;i<=9;i++) {
			for(int dan=2;dan<=9;dan++) {
				System.out.print(dan + "*" + i + "=" + dan*i +"\t");
			}
			System.out.println();
		}//for
		
	}

}





