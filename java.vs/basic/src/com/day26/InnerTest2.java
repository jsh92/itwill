package com.day26;

class Outer1{
	private int outerIv=10;
	static int outerCv = 20;
	
	class InstanceInner{
		int iv = outerIv;
		int iv2 = outerCv;
	}
	
	static class StaticInner{
		static int cv = outerCv;
		//int iv = outerIv; //error
		//=> 스태틱 클래스는 외부 클래스의 static 멤버만 접근할 수 있다.
	}
	
	public void method() {
		int lv = 100;
		final double PI = 3.14;
		
		class LocalInner{
			int iv = outerIv;
			int iv2 = outerCv;
			int iv3 = lv; //JDK 8.0 이전에는 error
			//외부 클래스의 지역변수는 final이 붙은 변수(상수)만 접근가능하다.
			//=> JDK 8.0 부터는 지역변수도 접근 가능

			double d = PI;
		}
	}
}

public class InnerTest2 {
	public static void main(String[] args) {

	}

}
