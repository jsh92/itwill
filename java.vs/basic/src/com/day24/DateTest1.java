package com.day24;

import java.util.Date;

public class DateTest1 {

	public static void main(String[] args) {
		Date d = new Date();  //현재일자
		System.out.println("오늘 날짜 : " + d);
		System.out.println(d.toLocaleString());
		
		int year = d.getYear();
		int month = d.getMonth();  //0~11
		int date = d.getDate();
		System.out.println((1900+year) +"년 " 
				+ (month+1) +"월 " + date +"일");
		System.out.println("요일 : " + d.getDay());  //0:일, 1:월 ..
		
		System.out.println(d.getHours()+"시 " + d.getMinutes()+"분 "
				+ d.getSeconds()+"초");
		
		//1970-01-01 00:00:00 이후 경과된 시간을 밀리초로 리턴		
		long gap = d.getTime()/1000;
		System.out.println("70/01/01 이후 경과된 시간 : " + gap+"초");
		
		//초를 일로 환산
		gap = gap/(24*60*60);
		System.out.println("경과된 일수 : " + gap+"일");
		
		//두 날짜 사이의 간격 구하기
		//수료일까지 며칠 남았는지 계산(오늘날짜와 수료일 사이의 간격)
		//수료일
		//public Date(int year, int month, int date)
		Date d2 = new Date(2020-1900, 7, 19);
		System.out.println(d2.toLocaleString());
		
		long gap2 = d2.getTime()/1000;
		gap2 = gap2/(24*60*60);
		
		long term = gap2 - gap;
		System.out.println("두 날짜 사이의 간격 : " + term + "일");
		
	}

}
