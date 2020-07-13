package com.thread.day1;

public class PriorityTest {
	static long startTime = 0;

	public static void main(String[] args) {
		/*
		 * •th1과 th2 모두 main 메서드에서 생성하였기 때문에 main 메서드를 실행하는 쓰레드의 우선순위인 5을 상속 받았음 
		 * •그 다음에 th2.setPriority(7)로 th2의 우선순위를 7로 변경 한 다음에 start()를 호출해서 쓰레드를 실행시킴 
		 * •쓰레드를 실행하기 전에만 우선순위를 변경할 수 있음 
		 * •우선순위가 높은 th2의 실행시간이 th1에 비해 상당히 늘 어난 것을 알 수 있음 
		 * •th2가 더 빨리 작업이 완료됨
		 */
		startTime = System.currentTimeMillis();
		
		MyThread5 th = new MyThread5();
		MyRunnable3 r = new MyRunnable3();
		Thread th2 = new Thread(r);
		int priority=Thread.currentThread().getPriority();
		System.out.println("main 쓰레드의 우선 순위: "+priority);
		System.out.println("[1] 쓰레드의 우선 순위 : "+th.getPriority());
		System.out.println("[2] 쓰레드의 우선 순위 : "+th2.getPriority());
		
		th.setPriority(Thread.MAX_PRIORITY);
		System.out.println("변경 후 [1] 쓰레드의 우선 순위 : "+th.getPriority());
		// start() 전에 setPriority()를 정해야 한다
		
		th.start();
		th2.start();
		
		
	}

}

class MyThread5 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(i + "-");
		}//for
		
		System.out.println("\n\n[1] [MyThread1 소요시간 (-): "
				+(System.currentTimeMillis()- PriorityTest.startTime)+"] \n");
	}

}

class MyRunnable3 implements Runnable {

	@Override
	public void run() {
		for(int i=0; i < 10000; i++) {
			System.out.print("2");
			}
			System.out.println("/n/n [MyThread2 소요시간 (2): "
			+(System.currentTimeMillis()- PriorityTest.startTime)+"] \n");
	}

}
