package com.day7;

public class ForExam1 {
	public static void main(String[] args){
		//for문을 이용하여 소문자 알파벳(a~z) 출력하기
		for (int i=97;i<=122 ; i++ ){
			System.out.print((char)i);
			
			if(i !=122)
				System.out.print(", ");			
		}
		
		System.out.println();

		for(char ch='a';ch<='z'; ch++){
			System.out.print(ch);
			
			if(ch !='z')
				System.out.print(", ");		
		}
		
		System.out.println();

		char lowerCase = 'a';
		for (int i=1;i<=26 ; i++ ){
			System.out.print(lowerCase++);
			
			if(i<26)
				System.out.print(", ");			
		}

		for(char ch='a';ch<='z'; ch++){
			if(ch !='a')	System.out.print(", ");	
			
			System.out.print(ch);
		}//for
		
		
	}
}



