package com.graphics.day1;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GraphicsTest5 extends Frame{
	Image image;
	public GraphicsTest5() {
		super("이미지");
		
		setSize(500,500);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		image = tk.getImage("img/getjava.jpg");
		/*
		• getjava.jpg 라는 이미지를 화면의 중앙에 보여주는 예제
		• 파일명은 경로를 함께 지정해 주는 것이 좋다
		• 예제의 클래스 파일과 같은 경로에 있는 경우 경로명을 생략할 수 있다
		 */
	}
	
	
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(image, 100, 100, this);
	}



	public static void main(String[] args) {
		GraphicsTest5 f= new GraphicsTest5();
	}

}
