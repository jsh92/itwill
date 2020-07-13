package com.day22;

public class FinallyTest2 {
	public static boolean divider(int n1, int n2) {
		try {
			int res=n1/n2;
			System.out.println(n1+"/"+n2+"="+res);
			
			return true;
		}catch(Exception e) {
			System.out.println("예외발생 : " + e.getMessage());
			
			return false;
		}finally {
			System.out.println("finally 부분!!!!");
		}
		
		//중간에 return을 하더라도 finally 영역은 실행되고 나서 메서드를 빠져나가게 됨
	}
	
	public static void main(String[] args) {
		if(divider(10, 2)) {
			System.out.println("나눗셈 연산 성공!\n");
 		}else {
 			System.out.println("나눗셈 연산 실패!\n");
		}
		
		if(divider(10, 0)) {
			System.out.println("나눗셈 연산 성공!\n");
		}else {
			System.out.println("나눗셈 연산 실패!\n");
		}
		
	}

}
