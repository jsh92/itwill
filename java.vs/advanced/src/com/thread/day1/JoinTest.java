package com.thread.day1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JoinTest {

	public static void main(String[] args) {
		MyThread6 th = new MyThread6();
		th.setDaemon(true); // ���� ������ : �Ϲ� �����尡 ��� ����Ǹ�
		// th �� ���������� �ڵ� ����
		// start()���� �����ؾ� ��

		MyRunnable4 r = new MyRunnable4();
		Thread th2 = new Thread(r);
		th2.start();

		try {
			th2.join();// 1~n������ ��=>main ������� th2�� �۾��� ���� ������ ��ٸ���.
			//Waits for this thread to die. 
			/*
			 * ������ �ð����� �����尡 ����ǵ��� �Ѵ� ������ �ð��� �����ų� �۾��� ����Ǹ� join()�� ȣ���� ������� �ٽ� ���ƿ� ������ ����Ѵ�
			 */

		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		th.start();//���� �ð� ���
		for (int i = 0; i < 20; i++) {
			System.out.print(i + " ");

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} // for

		System.out.println("main ����");
	}

}