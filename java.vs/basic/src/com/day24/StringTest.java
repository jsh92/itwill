package com.day24;

public class StringTest {

	public static void main(String[] args) {
		//			  01234567890123456789
		String str = "Hello java, Hi java!";
		
		char ch = str.charAt(4);
		System.out.println("index가 4에 해당하는 문자 => " + ch);  //o
		
		//indexOf : 특정 문자열의 위치를 구할 때 사용
		//해당 문자열이 존재하지 않으면 -1을 리턴
		int idx=str.indexOf("java"); //java의 위치
		System.out.println("java의 위치 : " + idx);  //6
		
		idx = str.lastIndexOf("java"); //뒤에서부터 찾은 java의 위치
		System.out.println("뒤에서 찾은 java의 위치 : " + idx); //15
		
		//substring(begin, end) : 특정 문자열을 추출할 때 사용
		//begin <= x < end 사이의 문자열 추출
		String sub =str.substring(6, 10); //6~9사이의 문자열 추출
		System.out.println("6 <= x < 10 사이의 문자열 : " +  sub); //java
		
		sub = str.substring(12); //12부터 끝까지의 문자열 추출
		System.out.println("index 12부터 끝까지의 문자열 : " + sub); //Hi java!
		
		String url = "www.naver.com";
		if(url.startsWith("www")) {
			System.out.println("url이 www로 시작됨");
		}else {
			System.out.println("url이 www로 시작되지 않음");
		}
		
		if(url.endsWith("com")) {
			System.out.println("url이 com으로 끝남!");
		}else {
			System.out.println("url이 com으로 끝나지 않음!");
		}
		
		//				0123456789012
		String email = "hong@nate.com";
		if(email.indexOf("@") != -1 && email.indexOf(".") != -1
			&& email.indexOf("@") < email.indexOf(".")) {
			System.out.println("\n이메일 규칙에 맞습니다.");
		}else {
			System.out.println("\n이메일 규칙에 맞지 않습니다.");
		}
		
		//String em1 = email.substring(0,4);  //hong
		//String em2 = email.substring(5,9);  //nate
		//String em3 = email.substring(10);  //com
		
		//email = "kim@gmail.com";
		int idx1 = email.indexOf("@"); //@의 위치  4
		int idx2 = email.indexOf("."); //.의 위치  9
		
		//**************************************************
		String em1 = email.substring(0, idx1);  //hong
		String em2 = email.substring(idx1+1, idx2);  //nate
		String em3 = email.substring(idx2+1);  //com
		
		System.out.println("이메일 첫부분 : " + em1);
		System.out.println("이메일 가운데 부분 : " + em2);
		System.out.println("이메일 마지막 부분 : " + em3);
		
		String s = "   java, python!  ";
		System.out.println("["+ s +"]");
		System.out.println("문자열 길이 : " + s.length());
		
		String s2 =  s.trim();
		System.out.println("trim 후 [" + s2 + "]");
		System.out.println("trim 후 길이 : " + s2.length());
		
		int n = 10;
		
		String s3 = Integer.toString(n);
		System.out.println("int를 문자열로 변환 - toStrint(): " + s3);
		s3 = String.valueOf(n);
		System.out.println("int를 문자열로 변환 - valueOf() : " + s3);
		
		
	}

}
