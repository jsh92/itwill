package com.awt.day3.event;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseEventTest extends Frame {
	Label lb;
	
	public MouseEventTest(){
		super("Mouse Event");
		
		init();
		addEvent();
		
		this.setSize(400, 300);
		this.setVisible(true);
	}
	
	private void addEvent() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}			
		});
		
		//이벤트 소스 : Frame
		//이벤트 리스너 : MouseMotionListener
		this.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				lb.setText("Mouse Pointer Location : ("+ e.getX()+ 
						", " + e.getY()+")");
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
			}
		});
	}

	private void init() {
		this.setLayout(null);
		
		lb = new Label("Mouse Pointer Location : ");
		lb.setSize(230, 20);
		lb.setLocation(10, 40);
		lb.setBackground(Color.cyan);
		
		add(lb);
	}

	public static void main(String[] args) {
		MouseEventTest f = new MouseEventTest();
	}

}
