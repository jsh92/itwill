package com.day24;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		//Calendar를 Date로 변환
		Date date = cal.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 
			= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf3 
			= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS a");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd E요일");
		
		String str = sdf.format(date);
		System.out.println("년월일 : "+str);
		
		str = sdf2.format(date);
		System.out.println("년월일 시분초 : " + str);
		System.out.println("년월일 시분초 밀리초 오전/오후: " 
				+ sdf3.format(date));
		System.out.println("년월일 요일 : " + sdf4.format(date));
		
		
	}

}




