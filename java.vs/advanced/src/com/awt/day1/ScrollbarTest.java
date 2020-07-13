package com.awt.day1;

import java.awt.Frame;
import java.awt.Scrollbar;

public class ScrollbarTest {

	public static void main(String[] args) {
		Frame f = new Frame("Scrollbar");
		f.setLayout(null);
		
		//public Scrollbar(int orientation,int value, int visible,
        		//			int minimum,  int maximum)
		Scrollbar sbar1 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 50, 0,100);
		sbar1.setSize(100, 15);
		sbar1.setLocation(60, 80);
		
		Scrollbar sbar2 = new Scrollbar(Scrollbar.VERTICAL, 50, 20, 0, 100);
		sbar2.setSize(15, 100);
		sbar2.setLocation(60, 130);
		
		f.add(sbar1);
		f.add(sbar2);
		
		f.setSize(400, 300);
		f.setVisible(true);
		
		
	}

}
