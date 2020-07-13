package com.day17;

class Points{
	//2차원 점의 좌표
	protected int x, y;
	
	//생성자
	Points(int x, int y){
		
		this.x=x;
		this.y=y;
	}
	
	public String findLocation() {
		return "x="+x+", y="+y;
	}
	
}//class

class Points3D extends Points{
	//3차원 점의 좌표
	private int z;
		
	//생성자
	/*
	 상속을 받았을 경우 부모클래스의 생성자가 매개변수를 가지고 있다면 
	 자식은  부모의  생성자에게  매개변수를  넣어줘야 함
	 
	 생성자의 첫 줄에서 this()나 super()를 이용해서 다른 생성자를 호출하지 않으면
	 컴파일러가 자동으로 super()를 넣어준다
 	 */
	Points3D(int x, int y, int z){
		super(x, y);
		this.z=z;
	}
	
	public String findLocation() {
		//return "x="+x+", y="+y+", z=" + z;
		
		//부모 메서드 호출 => super.부모 메서드()
		String str = super.findLocation();
		return str +", z=" + z;
	}
}//class

public class OverridingTest {
	public static void main(String[] args) {
		Points p = new Points(10, 20);
		String location=p.findLocation();
		System.out.println("2차원 점의 좌표 : " + location+"\n");
		
		Points3D p2 = new Points3D(100,200,300);
		location=p2.findLocation();
		System.out.println("3차원 점의 좌표: " + location);
	}

}
