package com.awt.day2.event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ActionEventTest extends Frame{
	Label lb1, lb2;
	TextField tfId, tfPwd;
	Button btOk;
	
	public ActionEventTest() {
		super("로그인");
		
		init();
		
		//이벤트 연결
		addEvent();
		
		setSize(450, 200);
		setVisible(true);		
	}
	
	private void init() {
		setLayout(new FlowLayout());
		
		lb1 = new Label("ID", Label.RIGHT);
		lb2 = new Label("Password", Label.RIGHT);
		
		tfId=new TextField(10);
		tfPwd=new TextField(10);
		tfPwd.setEchoChar('*');
		
		btOk=new Button("OK");
		
		add(lb1);
		add(tfId);
		add(lb2);
		add(tfPwd);
		add(btOk);
		
	}

	private void addEvent() {
		//이벤트 소스 : btOk, tfPwd 
		//이벤트 리스너 : ActionListener
		btOk.addActionListener(new EventHandler());
		tfPwd.addActionListener(new EventHandler());
		
		//
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}			
		});
	}

	//inner class
	class EventHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(!tfId.getText().equals("hong")) {
				System.out.println("아이디가 존재하지 않습니다.");
				tfId.requestFocus(); 
				tfId.selectAll();
			}else if(!tfPwd.getText().equals("1234")) {
				System.out.println("비밀번호가 일치하지 않습니다.");
				tfPwd.requestFocus();
				tfPwd.selectAll();
			}else {
				System.out.println("hong님 로그인되었습니다.");
			}
		}
		
	}
	
	public static void main(String[] args) {
		ActionEventTest f = new ActionEventTest();
	}

}





