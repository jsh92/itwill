package com.awt.day2.event;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AdapterTest extends Frame{
		
	public AdapterTest(){
		super("Adapter연습");
		
		setSize(300,300);
		setVisible(true);
		
		//이벤트 연결
		/*
		//익명 클래스 이용 
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}			
		});*/
		
		//내부 클래스 이용
		this.addWindowListener(new EventHandler());
	}
	
	//inner class
	class EventHandler extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}	
	}
	
	public static void main(String[] args) {
		AdapterTest f = new AdapterTest();		
	}

}
