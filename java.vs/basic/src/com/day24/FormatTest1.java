package com.day24;

import java.text.DecimalFormat;

public class FormatTest1 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.##");
		double d = 1234567.89512;
		
		//public final String format(double number)
		//숫자 => 형식화한 문자열		
		String str = df.format(d);
		System.out.println("#,###.## => " + str); //1,234,567.9
		
		DecimalFormat df2 = new DecimalFormat("#,###.00");
		str = df2.format(d);
		System.out.println("#,###.00 => " + str); //1,234,567.90
		
		d = 123456.723;
		DecimalFormat df3 = new DecimalFormat("#,###");
		str = df3.format(d);
		System.out.println("#,### => " + str); //123,457
		
	}

}
