package com.day18;

public class Exam1 {

	public static void main(String[] args) {
		Triangle[] trArr = new Triangle[3];
		trArr[0] = new Triangle();
		trArr[1] = new Triangle();
		trArr[2] = new Triangle();
		
		for(int i=0;i<trArr.length;i++) {
			trArr[i].draw();
			trArr[i].delete();
		}//for
		
		
	}

}
