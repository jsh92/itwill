package com.day8;

public class ContinueTest1 {

	public static void main(String[] args) {
		/*
		 break - switch나 반복문에서만 사용 가능
		 		 해당 블럭을 벗어날 때 사용
		 continue - 반복문에서만 사용 가능
		 		        다음 반복 위치로 이동
		 		        한 번 건너뛸때 사용    
		 return - 메서드에서 사용  
		 		    메서드의 실행을 종료하고 호출원으로 복귀
		 */
		
		System.out.println("========break 이용=========");
		for(int i=0;i<10;i++) {
			if(i==5) break;
			
			System.out.println("i="+i); //0 1 2 3 4 
		}//for
		
		System.out.println("\n======continue 이용======");
		for(int i=0;i<10;i++){
			if(i==5) continue;
			
			System.out.println("i=" + i); //0 1 2 3 4 6 7 8 9
		}//for
		
	}
}






