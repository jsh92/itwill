package com.awt.day2;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class ColorTest {

	public static void main(String[] args) {
		Frame f = new Frame("Color");
		f.setLayout(new GridLayout(14, 2));
		
		Panel p1 = new Panel();
		p1.setBackground(Color.black);
		Panel p2 = new Panel();
		p2.setBackground(Color.BLUE);
		Panel p3 = new Panel();
		p3.setBackground(Color.cyan);
		Panel p4 = new Panel();
		p4.setBackground(Color.DARK_GRAY);
		Panel p5 = new Panel();
		p5.setBackground(Color.gray);
		Panel p6 = new Panel();
		p6.setBackground(Color.GREEN);
		Panel p7 = new Panel();
		p7.setBackground(Color.lightGray);
		Panel p8 = new Panel();
		p8.setBackground(Color.MAGENTA);
		Panel p9 = new Panel();
		p9.setBackground(Color.orange);
		Panel p10 = new Panel();
		p10.setBackground(Color.pink);
		Panel p11 = new Panel();
		p11.setBackground(Color.red);
		Panel p12 = new Panel();
		p12.setBackground(Color.WHITE);
		Panel p13 = new Panel();
		p13.setBackground(Color.YELLOW);
		Panel p14 = new Panel();
		p14.setBackground(new Color(100, 50, 50));
		
		f.add(new Label("black"));
		f.add(p1);
		f.add(new Label("blue"));
		f.add(p2);
		f.add(new Label("cyan"));
		f.add(p3);
		f.add(new Label("dark gray"));
		f.add(p4);
		f.add(new Label("gray"));
		f.add(p5);
		f.add(new Label("green"));
		f.add(p6);
		f.add(new Label("light gray"));
		f.add(p7);
		f.add(new Label("margenta"));
		f.add(p8);
		f.add(new Label("orange"));
		f.add(p9);
		f.add(new Label("pink"));
		f.add(p10);
		f.add(new Label("red"));
		f.add(p11);
		f.add(new Label("white"));
		f.add(p12);
		f.add(new Label("yellow"));
		f.add(p13);
		f.add(new Label("new Color(100,50,50)"));
		f.add(p14);
		
		f.setSize(400, 600);
		f.setVisible(true);
		
	}

}



