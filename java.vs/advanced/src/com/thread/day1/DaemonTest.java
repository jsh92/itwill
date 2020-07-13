package com.thread.day1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DaemonTest {

	public static void main(String[] args) {
		MyThread6 th = new MyThread6();
		th.setDaemon(true); //���� ������ : �Ϲ� �����尡 ��� ����Ǹ� 
		//th �� ���������� �ڵ� ����
		//start()���� �����ؾ� ��

		th.start();
		
		MyRunnable4 r = new MyRunnable4();
		Thread th2 = new Thread(r);
		th2.start();
		
		for(int i=0;i<100;i++) {
			System.out.print(i+" ");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for

		System.out.println("main ����");
	}

}

class MyThread6 extends Thread{
	
	@Override
	public void run() {
		SimpleDateFormat sdf 
			= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		while(true) {
			Date d=new Date();
			String str=sdf.format(d);
			
			System.out.println("\n\n"+str);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//while
	}
}

class MyRunnable4 implements Runnable{

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�!");
		int num=sc.nextInt();
		
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum+=i;
		}
		
		System.out.println("\n\n1 ~ "+ num +"������ ��:"+ sum);
	}
	
}