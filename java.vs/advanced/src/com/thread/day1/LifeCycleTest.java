package com.thread.day1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LifeCycleTest extends Frame implements ActionListener,
Runnable{
int x=30, y=100;

Button btStart, btStop;
Panel pl;
Thread th;

public LifeCycleTest() {
	super("쓰레드 life cycle");
	
	init();
	addEvent();
	
	setSize(500, 500);
	setVisible(true);
}


@Override
public void paint(Graphics g) {
	g.setColor(Color.orange);
	g.fillOval(x, y, 70, 70);
}


private void addEvent() {
	this.addWindowListener(new WindowAdapter() {

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}			
	});
	
	btStart.addActionListener(this);
	btStop.addActionListener(this);
}

private void init() {
	btStart=new Button("시작");
	btStop=new Button("중지");
	
	pl=new Panel();
	pl.add(btStart);
	pl.add(btStop);
	
	add(pl, "South");
}

public static void main(String[] args) {
	LifeCycleTest f = new LifeCycleTest();		
}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==btStart) {
		th = new Thread(this);
		th.start();
	}else if(e.getSource()==btStop) {
		th.interrupt();
	}
}


@Override
public void run() {
	//1) x위치 증가
	//2) repaint() 호출
	
	System.out.println("프레임의 가로 크기: "+this.getWidth());
	
	while(true) {
		if(x>this.getWidth()) {
			x=0;
		}
		
		x+=5; //1)
		
		repaint(); //2)
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println(e);
			break; //중지 클릭하면, interrupt()메서드에 의해
					//InterruptedException: sleep interrupted
		}
	}//while
}

}