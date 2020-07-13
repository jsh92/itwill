package com.awt.day3.event;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ItemEventTest2 extends Frame implements ItemListener{
	CheckboxGroup group;
	Checkbox ck1, ck2,ck3;
	TextField tfResult;
	
	public ItemEventTest2(){
		super("Item Event");
		init();
		addEvent();
		
		setSize(300, 250);
		setVisible(true);		
	}
	
	private void addEvent() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}			
		});
		
		//이벤트 소스 : ck1, ck2, ck3
		//이벤트 리스너 : ItemListener
		ck1.addItemListener(this);
		ck2.addItemListener(this);
		ck3.addItemListener(this);		
	}
	
	private void init() {
		setLayout(new FlowLayout());
		
		group=new CheckboxGroup();
		ck1 = new Checkbox("java", group, false);
		ck2 = new Checkbox("jsp", group, false);
		ck3 = new Checkbox("oracle", group, false);
		
		tfResult=new TextField(20);
		
		add(ck1);
		add(ck2);
		add(ck3);
		add(tfResult);		
	}

	public static void main(String[] args) {
		ItemEventTest2 f = new ItemEventTest2();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Checkbox ck=(Checkbox) e.getSource(); //이벤트가 발생한 소스(컴포넌트)
		String str=ck.getLabel();
		tfResult.setText("선택한 항목 : " + str);
	}

}
