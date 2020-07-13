package com.day17;

import java.util.Scanner;

class Person{
	protected String name;
	protected int age;
	
	Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}//class

class Student extends Person{
	private String sNo;  //학번
	
	Student(String name, int age, String sNo){
		super(name, age);
		this.sNo=sNo;
	}
	
	public String getSNo() {
		return sNo;
	}
	
	public void setSNo(String sNo) {
		this.sNo=sNo;
	}
	
	//오버라이딩 메서드
	public void showInfo() {
		super.showInfo();  //부모 메서드 호출
		System.out.println("학번 : " + sNo+"\n");
	}
}//class

public class PersonTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 이름, 나이, 학번 입력!");
		String name=sc.nextLine();
		String age=sc.nextLine();
		String sNo=sc.nextLine();
		
		Student st = new Student(name, Integer.parseInt(age), sNo);
		st.showInfo();
		
		//멤버변수 값 변경
		st.setAge(20);
		st.setName("김길동");
		st.setSNo("20110231");
		
		//getter 이용해 출력
		System.out.println("이름은 " + st.getName());
		System.out.println("나이는 " + st.getAge());
		System.out.println("학번은 " + st.getSNo());
		
	}

}
