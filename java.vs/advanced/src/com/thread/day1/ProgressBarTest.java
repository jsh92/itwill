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
	// JProgressBar-���¹�, �����
	// - ���� �۾����� ���� ǥ�ø� �ð�ȭ�ؼ� �����ִ� ���� ��Ʈ
	Thread th; // ��ư Ŭ���� �۵��� ������

	public ProgressBarTest() {
		super("�����");

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
		lb = new JLabel("�޸�");
		tf = new JTextField(20);
		btStart = new JButton("����");
		bar = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100); // 0�� 100�� �ּҰ�, �ִ밪
		bar.setStringPainted(true);// ����ٿ� �ۼ�Ƽ���� ǥ�õ�

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