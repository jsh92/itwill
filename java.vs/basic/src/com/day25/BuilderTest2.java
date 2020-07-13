package com.day25;

public class BuilderTest2 {

	public static void main(String[] args) {
		//String을 StringBuilder로 변환
		String str = "java";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		
		//StringBuilder를 String으로 변환
		StringBuilder sb2 = new StringBuilder("test");
		String s = sb2.toString();
		System.out.println(s);
		
	}

}
