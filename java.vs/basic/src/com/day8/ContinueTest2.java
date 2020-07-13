package com.day8;

public class ContinueTest2 {

	public static void main(String[] args) {
		System.out.println("=======break=======");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(j==1) break;
				
				System.out.println("i="+i+", j="+j); //0,0  1,0  2,0
			}			
		}//¹Ù±ù for
		
		System.out.println("\n=========continue=======");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(j==1) continue;
				
				System.out.println("i="+i+", j="+j);
				//0,0  0,2  1,0  1,2  2,0  2,2
			}
		}//for
		
	}

}
