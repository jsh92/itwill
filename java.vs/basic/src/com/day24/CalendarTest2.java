package com.day24;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest2 {

	public static void main(String[] args) {
		//			     0   1    2   3   4   5    6    7 
		String[] week = {"","일","월","화","수","목","금","토"};
		
		//public static Calendar getInstance()
		Calendar cal = Calendar.getInstance();
		
		//public final void set(int year,int month, int date)
		cal.set(2020, 5, 1);  //2020-06-01  월
		
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("요일 : " + day); //2
		System.out.println("요일 : " + week[day]); //월
		
		//며칠 후, 몇 개월 전, 몇 년 후 계산
		//Calendar cal2 = new GregorianCalendar(); //현재일자
		
		//public GregorianCalendar(int year,int month,int dayOfMonth)
		Calendar cal2 = new GregorianCalendar(2020, 5, 1); //2020-06-01
		System.out.println("\n"+showDate(cal2));
		
		//2020/06/01로부터 100일 후
		//public abstract void add(int field, int amount)
		cal2.add(Calendar.DATE, 100);
		System.out.println("100일 후 : " + showDate(cal2));
		
		//2020년 9월 9일 기준 5개월 전
		cal2.add(Calendar.MONTH, -5);
		System.out.println("5개월 전 : " + showDate(cal2));
		
		//2020년 4월 9일 기준 2년 후
		cal2.add(Calendar.YEAR, 2);
		System.out.println("2년 후 : " + showDate(cal2));
		
	}

	public static String showDate(Calendar cal) {
		return cal.get(Calendar.YEAR) +"년 " 
				+ (cal.get(Calendar.MONTH)+1) +"월 "
				+ cal.get(Calendar.DATE) + "일";
	}
	
}
