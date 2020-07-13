package com.day11;

import java.util.Arrays;
import java.util.Scanner;

public class LottoTest1 {

	public static void main(String[] args) {
		//로또 만들기
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//1. 6개 (정수)요소를 갖는 배열 만들기
			int[] arr = new int[6];
			
			//2. for문에서 1~45 사이의 임의의 정수를 배열 요소에 넣는다
			//(for문에서 초기화)
			
			/*
			arr[0]=(int)(Math.random()*45+1);
			arr[1]=(int)(Math.random()*45+1);
			arr[2]=(int)(Math.random()*45+1);
			...
			*/
			
			for(int i=0;i<arr.length;i++) {
				arr[i]=(int)(Math.random()*45+1); //0, 1, 2, 3,...5
				
				//중복 제거
				for(int k=0;k<i;k++) {
					if(arr[i]==arr[k]) {
						//값이 중복되는 경우 다시 뽑아야 함
						i--;
						break;
					}
				}//안쪽 for
			}//바깥 for
			
			/*
			 i	k	arr[i] == arr[k]
			 -------------------------			 
			 0
			 1	0	arr[1] == arr[0]
			 	
			 2	0	arr[2] == arr[0]
			 	1	arr[2] == arr[1]
			 	
			 3	0	arr[3] == arr[0]
			 	1	arr[3] == arr[1]
			 	2	arr[3] == arr[2]
			 
			 ...
			 
			 5	0	arr[5] == arr[0]
			 	1	arr[5] == arr[1]
			 	2	arr[5] == arr[2]
			 	3	arr[5] == arr[3]
			 	4	arr[5] == arr[4]		 	
			*/
			
			//3. 배열 요소 정렬
			Arrays.sort(arr);
			
			//4. 배열 요소 출력
			for(int n : arr) {
				System.out.print(n+"\t");
			}//for
			
			System.out.println("\n\n그만하려면 Q 입력!");
			String quit=sc.nextLine();
			if(quit.equalsIgnoreCase("Q")) break;
			
		}//while
		
	}

}
