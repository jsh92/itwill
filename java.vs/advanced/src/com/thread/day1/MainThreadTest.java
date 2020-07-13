package com.thread.day1;

public class MainThreadTest {

	public static void main(String[] args) {
		System.out.println("main() 메서드입니다");
		
		Thread th=Thread.currentThread();
		System.out.println("현재 실행중인 쓰레드 이름 : "+th.getName());
		System.out.println("실행중인 쓰레드 개수 : "+Thread.activeCount());
		
		th.setName("Prime");//쓰레드 이름 변경
		System.out.println("변경된 이름 : "+Thread.currentThread().getName());
		
		
		
	}

}
