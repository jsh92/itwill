package com.awt.day2;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CardLayoutTest {

	public static void main(String[] args) {
		Frame f = new Frame("CardLayout");
		CardLayout cardLayout = new CardLayout(10, 10);
		
		f.setLayout(cardLayout);
		
		Panel pl1 = new Panel();
		pl1.setBackground(Color.pink);
		
		Panel pl2 = new Panel();
		pl2.setBackground(Color.green);
		
		Panel pl3 = new Panel();
		pl3.setBackground(Color.orange);
		
		pl1.add(new Label("Card1"));
		pl2.add(new Label("Card2"));
		pl3.add(new Label("Card3"));
		
		f.add(pl1, "1");
		f.add(pl2, "2");
		f.add(pl3, "3");
		
		f.setSize(300,300);
		f.setVisible(true);
		
		//public void show(Container parent, String name)
		cardLayout.show(f, "1");
		
		class EventHandler extends MouseAdapter{
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getModifiers() == e.BUTTON3_MASK) {
					//public void previous(Container parent)
					cardLayout.previous(f);
					//CardLayout의 이전 Panel을 보여준다
				}else {
					cardLayout.next(f);
				}
			}							
		}//local class
		
		//이벤트 연결
		pl1.addMouseListener(new EventHandler());
		pl2.addMouseListener(new EventHandler());
		pl3.addMouseListener(new EventHandler());
		
	}//main

	
}
