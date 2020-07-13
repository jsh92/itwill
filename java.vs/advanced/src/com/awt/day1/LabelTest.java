package com.awt.day1;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;

public class LabelTest {

	public static void main(String[] args) {
		Frame f = new Frame("Label");
		f.setLayout(null);
		
		Label lb = new Label("ID : ");
		lb.setBounds(50, 50, 30, 10); // 50, 50위치에 크기가 가로 30, 세로 10
		lb.setBackground(Color.cyan);
		
		Label lb2 = new Label("Password : ", Label.RIGHT); //오른쪽 정렬
		lb2.setBackground(Color.yellow);
		lb2.setSize(100, 10);
		lb2.setLocation(50, 100);
		
		f.add(lb);
		f.add(lb2);
		
		f.setSize(300, 300);
		f.setVisible(true);
		
	}

}
