package com.day17;

import java.util.Scanner;

class Person2{
	protected String name;
	protected int age;
	
	Person2(String name, int age) {
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

class Student2 extends Person2{
	protected String sNo;  //학번
	
	Student2(String name, int age, String sNo){
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
		System.out.println("학번 : " + sNo);
	}
	
	public void study() {
		System.out.println("공부를 합니다.");
	}
}//class

class Graduate extends Student2{
	private String major;
	
	Graduate(String name, int age, String sNo, String major){
		super(name, age, sNo);
		this.major=major;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major=major;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("전공 : " + major+"\n");
	}
	
	public void writeThesis() {
		System.out.println("논문을 씁니다.");
	}
}//class

public class PersonTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 이름, 나이, 학번 입력!");
		String name=sc.nextLine();
		String age=sc.nextLine();
		String sNo=sc.nextLine();
		
		Student2 st = new Student2(name, Integer.parseInt(age), sNo);
		st.showInfo();
		st.study();
		
		System.out.println("\n대학원생 이름, 나이, 학번, 전공 입력!");
		name=sc.nextLine();
		age=sc.nextLine();
		sNo=sc.nextLine();
		String major=sc.nextLine();
		
		Graduate gr = new Graduate(name, Integer.parseInt(age), 
				sNo, major);
		gr.showInfo();
		gr.study();
		gr.writeThesis();
	}

}
