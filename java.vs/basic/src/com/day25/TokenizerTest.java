package com.day25;

import java.util.StringTokenizer;

public class TokenizerTest {

	public static void main(String[] args) {
		String str ="10,20,30,40";
		
		//public StringTokenizer(String str, String delim)
		StringTokenizer st = new StringTokenizer(str, ",");
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		//split() 이용
		System.out.println("\n===== split()이용 =======");
		String[] arr = str.split(",");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("\n=============");
		
		//public StringTokenizer(String str,String delim,boolean returnDelims)
		str = "100+(200*300)/2";
		StringTokenizer st2 = new StringTokenizer(str, "+-*/=()", true);
		//=> 구분자도 토큰으로 간주
		
		while(st2.hasMoreTokens()) {
			String token = st2.nextToken();
			System.out.println(token);
		}
		//StringTokenizer 는 구분자로 단 하나의 문자 밖에 사용하지 못함

		// StringTokenizer 는 단 한 문자의 구분자만 사용할 수 있기 때문에, 
		//   +-*/=() 전체가 하나의 구분자가 아니라 각각의 문자가 모두 구분자임
		// 두 문자 이상의 구분자를 사용해야 한다면 split() 메서드 이용
		

	}

}
