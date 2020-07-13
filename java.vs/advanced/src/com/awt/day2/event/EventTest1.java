package com.awt.day2.event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTest1 extends Frame{
	Button bt;
	TextField tf;
	Label lb;
	
	public EventTest1(){
		super("버튼 클릭 이벤트 연습");
		
		bt = new Button("확인");
		tf = new TextField(10);
		lb = new Label("여기에 결과가 출력됩니다.");
		
		setLayout(new FlowLayout());
		
		add(tf);
		add(bt);
		add(lb);
		
		setSize(300, 300);
		setVisible(true);
		
		//이벤트 연결
		//이벤트 소스 : bt Button
		//이벤트 : ActionEvent
		//이벤트 핸들러 : ActionListener 구현한 클래스
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String cmd=e.getActionCommand();
				String result = tf.getText() +", " + cmd+"버튼이 클릭됨!";
				lb.setText(result);
			}
		});
	}
	
	public static void main(String[] args) {
		EventTest1 f = new EventTest1();
	}

}
