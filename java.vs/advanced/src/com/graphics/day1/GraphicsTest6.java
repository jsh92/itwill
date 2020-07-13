package com.graphics.day1;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class GraphicsTest6 extends Frame{
	int x, y;
	Image image;
	Graphics imgG;
	
	public GraphicsTest6() {
		super("그래픽4");
		
		setSize(500, 500);
		setVisible(true);
		
		image=createImage(500, 500);
		imgG = image.getGraphics();
		
		imgG.drawString("왼쪽 마우스를 누른채로 마우스를 움직여보세요", 10, 50);
		
		this.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {	
				x=e.getX();
				y=e.getY();				
			}
			
			//drawString() 대신에 drawLine()을 사용해서 Frame 에 자유롭게 선을 
			//그릴 수 있도록 하기
			@Override
			public void mouseDragged(MouseEvent e) {
				imgG.drawLine(x, y, e.getX(), e.getY());
				
				x=e.getX();
				y=e.getY();
				
				repaint();
			}
		});
	}
	
	
	@Override
	public void paint(Graphics g) {
		if(image!=null)
			g.drawImage(image, 0,0,this );
	}


	public static void main(String[] args) {
		GraphicsTest6 f = new GraphicsTest6();
	}

}
