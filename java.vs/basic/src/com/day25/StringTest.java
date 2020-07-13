package com.day25;

public class StringTest {

	public static void main(String[] args) {
		//문자열이 동일한 경우에는 하나의 String 인스턴스만 생성해서 공유한다!
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Java";
		
		if(str1 == str2) {  //참조형에서 ==은 주소 비교
			System.out.println("str1 과 str2의 주소는 같다");  //
		}else {
			System.out.println("str1 과 str2의 주소는 다르다");
		}
		
		if(str1 == str3) {
			System.out.println("str1 과 str3의 주소는 같다");
		}else {
			System.out.println("str1 과 str3의 주소는 다르다");  //
		}
		
		String str4 = new String("Hello");
		String str5 = new String("Hello");
		
		if(str4 == str5) {
			System.out.println("str4 과 str5의 주소는 같다");
		}else {
			System.out.println("str4 과 str5의 주소는 다르다");  //
		}
		
		if(str1 == str4) {
			System.out.println("str1 과 str4의 주소는 같다");
		}else {
			System.out.println("str1 과 str4의 주소는 다르다");  //
		}
		
		
		
	}

}
