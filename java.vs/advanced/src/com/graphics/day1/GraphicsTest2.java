package com.graphics.day1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GraphicsTest2 extends Frame{
	private int x,y;

	public GraphicsTest2(){
		super("그래픽2");
		setSize(500, 500);
		setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		this.addMouseMotionListener(new MouseMotionAdapter() {

			@Override
			public void mouseMoved(MouseEvent e) {
				x=e.getX();
				y=e.getY();
				repaint();
			}
			
		});
		
		/*
		• 높이와 폭이 500픽셀인 Frame을 생성하고, 마우스 포인터의 위치에 '*'을 출력
		• Frame 영역내에서 마우스 포인터를 이동시키면 '*'도 따라 움직이게 됨
		• 마우스를 움직이면 MouseEvent 가 발생하고, 이벤트 핸들러의 mouseMoved()가 호출됨
		• MouseEvent의 getX(), getY() 를 통해 포인터의 위치를 얻어서 멤버변수 x, y에 저장
		• 그리고 repain()를 호출해서 Frame 을 화면에 다시 그리도록 해야 새로운 위치에 '*' 이 출력됨
		 */
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawString("마우스를 움직여보세요", 10, 50);
		g.drawString("*", x, y);
	}

	public static void main(String[] args) {
		GraphicsTest2 f = new GraphicsTest2();
	}
	
	
	
}
