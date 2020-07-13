package com.day26;

import com.day26.Outer.InstanceInner;
import com.day26.Outer.StaticInner;

class Outer{
	class InstanceInner{
		int iv=10;
		final static int CONST=20;
	}
	
	static class StaticInner{
		int iv=100;
		static int cv=200;
	}
	
	public void method() {
		class LocalInner{
			int iv=1000;
		}
		//메서드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근할 수 없다.
	}
	
}

public class InnerTest3 {
	public static void main(String[] args) {
		System.out.println("static클래스의 static변수: "
				+Outer.StaticInner.cv);
		System.out.println("인스턴스 클래스의 static final변수: "
				+Outer.InstanceInner.CONST);
		
		// 인스턴스클래스의 인스턴스를 생성하려면 외부 클래스의 인스턴스를 먼저 생성해야한다.
		Outer outer = new Outer();
		Outer.InstanceInner iInner = outer.new InstanceInner();
		System.out.println("인스턴스 클래스의 인스턴스 변수: "+iInner.iv);
		
		Outer.StaticInner sInner = new Outer.StaticInner();
		System.out.println("static 클래스의 인스턴스 변수: "+sInner.iv);
		
	}

}
