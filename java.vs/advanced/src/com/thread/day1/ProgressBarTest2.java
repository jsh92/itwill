package com.thread.day1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class ProgressBarTest2 extends JFrame implements ActionListener {
	JProgressBar bar1, bar2, bar3;
	JButton btStart;
	JPanel pl;
	MyBarThread th1, th2, th3;

	ProgressBarTest2() {
		super("진행바2");

		init();
		addEvent();
		setSize(300, 300);
		setVisible(true);

	}

	private void addEvent() {
		btStart.addActionListener(this);
	}

	private void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bar1 = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);
		bar2 = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);
		bar3 = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);
		bar1.setStringPainted(true);
		bar2.setStringPainted(true);
		bar3.setStringPainted(true);

		pl = new JPanel();
		pl.add(bar1);
		pl.add(bar2);
		pl.add(bar3);

		btStart = new JButton("시작");
		add(btStart, "South");
		add(pl, "Center");

	}

	public static void main(String[] args) {
		ProgressBarTest2 f = new ProgressBarTest2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btStart) {
			//MyBarThread.MyBarThread(int n, int interval, JProgressBar bar)
			th1 = new MyBarThread(5, 600, bar1); //bar증가치,sleep,JProgressBar
			th2 = new MyBarThread(10, 1000, bar2);
			th3 = new MyBarThread(5, 200, bar3);
			
			th1.start();
			th2.start();
			th3.start();
		}
	}

}

class MyBarThread extends Thread {
	int n; // 증가치
	int interval; // 지연시간
	JProgressBar bar;

	MyBarThread(int n, int interval, JProgressBar bar) {
		this.interval = interval;
		this.n = n;
		this.bar = bar;
	}

	@Override
	public void run() {
		synchronized (bar) {
			for (int i = bar.getMinimum(); i <= bar.getMaximum(); i += n) {
				bar.setValue(i);

				try {
					Thread.sleep(interval);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // for
		}
	}

}
