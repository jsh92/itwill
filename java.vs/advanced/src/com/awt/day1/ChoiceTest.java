package com.awt.day1;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;

public class ChoiceTest {

	public static void main(String[] args) {
		Frame f = new Frame("콤보박스");
		
		Choice ch = new Choice();
		ch.add("사과");  // Choice의 목록에 나타날 값들을 추가한다.
		ch.add("배");
		ch.add("귤");
		ch.add("포도");
		
		f.setLayout(new FlowLayout()); //Frame의 레이아웃 매니저를  FlowLayout
										//으로 변경
		f.add(ch);
		
		f.setSize(300, 200);
		f.setVisible(true);
	}

}
