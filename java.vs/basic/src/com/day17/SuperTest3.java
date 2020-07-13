package com.day17;

class Father{
	protected String name;
	
	Father(String name){
		this.name=name;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
	}
}//class

class Son extends Father{
	//부모 생성자에 매개변수가 있으므로 자식 클래스에는 반드시 생성자가 있어야 함
	Son(String name){
		super(name);  //부모 생성자에 매개변수를 넣어줘야 하므로
	}
	
}//class

public class SuperTest3 {
	public static void main(String[] args) {
		Son s = new Son("아들");
		s.showInfo();
	}

}
