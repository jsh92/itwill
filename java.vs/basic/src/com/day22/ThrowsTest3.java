package com.day22;

import java.io.IOException;

public class ThrowsTest3 {

	public static void main(String[] args) throws IOException{
		//public abstract int read() throws IOException
		
		System.out.println("남(M), 여(F) 선택!");
		char ch=(char)System.in.read();
		
		//public static char toUpperCase(char ch)
		
		String result="";
		switch(Character.toUpperCase(ch)) {
			case 'M':
				result = "남자";break;
			case 'F':
				result = "여자";break;
			default:
				result = "잘못 입력!";
		}
		
		System.out.println(ch+"=>"+result);
	}

}
