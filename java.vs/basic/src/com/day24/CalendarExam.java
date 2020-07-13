package com.day24;

import java.util.*;

class CalendarExam{
	public static void main(String[] args){
		Calendar date1 = Calendar.getInstance();
		Calendar today = Calendar.getInstance();

		// date1의 날짜를 1999-07-15로 설정한다.
		date1.set(1999, 6, 15);
		
		//두 날짜간의 차이 - getTimeInMillis() 를 이용해서 천분의 일초 단위로 변환해야 함
		long difference 
			=(today.getTimeInMillis() - date1.getTimeInMillis())/1000;
		System.out.println("생일(1999-07-15) 이후 경과일수:  "
			+ difference/(24*60*60) +"일");

		Calendar date2 = Calendar.getInstance();
		date2.set(2020, 11, 25);		
		difference 
			=(date2.getTimeInMillis() - today.getTimeInMillis())/1000;
		System.out.println("크리스마스까지 남은 일수:  "
				+ difference/(24*60*60) +"일");

		today.add(Calendar.DATE, -50);
		System.out.print("오늘 기준 50일 전 : ");
		System.out.println(showDate(today));
	}//main

	public static String showDate(Calendar date){
		return date.get(Calendar.YEAR)+"년 "
		+ (date.get(Calendar.MONTH)+1) + "월 " 
		+ date.get(Calendar.DATE) + "일";
	}
	
}

