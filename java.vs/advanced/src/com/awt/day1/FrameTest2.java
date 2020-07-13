package com.awt.day1;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class FrameTest2 {

	public static void main(String[] args) {
		Frame f = new Frame("프레임 위치 연습");
		f.setSize(300, 400);
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dimension=toolkit.getScreenSize();  // 화면의 크기를 구한다.
		
		// 화면크기의 절반값에서 Frame크기의 절반값을 뺀 위치로 하면
		// Frame이 화면 가운데 위치하게 된다.
		f.setLocation(dimension.width/2 - 150, dimension.height/2-200);
		f.setVisible(true);		
	}

}
