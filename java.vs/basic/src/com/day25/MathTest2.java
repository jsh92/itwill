package com.day25;

public class MathTest2 {

	public static void main(String[] args) {
		//1 ~ 50 사이의 난수 10번 출력
		for(int i=0;i<10;i++) {
			int rnd = (int)(Math.random()*50+1);
			System.out.print(rnd +" ");
		}

	}

}
