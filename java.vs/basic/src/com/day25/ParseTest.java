package com.day25;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ParseTest {

	public static void main(String[] args) {
		//사용자가 입력한 날짜와 오늘 날짜 사이의 간격 구하기
		Date today = new Date();  //현재일자
		
		Scanner sc = new Scanner(System.in);
		System.out.println("날짜를 입력하세요(예: 2020-04-10)");
		String str = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//public Date parse(String source) throws ParseException
		try {
			Date date = sdf.parse(str);  //사용자가 입력한 날짜
			
			long gap=0;
			if(date.getTime() > today.getTime()) {  //미래 날짜
				String s=sdf.format(today);  //현재일자에서 시분초 제거
				Date today2 = sdf.parse(s);
				
				gap = (date.getTime() - today2.getTime())/1000;
			}else { //과거 날짜
				gap = (today.getTime() - date.getTime())/1000;				
			}
			
			gap=gap/(24*60*60);
			System.out.println("\n두 날짜 사이 경과된 일수 : " + gap+"일");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
