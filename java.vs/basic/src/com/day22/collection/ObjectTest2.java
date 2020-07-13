package com.day22.collection;

class Person{
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	//public String toString()
	
	//Object의 toString() 오버라이딩
	public String toString() {
		return "Person [name="+name+", age="+ age +"]";
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age+"\n");
	}
}

public class ObjectTest2 {

	public static void main(String[] args) {
		Person p = new Person("홍길동", 20);
		
		System.out.println("p.toString()=>"+p.toString());
		System.out.println("p="+p);  //toString()메서드 호출
		System.out.println(p);
		

	}

}
