package com.awt.day1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

public class CanvasTest {

	public static void main(String[] args) {
		Frame f = new Frame("Canvas");
		f.setLayout(new FlowLayout());
		
		Canvas canvas = new Canvas();
		canvas.setBackground(Color.green);
		canvas.setSize(200, 200);
		
		f.add(canvas);
		f.setSize(400, 300);
		f.setVisible(true);
		
	}

}




