package com.awt.day2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderLayoutTest {

	public static void main(String[] args) {
		Frame f = new Frame("BorderLayout");
		f.setLayout(new BorderLayout());
		//=> Frame은 기본적으로 BorderLayout로 설정되어있으므로 따로 설정하지 않아도 됨

		Button btE = new Button("동");
		Button btW = new Button("서");
		Button btS = new Button("남");
		Button btN = new Button("북");
		Button btC = new Button("Center");
		
		//f.add(btE,"East");
		f.add(btW,"West");
		//f.add(btS,"South");
		f.add(btN,"North");
		//f.add(btC, BorderLayout.CENTER);
		
		f.setSize(300, 300);
		f.setVisible(true);
		
		// Center의 컴포넌트가 없으면 그 자리는 비어있게 됨
		// 다른 자리가 채워져 있지 않으면 Center의 컴포넌트가 그 자리를 메우게 됨

	}

}
