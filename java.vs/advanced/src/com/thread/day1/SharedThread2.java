package com.thread.day1;

public class SharedThread2 {

	public static void main(String[] args) {
		Circle c = new Circle();
		
		MyThread7 th = new MyThread7(c);
		MyThread7 th2 = new MyThread7(c);
		
		th.start();
		th2.start();
	}

}

class Circle{
	int radius;
}


class MyThread7 extends Thread{
	Circle c;
	
	MyThread7(Circle c){
		this.c=c;
	}
	
	@Override
	public void run() {
		int localVal=0;
		
		for(int i=0;i<4;i++) {
			System.out.println(getName()+" : localVal=" + ++localVal);
			System.out.println("--------"+getName() + " : 원의 반지름="
				+ ++c.radius);
		}//for
	}	
}

