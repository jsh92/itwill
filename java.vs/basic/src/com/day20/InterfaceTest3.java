package com.day20;

/*
AA클래스와 BB 클래스는 간접적인 관계

클래스 A 가 클래스 B를 직접 호출하지 않고 인터페이스를 매개체로 하는 경우
- 클래스 A는 인터페이스 I 하고만 직접적인 관계에 있기 때문에 
   클래스 B의 변경에 영향을 받지 않음 
*/
class AA{
	public void methodA(II i) {
		i.method();
	}
}

interface II{
	void method();
}

class BB implements II{
	public void method() {
		System.out.println("BB의 메서드!!");
	}
}

class CC implements II{
	public void method() {
		System.out.println("CC의 메서드!!");
	}
}

public class InterfaceTest3 {

	public static void main(String[] args) {
		AA obj = new AA();
		//obj.methodA(new BB());
		
		//II b = new BB();
		//obj.methodA(b);
		
		obj.methodA(new CC());
		
		II c = new CC();
		obj.methodA(c);
		
	}

}
