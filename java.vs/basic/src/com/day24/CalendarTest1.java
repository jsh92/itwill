package com.day24;

import java.util.Calendar;

public class CalendarTest1 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH); //0~11
		int date=cal.get(Calendar.DATE);
		
		System.out.println(year + "년 " + (month+1)+"월 " + date+"일");
		
		int h = cal.get(Calendar.HOUR_OF_DAY);
		int hh = cal.get(Calendar.HOUR);
		int m = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		int day = cal.get(Calendar.DAY_OF_WEEK); //요일, 1:일,2:월...
		int ampm = cal.get(Calendar.AM_PM); //0:오전, 1:오후
		
		String sAmPm = ampm==0?"오전":"오후";
		
		System.out.println(h+"시 " +m +"분 " +s +"초");
		System.out.println(hh+"시 " +m +"분 " +s +"초 " + sAmPm);
		
		System.out.println("요일 : " + day);
		
		//1970-01-01 00:00:00 이후 경과된 시간을 밀리초로 리턴
		long gap = cal.getTimeInMillis()/1000;
		gap = gap/(24*60*60);
		System.out.println("70/01/01 이후 경과된 일수 : " + gap);
	}

}
