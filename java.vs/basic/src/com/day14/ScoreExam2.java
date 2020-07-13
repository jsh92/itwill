package com.day14;

import java.util.Scanner;

class Score2{
	//1. 멤버변수
	//입력값에 해당하는 멤버변수
	private int kor;
	private int eng;
	private int math;

	//결과값에 해당하는 멤버변수
	private int sum;
	private float average;
	
	//생성자
	public Score2(int kor, int eng, int math){
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//getter/setter
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}
	
	public void setSum(int sum) {
		this.sum=sum;
	}
	
	public float getAverage() {
		return average;
	}
	
	public void setAverage(int average) {
		this.average=average;
	}
	
	//총점, 평균을 구하는 메서드
	public void findSum(){
		sum = kor+eng+math;
	}

	public void findAverage(){
		findSum();
		average=sum/3f;
	}
	
}//class

public class ScoreExam2 {
	public static void main(String[] args) {
		System.out.println("국어, 영어, 수학 점수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();

		Score2 obj = new Score2(kor, eng, math);

		obj.findSum();
		obj.findAverage();

		System.out.println("\n총점=" + obj.getSum() 
			+ ", 평균=" + obj.getAverage());
		
	}

}//class
