package com.thread.day1;

import javax.swing.JOptionPane;

public class ThreadTest3 {
	static boolean inputCheck = false;
	
	public static void main(String[] args) {
		MyThread4 th1 = new MyThread4();
		th1.start();
		MyRunnable2 r = new MyRunnable2();
		Thread th2 = new Thread(r);
		th2.start();
		System.out.println("main 쓰레드 종료!!");
		
		
	}

}


class MyThread4 extends Thread{

	@Override
	public void run() {
		System.out.println("10초안에 값을 입력해야 합니다.");
		String s = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		ThreadTest3.inputCheck = true;
		//boolean com.thread.day1.ThreadTest3.inputCheck
		System.out.println("입력값은 " + s + "입니다.");
	}
	
}

class MyRunnable2 implements Runnable{

	@Override
	public void run() {
		for (int i=10;i>0;i--) {
			if(ThreadTest3.inputCheck) return;
			
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("10초 동안 값이 입력되지 않아 종료합니다.");
		System.exit(0);

	}
	
}

