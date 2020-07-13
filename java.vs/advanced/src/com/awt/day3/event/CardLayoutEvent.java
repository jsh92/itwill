package com.awt.day3.event;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CardLayoutEvent extends Frame implements ActionListener{
	Panel plSlide, plButtons, plCard1, plCard2, plCard3, plCard4, plCard5;
	Button btFirst, btLast, btPrev, btNext;
	CardLayout cardLayout;
	
	public CardLayoutEvent(){
		super("CardLayout");
		
		init();
		addEvent();
		
		setSize(300, 300);
		setVisible(true);
		
		
	}
	
	private void addEvent() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}			
		});
		
		//이벤트 소스 : btFirst, btLast, btNext, btPrev
		//리스너 : ActionListener
		btFirst.addActionListener(this);
		btLast.addActionListener(this);
		btPrev.addActionListener(this);
		btNext.addActionListener(this);
		
	}

	private void init() {
		cardLayout = new CardLayout();
		
		plSlide = new Panel();
		plSlide.setLayout(cardLayout);
		
		plButtons = new Panel();
		
		plCard1 = new Panel();
		plCard1.add(new Label("첫번째 페이지입니다."));
		plCard1.setBackground(Color.cyan);
		
		plCard2 = new Panel();
		plCard2.add(new Label("두번째 페이지입니다."));
		plCard2.setBackground(Color.pink);
		
		plCard3 = new Panel();
		plCard3.add(new Label("세번째 페이지입니다."));
		plCard3.setBackground(Color.green);
		
		plCard4 = new Panel();
		plCard4.add(new Label("네번째 페이지입니다."));
		plCard4.setBackground(Color.yellow);
		
		plCard5 = new Panel();
		plCard5.add(new Label("다섯번째 페이지입니다."));
		plCard5.setBackground(Color.orange);
		
		plSlide.add(plCard1,"1");
		plSlide.add(plCard2,"2");
		plSlide.add(plCard3,"3");
		plSlide.add(plCard4,"4");
		plSlide.add(plCard5,"5");
		
		btFirst = new Button("<<");
		btPrev = new Button("<");
		btLast = new Button(">>");
		btNext = new Button(">");
		
		plButtons.add(btFirst);
		plButtons.add(btPrev);
		plButtons.add(btNext);
		plButtons.add(btLast);
		
		add(plSlide, "Center");
		add(plButtons, "South");
		
		cardLayout.show(plSlide, "1");
	}

	public static void main(String[] args) {
		CardLayoutEvent f = new CardLayoutEvent();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btFirst) {
			cardLayout.first(plSlide);
		}else if(e.getSource()==btLast) {
			cardLayout.last(plSlide);
		}else if(e.getSource()==btPrev) {
			cardLayout.previous(plSlide);		
		}else if(e.getSource()==btNext) {
			cardLayout.next(plSlide);		
		}
		
	}

}
