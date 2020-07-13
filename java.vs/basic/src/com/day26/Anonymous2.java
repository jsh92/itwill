package com.day26;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Anonymous2 extends Frame{
	Button btExit;
	
	Anonymous2(){
		super("프레임 연습");
		
		btExit = new Button("종료");
		this.add(btExit, "South");
		
		//익명 클래스 이용
		btExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);  //프로그램 종료
			}
		});
	}
	
	public static void main(String[] args) {
		Anonymous2 f = new Anonymous2();
		f.setSize(300, 200);
		f.setVisible(true);
	}

}
