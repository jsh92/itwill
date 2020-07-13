package com.thread.day1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Mythread1 {

	public static void main(String[] args) {
		Mythread th = new Mythread();
		th.setPriority(Thread.MAX_PRIORITY);
		th.start();
		Run r = new Run();
		Thread th2 = new Thread(r);
		th2.start();
		
		System.out.println("���� ������ ����");
		
		
	}

}

class Mythread extends Thread{

	@Override
	public void run() {
		Scanner sc =new Scanner(System.in);
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է�");
		int result = Integer.parseInt(input);
		int sum=0;
		for(int i=0;i<=result;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
}
class Run implements Runnable{

	@Override
	public void run() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-DD-mm HH:mm:ss");
		for(int i=0;i<5;i++) {
			
			Date d  = new Date();
			String str=sdf.format(d);
			
			System.out.println("\n\n"+str);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}