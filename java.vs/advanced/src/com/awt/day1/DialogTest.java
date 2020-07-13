package com.awt.day1;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogTest {

	public static void main(String[] args) {
		Frame f = new Frame("Dialog");
		
		Dialog info = new Dialog(f, "information", true); //modal·Î ÁöÁ¤
		info.setSize(140, 130);
		info.setLocation(50, 50);
		
		Label lb = new Label("this is modal dialog.");
		Button bt = new Button("OK");
		
		info.setLayout(new FlowLayout());
		info.add(lb);
		info.add(bt);
		
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				info.dispose();
			}
		});
		
		f.setSize(400, 400);
		f.setVisible(true);
		
		info.setVisible(true);
		
	}

}
