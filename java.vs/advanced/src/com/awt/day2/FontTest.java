package com.awt.day2;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;

public class FontTest {

	public static void main(String[] args) {
		Frame f = new Frame("Font");
		
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		Label lb1 = new Label(str);
		Label lb2 = new Label(str);
		Label lb3 = new Label(str);
		Label lb4 = new Label(str);
		Label lb5 = new Label(str);
		
		Font f1 = new Font("Serif", Font.PLAIN, 20);
		Font f2 = new Font("Serif", Font.BOLD, 20);
		Font f3 = new Font("Serif", Font.ITALIC, 20);
		Font f4 = new Font("Serif", Font.BOLD+Font.ITALIC, 20);
		
		lb1.setFont(f1);
		lb2.setFont(f2);
		lb3.setFont(f3);
		lb4.setFont(f4);
		
		f.setLayout(new FlowLayout());
		f.add(lb1);
		f.add(lb2);
		f.add(lb3);
		f.add(lb4);
		f.add(lb5);
		
		f.setSize(400, 400);
		f.setVisible(true);
		
	}

}
