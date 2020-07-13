package com.day24;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest3 {

	public static void main(String[] args) {
		//1. Calendar를 Date로 변환하기
		Calendar cal = Calendar.getInstance();
		cal.set(2020, 0, 1); //2020-01-01
		
		//public final Date getTime()
		Date d = cal.getTime();
		System.out.println("Date : "+d.toLocaleString());
		
		//2. Date를 Calendar로 변환하기
		Date date = new Date(2019-1900, 1, 1); //2019-02-01
		
		Calendar cal2 = new GregorianCalendar();
		
		//public final void setTime(Date date)
		cal2.setTime(date);
		
		System.out.println("Calendar : "+CalendarTest2.showDate(cal2));
		
		
	}

}
