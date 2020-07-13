package com.day16;

import java.util.Scanner;

//배열이 멤버변수인 경우
class Score{
	//멤버변수
	private int[] subject;  //과목 배열, 국 영 수
	
	//생성자
	Score(int[] subject){
		this.subject=subject;
	}
	
	//getter/setter
	public int[] getSubject() {
		return subject;
	}
	
	public void setSubject(int[] subject) {
		this.subject=subject;
	}
	
	//메서드
	public int calcTotal() {
		int sum=0;
		
		for(int i=0;i<subject.length;i++) {
			sum+=subject[i];
		}//for
		
		return sum;
	}
	
	public double calcAverage() {
		int sum = calcTotal();
		double avg= (double)sum / subject.length;
		
		return avg;		
	}
	
}//class

public class ScoreTest {

	public static void main(String[] args) {
		int[] arr=new int[3];
		arr[0]=90;
		arr[1]=88;
		arr[2]=70;
		
		Score score = new Score(arr);
		
		int sum = score.calcTotal();
		double avg = score.calcAverage();
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + Math.round(avg*10)/10.0);
		
		//점수 변경하기
		int[] arr2 = new int[3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국, 영, 수 점수를 입력하세요");
		
		for(int i=0;i<arr2.length;i++) {
			arr2[i] = sc.nextInt();
		}
		
		score.setSubject(arr2);
		
		sum = score.calcTotal();
		avg = score.calcAverage();
		
		System.out.println("\n=======변경된 과목 점수=======");
		int[] subject = score.getSubject();
		for(int n : subject) {
			System.out.print(n+"\t");
		}
		
		System.out.println("\n\n총점 : " + sum);
		System.out.println("평균 : " + avg);
		
	}

}



