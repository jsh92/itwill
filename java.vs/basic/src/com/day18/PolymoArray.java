package com.day18;

public class PolymoArray {

	public static void main(String[] args) {
		Shape[] shArr = new Shape[4];
		
		//Shape배열에는 자식 객체를 넣는다		
		//=> 다형성 이용
		shArr[0] = new Circle();
		shArr[1] = new Triangle();
		shArr[2] = new Triangle();
		shArr[3] = new Circle();
		
		for(int i=0;i<shArr.length;i++) {
			shArr[i].draw();  //자식의 오버라이딩 메서드 호출
			shArr[i].delete();
		}//for
		
	}

}
