package com.awt.day1;

import java.awt.Button;
import java.awt.Frame;

public class ButtonTest {

	public static void main(String[] args) {
		Frame f = new Frame("버튼 연습");
		
		Button bt = new Button("확인");
		f.add(bt); //Frame 에  Button 추가(포함시키기)
		
		f.setSize(300,200);
		f.setVisible(true);
		
		//Frame의 기본 레이아웃은 BorderLayout
		//컨테이너에는 레이아웃 매니저를 선택적으로 설정할 수 있는데, 
		//레이아웃 매니저는 컨테이너의 크기가 변경될 때마다 컨테이너에 포함된 컴포넌트들의 
		//크기와 위치를 자동적으로 관리해 줌
	}

}
