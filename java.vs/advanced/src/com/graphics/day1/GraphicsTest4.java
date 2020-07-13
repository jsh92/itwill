package com.graphics.day1;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class GraphicsTest4 extends Frame{
	int x, y;
	Image image;
	Graphics imgG;
	
	public GraphicsTest4() {
		super("그래픽4");
		
		setSize(500, 500);
		setVisible(true);
		
		image=createImage(500, 500);
		imgG = image.getGraphics();
		
		imgG.drawString("왼쪽 마우스를 누른채로 마우스를 움직여보세요", 10, 50);
		
		this.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {				
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				x=e.getX();
				y=e.getY();
				
				imgG.drawString("^", x, y);
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
		GraphicsTest4 f = new GraphicsTest4();
	}

}
