package com.thread.day1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class Mythread2 {
	

	public static void main(String[] args) {
		MyThread9 th = new MyThread9();
		th.start();
		try {
			th.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		
		for(int i=0;i<=50;i+=10) {
			System.out.println(".com에서"+ i + "% 다운로드 중...");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
		Scanner sc = new Scanner(System.in);
		// 0123456789
		// 920125-1112222
		String str = JOptionPane.showInputDialog("주민번호를 입력하세요");
		String jy = str.substring(0, 2);
		String jm = str.substring(2, 4);
		String jd = str.substring(4, 6);
		String jgen = str.substring(7, 8);
		if(str.contains("-")==false) {
			System.out.println("잘못 입력하셨습니다");
			return;
		}
		String gender = null;
		if (jgen.equals("1") || jgen.equals("2")) {
			jy = "19" + jy;
		} else {
			jy = "20" + jy;
		}

		if (jgen.equals("1") || jgen.equals("3")) {
			gender = "남자";
		} else {
			gender = "여자";
		}

		int yy = Integer.parseInt(jy);
		int mm = Integer.parseInt(jm);
		int dd = Integer.parseInt(jd);

		System.out.println("생일: "+yy+"-"+mm+"-"+dd);
		System.out.println("성별: "+gender);
		
		
		

	}

}
class MyThread9 extends Thread{

	@Override
	public void run() {
		
		for(int i=0;i<=100;i+=10) {
			System.out.println(".com에서"+ i + "% 다운로드 중...");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}

