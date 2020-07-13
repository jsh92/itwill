package com.thread.day1;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class ProgressBarTest extends JFrame implements ActionListener, Runnable {
	JLabel lb;
	JTextField tf;
	JButton btStart;
	JProgressBar bar;
	// JProgressBar-상태바, 진행바
	// - 현재 작업량의 상태 표시를 시각화해서 보여주는 컴포 넌트
	Thread th; // 버튼 클릭시 작동할 쓰레드

	public ProgressBarTest() {
		super("진행바");

		init();
		addEvent();
		setSize(500, 500);
		setVisible(true);
	}

	private void addEvent() {

		btStart.addActionListener(this);

	}

	private void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		lb = new JLabel("메모");
		tf = new JTextField(20);
		btStart = new JButton("시작");
		bar = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100); // 0과 100이 최소값, 최대값
		bar.setStringPainted(true);// 진행바에 퍼센티지가 표시됨

		add(lb);
		add(tf);
		add(btStart);
		add(bar);

	}

	public static void main(String[] args) {
		ProgressBarTest f = new ProgressBarTest();
	}

	@Override
	public void run() {
		int min = bar.getMinimum();
		int max = bar.getMaximum();

		System.out.println("min= " + min + ", max= " + max);

		synchronized (bar) {
			for (int i = min; i <= max; i++) {
				bar.setValue(i);

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			} // for

		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btStart) {
			th = new Thread(this);
			th.start();
		}
	}

}