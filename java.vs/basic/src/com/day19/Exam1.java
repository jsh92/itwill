package com.day19;

public class Exam1 {
	//(1) action() �޼��带 �ۼ��Ͻÿ�.
	public static void action(Robot r) {
		if(r instanceof DanceRobot) {
			DanceRobot d = (DanceRobot)r;
			d.dance();
		}else if(r instanceof SingRobot) {
			SingRobot s = (SingRobot)r;
			s.sing();
		}else if(r instanceof DrawRobot) {
			DrawRobot d = (DrawRobot)r;
			d.draw();
		}
	}
	
	public static void main(String[] args) {
		Robot[] arr 
		= { new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		for(int i=0; i< arr.length;i++) {
			if(arr[i] instanceof DanceRobot) {
				DanceRobot d = (DanceRobot)arr[i];
				d.dance();
			}else if(arr[i] instanceof SingRobot) {
				SingRobot s = (SingRobot)arr[i];
				s.sing();
			}else if(arr[i] instanceof DrawRobot) {
				DrawRobot d = (DrawRobot)arr[i];
				d.draw();
			}
		}//for
		
		for(int i=0;i<arr.length;i++) {
			action(arr[i]);			
		}//for
		
	} // main
}

class Robot {}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("���� ��ϴ�.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("�뷡�� �մϴ�.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("�׸��� �׸��ϴ�.");
	}
}
