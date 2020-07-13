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

public class GraphicsTest3 extends Frame{
	private int x,y;

	public GraphicsTest3(){
		super("그래픽3");
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
		

	}
	
	@Override
	public void paint(Graphics g) {
		g.drawString("마우스를 움직여보세요", 10, 50);
		g.drawString("*", x, y);
	}
	
	
	
	@Override
	public void update(Graphics g) {
		paint(g);
	}
	/*
	• update()는 컴포넌트의 영역을 지우고(배경색으로 채우고), paint()를 호출
	• 이 예제에서는 update()가 컴포넌트 영역을 지우지 않고 paint()만 호출하도록 오버라이딩 함
	• => 마우스 포인터의 자취가 남게 됨
	 */

	public static void main(String[] args) {
		GraphicsTest3 f = new GraphicsTest3();
	}
	
	
	
}
