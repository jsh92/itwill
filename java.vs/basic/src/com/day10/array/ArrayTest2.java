package com.day10.array;

public class ArrayTest2 {

	public static void main(String[] args) {
		char[] chArr;
		chArr = new char[4];

		chArr[0]='j';
		chArr[1]='a';
		chArr[2]='v';
		chArr[3]='a';
		
		for(int i=0;i<chArr.length;i++) {
			System.out.println(chArr[i]);
		}//for
		
		char[] chArr2= {'s','p','r','i','n','g'};
		
		for(int i=0;i<chArr2.length;i++) {
			System.out.print(chArr2[i] +"\t");
		}//for
		
		
	}

}
