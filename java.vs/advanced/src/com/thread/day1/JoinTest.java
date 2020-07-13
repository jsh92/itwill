package com.thread.day1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JoinTest {

	public static void main(String[] args) {
		MyThread6 th = new MyThread6();
		th.setDaemon(true); // 데몬 쓰레드 : 일반 쓰레드가 모두 종료되면
		// th 은 강제적으로 자동 종료
		// start()전에 지정해야 함

		MyRunnable4 r = new MyRunnable4();
		Thread th2 = new Thread(r);
		th2.start();

		try {
			th2.join();// 1~n까지의 합=>main 쓰레드는 th2의 작업이 끝날 때까지 기다린다.
			//Waits for this thread to die. 
			/*
			 * 지정된 시간동안 스레드가 실행되도록 한다 지정된 시간이 지나거나 작업이 종료되면 join()을 호출한 스레드로 다시 돌아와 실행을 계속한다
			 */

		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		th.start();//현재 시간 출력
		for (int i = 0; i < 20; i++) {
			System.out.print(i + " ");

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} // for

		System.out.println("main 종료");
	}

}
