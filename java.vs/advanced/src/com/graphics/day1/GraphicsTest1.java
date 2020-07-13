package com.graphics.day1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GraphicsTest1 extends Frame{

	public GraphicsTest1(){
		super("그래픽");
		setSize(500, 500);
		setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}
	
	public static void main(String[] args) {
		GraphicsTest1 f = new GraphicsTest1();
	}

	@Override
	public void paint(Graphics g) {
		g.setFont(new Font("Serif", Font.PLAIN, 15));
		g.drawString("Graphics를 이용해서 그림을 그립니다." ,10, 50);

		g.drawOval(50,100, 50,50);
		g.setColor(Color.blue);
		g.fillOval(100,100, 50,50);

		g.setColor(Color.red);
		g.drawLine(100,100, 150,150);

		g.fillRoundRect(200, 100, 120, 80, 30, 30);
		g.setColor(Color.orange);
		g.fillPolygon(new int[]{ 50, 100, 150, 200}, 
			          new int[]{250, 200, 200, 250}, 4);
		g.setColor(Color.cyan);
		g.fillArc(250, 200, 100, 100, 0, 120);
		//public abstract void fillArc(int x, int y,
        //		int width, int height, int startAngle, int arcAngle)
	}

	
}
