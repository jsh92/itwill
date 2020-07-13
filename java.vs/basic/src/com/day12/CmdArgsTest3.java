package com.day12;

public class CmdArgsTest3 {

	public static int larger(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	public static void main(String[] args) {
		//명령줄 인수로 두 수를 입력받아 더 큰 수 구하기 (더 큰수 구하는 메서드 만들기)
		if(args.length<2) {
			System.out.println("명령줄 인수로 두 수 입력하세요!");
			return;
		}
		
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		
		int result = larger(n1, n2);
		System.out.println("더 큰수 : " + result);
	}

}
