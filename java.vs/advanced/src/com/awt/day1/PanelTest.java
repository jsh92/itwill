package com.awt.day1;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

public class PanelTest {

	public static void main(String[] args) {
		Frame f = new Frame("Panel");
		f.setLayout(null);
		
		Panel p = new Panel(); //Panel 의 기본 레이아웃 매니저 => FlowLayout
		p.setSize(200, 200);
		p.setLocation(50, 80);
		p.setBackground(Color.lightGray);
		
		Button bt = new Button("OK");
		
		p.add(bt);
		f.add(p);
		
		f.setSize(400, 400);
		f.setVisible(true);
	}

}





