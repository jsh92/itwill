package com.awt.day1;

import java.awt.Button;
import java.awt.Frame;

public class ButtonTest2 {

	public static void main(String[] args) {
		Frame f = new Frame("버튼");
		f.setLayout(null); //레이아웃 매니저의 설정 해제
		
		Button bt = new Button("닫기");
		bt.setSize(100, 50);
		bt.setLocation(100, 75);
		
		f.add(bt);
		
		f.setSize(300, 400);
		f.setVisible(true);
		
	}

}
