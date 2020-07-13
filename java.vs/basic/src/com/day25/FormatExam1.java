package com.day25;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class FormatExam1 {
	public static void main(String[] args) {
		//1.
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력!");
		int n=sc.nextInt();
		
		DecimalFormat df = new DecimalFormat("#,###");
		System.out.println(df.format(n));
		
		//2.
		Calendar cal = Calendar.getInstance();		
		Date date = cal.getTime();		

		SimpleDateFormat sdf3
			= new SimpleDateFormat("yyyy-MM-dd E요일 hh:mm:ss a");
		String s = sdf3.format(date);
		System.out.println("\n오늘날짜 : " + s);
		
		//3.
		System.out.println("\n날짜를 입력하세요(2019/09/30)");
		sc.nextLine();
		String str = sc.nextLine();

		DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		DateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 E");

		try {
			Date date2 = sdf.parse(str);
			String sDate =sdf2.format(date2);
			
			System.out.println(sDate);
		} catch(ParseException e) {
			e.printStackTrace();
		}

		

	}
}

