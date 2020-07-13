package com.day25;

public class MathTest {

	public static void main(String[] args) {
		double n = Math.abs(-27.6);
		System.out.println("절대값 : " + n);
		
		System.out.println("27.3 올림 : " + Math.ceil(27.3)); //28
		System.out.println("-27.3 올림 : " + Math.ceil(-27.3)); //-27
		
		System.out.println("27.6 내림 : " + Math.floor(27.6)); //27
		System.out.println("-27.6 내림 : " + Math.floor(-27.6)); //-28		
		//-29  -28 -27.6  -27.3  -27 -26 ... 0 26  27  27.3  27.6  28
		
		System.out.println("27.5 반올림 : " + Math.round(27.5)); //28
		
		System.out.println("random값 : " + Math.random());
		
		System.out.println("자연로그의 밑 : " + Math.E);
		System.out.println("PI : " + Math.PI);
		
	}

}
