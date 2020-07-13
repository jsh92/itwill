package com.day6;

import java.io.IOException;

public class SwitchTest3 {

	public static void main(String[] args) throws IOException{
		/*
		 public abstract int read() throws IOException  
		 -  키보드로 부터 1바이트를 읽어오는 메서드
		 -	입력한 값의 아스키코드 값을 리턴해줌
		 -	char 값을 읽어올 때 사용
		 예) ABC 입력 => 처음 1바이트인 A만 읽어오며, 해당 아스키코드값인 65를 리턴 
		*/
		
		System.out.println("성별을 입력하세요(M/F)");
		int code=System.in.read();
		char gender=(char)code;
		
		System.out.println("코드값 : " + code+", 해당문자 : " + gender);
		
		String result="";
		switch(gender) {
			case 'M':
				result="남자";
				break;
			case 'F':
				result="여자";
				break;
			default:
				result="잘못 입력!";
		}
		
		System.out.println(gender + " => " + result);
		
		//소문자 m이나 f도 처리되도록
		switch(gender) {
			case 'M':  
			case 'm':	//or의 기능을 할 수 있다 (대문자 M이거나 소문자 m이면 남자)
				result="남자";
				break;
			case 'F':
			case 'f':	
				result="여자";
				break;
			default:
				result="잘못 입력!";
		}
		
		System.out.println(gender + " => " + result);
		
		//public static char toUpperCase(char ch)
		char upperGender = Character.toUpperCase(gender);
		switch(upperGender) {
			case 'M':
				result="남";
				break;
			case 'F':
				result="여";
				break;
			default:
				result="잘못 입력함!";
				break;
		}
		
		System.out.println(result);
		
	}

}





