package com.day16;

class Points{
	//2차원 점의 좌표
	protected int x, y;
	
	public String findLocation() {
		return "x="+x+", y="+y;
	}
	
}//class

class Points3D extends Points{
	//3차원 점의 좌표
	private int z;
	
	//오버라이딩 메서드 - 부모로부터 상속받은 메서드의 내용을 변경하는 것
	//				   메서드 재정의
	public String findLocation() {
		return "x="+x+", y="+y+", z=" + z;
	}
}//class

public class OverridingTest {
	public static void main(String[] args) {
		Points p = new Points();
		String location=p.findLocation();
		System.out.println("2차원 점의 좌표 : " + location+"\n");
		
		Points3D p2 = new Points3D();
		location=p2.findLocation();
		System.out.println("3차원 점의 좌표: " + location);
	}

}
