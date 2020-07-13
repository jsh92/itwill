package com.awt.day2.event;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameEventTest extends Frame{

	public FrameEventTest(){
		super("닫기 처리");
		
		//이벤트 연결
		//=> 이벤트 소스에 이벤트 리스너로 이벤트 처리기를 연결(등록)한다
		//이벤트 소스 : Frame
		//이벤트 : WindowEvent
		this.addWindowListener(new EventHandler());
		
		this.setSize(300,300);
		this.setVisible(true);
	}
	
	//inner class
	class EventHandler implements WindowListener{

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			//닫기 버튼 클릭시 프로그램 종료되도록 처리
			System.exit(0);
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static void main(String[] args) {
		FrameEventTest f = new FrameEventTest();
	}

}
