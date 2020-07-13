package com.day25;

// Cloneable인터페이스를 구현한 클래스에서만 clone()을 호출할 수 있다. 
//이 인터페이스를 구현하지 않고 clone()을 호출하면 예외가 발생한다.
class Point implements Cloneable{
	private int x, y;
	
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
		
	public String toString() {
		return "Point [ x="+x+", y="+y +"]";
	}
	
	public Point copy() throws CloneNotSupportedException {
		Object obj = clone();
		
		return (Point)obj;
	}
	
}//

public class CloneTest {
	public static void main(String[] args) {
		Point p = new Point(10, 20);
		try {
			Point p2 = p.copy();
			p2.setX(88);
			p2.setY(90);
			
			System.out.println("p="+p);
			System.out.println("copy한 인스턴스 p2="+p2);
			System.out.println("p 주소 : " + p.hashCode());
			System.out.println("p2 주소 : " + p2.hashCode());			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
