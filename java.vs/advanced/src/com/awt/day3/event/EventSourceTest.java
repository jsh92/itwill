package com.awt.day3.event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EventSourceTest extends Frame{
	Button btAdd, btEdit, btDel;
	Label lb;
	
	public EventSourceTest(){
		super("이벤트 연습");
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
		
		//이벤트 소스 : btAdd, btEdit, btDel
		//리스너 : ActionListener
		btAdd.addActionListener(new EventHandler());
		btEdit.addActionListener(new EventHandler());
		btDel.addActionListener(new EventHandler());		
	}

	//inner class
	class EventHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String str = e.getActionCommand();
			
			if(e.getSource()==btAdd) {
				lb.setText(str+"버튼 클릭!, 저장합니다.");
			}else if(e.getSource()==btEdit) {
				lb.setText(str+"버튼 클릭!, 수정합니다.");				
			}else if(e.getSource()==btDel) {
				lb.setText(str+"버튼 클릭!, 제거합니다.");				
			}			
		}
		
	}
	
	private void init() {
		setLayout(new FlowLayout());
		
		btAdd=new Button("등록");
		btEdit=new Button("수정");
		btDel=new Button("삭제");
		
		lb = new Label("버튼을 클릭하면 결과 출력이 됩니다.");
		
		add(btAdd);
		add(btEdit);
		add(btDel);
		add(lb);		
	}

	public static void main(String[] args) {
		EventSourceTest f = new EventSourceTest();
	}

}
