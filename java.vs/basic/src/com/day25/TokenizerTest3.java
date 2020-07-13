package com.day25;

import java.util.StringTokenizer;

public class TokenizerTest3 {

	public static void main(String[] args) {
		/*
		 split() 는 빈 문자열도 토큰으로 인식하는 반면 
		 StringTokenizer 는 빈 문자열을 토큰으로 인식하지 않기 때문에 인식하는
		  토큰의 개수가 서로 다름		 
		 */
		
		String str = "100,,,200,300,400";
		
		//split()이용
		String[] arr = str.split(",");
		int count = 0;
		for(String s : arr) {
			System.out.print(s + "|");
			
			count++;
		}
		
		System.out.println("\n\nsplit, 토큰의 개수 : " + count);
		
		//StringTokenizer 이용
		System.out.println("\n\n=====StringTokenizer 이용======");
		
		count=0;
		StringTokenizer st = new StringTokenizer(str, ",");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.print(token+"|");
			
			count++;
		}
		
		System.out.println("\n\nStringTokenizer, 토큰의 개수 : " + count);
		
	}

}
