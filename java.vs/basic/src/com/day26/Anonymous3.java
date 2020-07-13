package com.day26;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Anonymous3 extends Frame{
	Button btExit;
	
	Anonymous3(){
		super("프레임 연습");
		
		btExit = new Button("종료");
		this.add(btExit, "South");
		
		//익명 클래스 이용
		btExit.addActionListener(new EventHandler());
	}
	
	//내부 클래스
	class EventHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
		
	}//
	
	public static void main(String[] args) {
		Anonymous3 f = new Anonymous3();
		f.setSize(300, 200);
		f.setVisible(true);
	}

}
