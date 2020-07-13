package com.day21;

public class RuntimeExceptionCase {

	public static void main(String[] args) {
		
		try {
			int[] arr = new int[3];
			arr[3] = 10; //예외
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외발생 : " + e.getMessage());
		}
		
		try {
			Object obj = new int[3];
			String s = (String)obj; //
		}catch(ClassCastException e) {
			System.out.println("예외발생 - " + e);
		}
		
		try {
			String s = null;
			int n = s.length(); //
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		try {
			int[] arr = new int[-4]; //
		}catch(NegativeArraySizeException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n====next!!=====");
	}

}
