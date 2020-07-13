package com.awt.day3.event;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class KeyEventTest extends Frame{
	Label lb1, lb2;
	TextField tfSsn1, tfSsn2;
	
	public KeyEventTest(){
		super("key event");
		
		init();
		addEvent();
		
		this.setSize(400,200);
		this.setVisible(true);
	}
	
	private void addEvent() {
		
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}			
		});
		
		//주민번호 앞자리를 모두 입력하면 다음 텍스트 필드로 포커스 이동하기
		//이벤트 소스 : tfSsn1
		//이벤트 리스너 : KeyListener
		tfSsn1.addKeyListener(new EventHandler());
	}

	//inner class
	class EventHandler implements KeyListener{

		@Override
		public void keyPressed(KeyEvent e) {
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			String ssn1=tfSsn1.getText();
			if(ssn1.trim().length()==6) {
				tfSsn2.requestFocus();
			}
		}

		@Override
		public void keyTyped(KeyEvent e) {
			
		}
		
	}
	
	private void init() {
		this.setLayout(new FlowLayout());
		
		lb1 = new Label("주민번호");
		lb2 = new Label(" - ");
		tfSsn1 = new TextField(10);
		tfSsn2 = new TextField(10);
		tfSsn2.setEchoChar('*');
		
		this.add(lb1);
		this.add(tfSsn1);
		this.add(lb2);
		this.add(tfSsn2);		
	}

	public static void main(String[] args) {
		KeyEventTest f = new KeyEventTest();
	}

}
