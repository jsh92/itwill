package com.thread.day1;

public class SyncTest {

	public static void main(String[] args) {
		MyRunnable6 r = new MyRunnable6();
		
		Thread th1 = new Thread(r);
		Thread th2 = new Thread(r);
		th1.start();
		th2.start();
	}

}

class Account{
	int balance=1000;
	/*
	public synchronized void withdraw(int money) {
		if(balance>=money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			balance-=money;
		}		
	}
	*/
	public void withdraw(int money) {
		synchronized (this) {
			
			if(balance>=money) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				balance-=money;
			}		
		}
	
	}
	
}

class MyRunnable6 implements Runnable{
	Account acc = new Account();
	
	@Override
	public void run() {
		while(acc.balance>0) {
			int money=(int)(Math.random()*3+1)*100; //100,200,300
			
			acc.withdraw(money);
			System.out.println(Thread.currentThread().getName()+
					": money=" + money +" => balance=" +acc.balance);
		}//while		
	}
	
}





