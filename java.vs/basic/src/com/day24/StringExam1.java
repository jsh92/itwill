package com.day24;

import java.util.Scanner;

class StringExam1{
	public static void main(String[] args){
		String str = "test.txt";		
		int idx = str.lastIndexOf(".");
		System.out.println("파일명:"+ str.substring(0, idx));
		System.out.println("확장자:"+ str.substring(idx+1));

		String content = "안녕하세요\r\n 저는 홍길동입니다.";
		String s = content.replace("\r\n", "<br>");
		System.out.println(s);

              //01234567890123456789012345
		str = "c:\\shop\\upload\\test.txt";
		int i = str.lastIndexOf(".");
		int k = str.lastIndexOf("\\");

		System.out.println("폴더:"+ str.substring(0, k));
		System.out.println("파일명:"+ str.substring(k+1, i));
		System.out.println("확장자:"+ str.substring(i+1));

		//str = "http://www.mall.com/default.html";
		Scanner sc = new Scanner(System.in);
		System.out.println("URL주소를 입력하세요");
		String url = sc.nextLine();
		String path = "http://www.mall.com";
		if(url.indexOf(path)== -1)
			System.out.println("url 주소가 적합하지 않습니다");
		else
			System.out.println("해당 url 주소:"+ url);
		
		System.out.println("주민등록번호를 입력하세요(하이픈없이 입력)");
		String ssnNo = sc.nextLine();
		//0123456789012
		//9010191232222
		String gender = ssnNo.substring(6,7);
		String yy="", mm, dd, gender2="";
		yy = ssnNo.substring(0,2); //년 => 90
		
		if(gender.equals("1") ||gender.equals("2")){
			yy =  "19" + yy;
		}else if(gender.equals("3") ||gender.equals("4")){
			yy = "20" + yy;
		}else{
			System.out.println("잘못입력!!");
			return;
		}
		
		mm =ssnNo.substring(2,4);  //10
		dd = ssnNo.substring(4,6); //19
		
		if(gender.equals("1") ||gender.equals("3")){
			gender2 = "남";
		}else if(gender.equals("2") ||gender.equals("4")){
			gender2 = "여";
		}else{
			System.out.println("잘못입력!!");
			return;
		}

		System.out.println(yy +"년 " + mm +  "월 " +dd +"일 "+ ","+ gender2);
	}
}

