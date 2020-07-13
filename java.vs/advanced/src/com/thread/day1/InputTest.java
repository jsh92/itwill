package com.thread.day1;

import javax.swing.JOptionPane;

public class InputTest {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("값을 입력하세요");
		System.out.println("입력값 : " + str);

		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000); // 지정된 시간동안 쓰레드를 일시정지시킴
				//void java.lang.Thread.sleep(long millis)
				//1000이 1초
			} catch (Exception e) {
			}
		}

		/*
		 * 하나의 쓰레드로 사용자의 입력을 받는 작업과 화면에 숫자를 출력하는 작업을 처리 사용자가 입력을 마치기 전까지는 화면에 숫자가 출력되지
		 * 않다가 사용자가 입력을 마치고 나서야 화면에 숫자가 출력됨
		 */

	}

}
