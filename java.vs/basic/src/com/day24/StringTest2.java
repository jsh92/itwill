package com.day24;

public class StringTest2 {

	public static void main(String[] args) {
		String str = "12345678";
		String s = str.replace('7', '칠');
		System.out.println("7을 칠로 치환 : " + s);
		
		System.out.println("45를 four,five로 치환 : " 
				+ str.replace("45", "four,five"));
	
		str = "java,oracle,html,css";
		String[] arr = str.split(",");  //,를 구분자로 여러개로 분리
		for(String s2 : arr) {
			System.out.println(s2);
		}
		
		System.out.println("\n====.을 구분자로 나눈 결과===");
		str = "jsp.spring.mybatis.python";
		//public String[] split(String regex, int limit)
		String[] arr2 = str.split("\\.", 3);
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
		
	}

}
