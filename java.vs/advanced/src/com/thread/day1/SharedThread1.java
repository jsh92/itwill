package com.thread.day1;

public class SharedThread1 {

	public static void main(String[] args) {
		MyRunnable5 r = new MyRunnable5();
		Thread th1 = new Thread(r);
		Thread th2 = new Thread(r);
		
		th1.start();
		th2.start();
	}

}

class MyRunnable5 implements Runnable{
	int insVal;
	
	@Override
	public void run() {
		int localVal=0;
		String name=Thread.currentThread().getName();
		
		for(int i=0;i<5;i++) {
			System.out.println(name+", localVal=" + ++localVal);
			System.out.println("========"+name + ", 인스턴스변수  insVal="
				+ ++insVal);
		}
	}
	
}
