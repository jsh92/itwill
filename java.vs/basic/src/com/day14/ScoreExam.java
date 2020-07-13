package com.day14;

import java.util.Scanner;

class Score{
	private int kor;
	private int eng;
	private int math;

	//생성자
	public Score(int kor, int eng, int math){
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

	//총점, 평균을 구하는 메서드
	public int findSum(){
		int sum = kor+eng+math;
		return sum;
	}

	public float findAverage(){
		int sum = findSum();
		return sum/3f;
	}
}//class

public class ScoreExam {
	public static void main(String[] args)	{
		System.out.println("국어, 영어, 수학 점수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();

		Score obj = new Score(kor, eng, math);

		int sum = obj.findSum();
		float average = obj.findAverage();

		System.out.println("\n총점=" + sum + ", 평균=" + average);
		
		//obj.setKor(10);
		//int k=obj.getKor();
	}
}



