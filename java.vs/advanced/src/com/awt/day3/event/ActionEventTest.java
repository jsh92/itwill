package com.awt.day3.event;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ActionEventTest extends Frame implements ActionListener{
	CheckboxGroup group;
	Checkbox ckM, ckF, ck1,ck2,ck3;
	Button btOk;
	
	public ActionEventTest(){
		super("버튼 클릭시 처리");
		init();
		addEvent();
		
		setSize(300, 200);
		setVisible(true);
	}
	
	private void addEvent() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}			
		});
		
		//이벤트 소스 : btOk
		//리스너 : ActionListener
		btOk.addActionListener(this);
	}

	private void init() {
		setLayout(new FlowLayout());
		
		group = new CheckboxGroup();
		ckM = new Checkbox("남자", group, true);
		ckF = new Checkbox("여자", group, false);
		
		ck1 = new Checkbox("사과");
		ck2 = new Checkbox("배");
		ck3 = new Checkbox("오렌지");
		
		btOk = new Button("확인");
		
		add(ckM);
		add(ckF);
		add(ck1);
		add(ck2);
		add(ck3);
		add(btOk);
	}

	public static void main(String[] args) {
		ActionEventTest f = new ActionEventTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Checkbox 에서 선택된 값 읽어오기
		String gender="", fruit="";
		if(ckM.getState()) {
			gender = "남";
		}else if(ckF.getState()) {
			gender ="여";
		}
		
		if(ck1.getState()) {
			fruit += ck1.getLabel()+" ";
		}
		if(ck2.getState()) {
			fruit += ck2.getLabel()+" ";
		}
		if(ck3.getState()) {
			fruit += ck3.getLabel()+" ";
		}
		
		System.out.println("성별:"+ gender+", 좋아하는 과일:"+ fruit);
	}

}
