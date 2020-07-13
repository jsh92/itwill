package com.awt.day1;

import java.awt.Frame;

public class FrameTest {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setTitle("프레임 연습");
		
		f.setSize(400,200);
		f.setVisible(true);
		
		//크기조절도 되고, titlebar를 드래그하면 이동, 윈도우즈의 윈도우와 같은 기능
		//닫기 버튼 - 이벤트 처리 이용해서 기능 추가해 주어야 함

	}

}

