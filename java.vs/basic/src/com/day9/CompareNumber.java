package com.day9;

import java.util.Scanner;

public class CompareNumber {

	public static void main(String[] args) {
		/*
		public static double random()
		=> 0.0 ~ 1.0 사이의 임의의 실수를 리턴
		단  0.0 <= x < 1.0
		
		1) 발생시키려는 수의 개수를 각 변에 곱한다
		2) 시작값을 더한다
		3) int로 형변환한다

		예1) 1~100 사이의 임의의 정수
		0.0 <= Math.random() * 100 < 100.0 
		1.0 <= Math.random() * 100 + 1 < 101.0
		1 <= (int)(Math.random() * 100 + 1) < 101
		
		예2) 0~100 사이의 임의의 정수
		0.0 <= Math.random() * 101 < 101.0
		0 <= (int)(Math.random() * 101) < 101
		
		예) A ~ Z 사이의 임의의 대문자
		0.0 <= Math.random() * 26 < 26.0 
		65.0 <= Math.random() * 26 + 65 < 91.0
		65 <= (int)(Math.random() * 26 + 65) < 91
		
		예) d ~ g 사이의 임의의 소문자
		0.0 <= Math.random() * 4 < 4.0 
		100.0 <= Math.random() * 4 + 100 < 104.0
		100 <= (int)(Math.random() * 4 + 100) < 104
		
		*/
		
		//1. 정답 구하기 : 1~100 사이의 임의의 정수 구하기
		//int answer =(int)(Math.random() * 100 + 1);
		//System.out.println("answer="+ answer);
		
		//int answer=findAnswer();
		
		int answer=findAnswer2(1, 100);
		
		//4번 반복 처리 - 2~4 까지 for문 안에 넣는다
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<4;i++) {
			//2. 사용자로 부터 1~100 사이의 정수 입력받기
			System.out.println("1~100 사이의 정수를 입력하세요");
			int num = sc.nextInt();
			
			//3. 정답과 사용자 입력값 비교
			//4. 결과 출력
			if(num==answer) {
				System.out.println("정답입니다!!");
				break;
			}
			
			if(i==3) {
				System.out.println("실패! 다음 기회에!! 정답은 " 
							+ answer +"였습니다.");
			}else {
				if(num>answer) {
					System.out.println("너무 큽니다. 조금 작은 수를 입력하세요\n");
				}else {
					System.out.println("너무 작습니다. 좀 큰 수를 입력하세요\n");
				}//if
			}
			
		}//for		
		
	}//main
	
	public static int findAnswer(){
		int answer =(int)(Math.random() * 100 + 1);
		System.out.println("answer="+ answer);
		
		return answer;
	}

	public static int findAnswer2(int start, int end){
		int answer =(int)(Math.random() * (end-start+1) + start);
		System.out.println("answer="+ answer);
		
		return answer;
	}
	
}



