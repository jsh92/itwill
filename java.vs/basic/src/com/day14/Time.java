package com.day14;

public class Time {
	//1. 멤버변수
	private int hour; //15
	private int min;  //12
	private int sec;  //50
	
	//2. 생성자 - 멤버변수 초기화
	public Time(int h, int m, int s) {
		hour = h;
		min = m;
		sec = s;
	}
	
	//3. getter/setter
	//getter - 멤버변수의 값 읽어오기
	public int getHour() {
		return hour;
	}
	
	//setter - 멤버변수에 값 할당
	public void setHour(int h) {
		hour = h;
	}
	
	public int getMin() {
		return min;
	}
	
	public void setMin(int m) {
		min = m;
	}
	
	public int getSec() {
		return sec;
	}
	
	public void setSec(int s) {
		sec = s;
	}
	
	//4. 메서드
	public int toSecond() {
		return hour * 60 * 60 + min * 60 + sec;
	}
}
