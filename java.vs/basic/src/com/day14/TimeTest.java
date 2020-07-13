package com.day14;

import java.util.Scanner;

public class TimeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시, 분, 초 입력!");
		int h = sc.nextInt(); //15
		int m = sc.nextInt(); //12
		int s = sc.nextInt(); //50
		
		//생성자를 이용해서 멤버변수의 초기값 할당 - 초기화
		Time t = new Time(h, m, s);
		
		int sec = t.toSecond();
		System.out.println("\n초로 환산 하면 " + sec +"초");
		
		//setter를 이용해서 멤버변수의 값 변경
		t.setHour(12);
		t.setMin(13);
		t.setSec(50);
		
		//getter를 이용해서 멤버변수의 값 읽어오기
		System.out.println("\n\n----변경된 시간------");
		System.out.println(t.getHour() +"시 " + t.getMin() + "분"
				+ t.getSec() +"초");
		
		System.out.println("초로 환산 : " + t.toSecond() +"초");
		

	}

}
