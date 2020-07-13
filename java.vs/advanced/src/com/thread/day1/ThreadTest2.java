package com.thread.day1;

import javax.swing.JOptionPane;

public class ThreadTest2 {

	public static void main(String[] args) {
		MyThread3 th = new MyThread3();
		th.start();

		String str = JOptionPane.showInputDialog("입력하세요");
		System.out.println("입력값 : " + str);

		System.out.println("main 쓰레드 종료");
		/*
		 * 사용자의 입력을 받는 부분과 화면에 숫자를 출력하는 부분을 두 개의 쓰레드로 나누어서 처리 사용자가 입력을 마치지 않았어도 화면에 숫자가
		 * 출력
		 */
	}

}

class MyThread3 extends Thread {

	@Override
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
