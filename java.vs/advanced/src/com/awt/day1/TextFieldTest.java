package com.awt.day1;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

public class TextFieldTest {

	public static void main(String[] args) {
		Frame f = new Frame("TextField");
		f.setLayout(new FlowLayout());
		
		Label lb1 =new Label("ID : ", Label.RIGHT);
		Label lb2 =new Label("Password : ", Label.RIGHT);
		
		TextField tfId = new TextField(10); 
		//=> 약 10개의 글자를 입력할 수 있는 TextField 생성
		
		TextField tfPwd = new TextField(10); 
		tfPwd.setEchoChar('*');
		
		f.add(lb1);
		f.add(tfId);
		f.add(lb2);
		f.add(tfPwd);
		
		TextArea ta = new TextArea("하고 싶은 말을 입력하세요", 5, 40);
		f.add(ta);
		ta.selectAll();
		
		f.setSize(400,300);
		f.setVisible(true);
		
	}

}
