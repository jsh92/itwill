package com.day16;

import java.util.Scanner;

class Person{
	protected String name;
	protected int age;
	
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
}//class

class Student extends Person{
	private String major; //전공
	
	public String getMajor() {
		return major; 
	}
	
	public void setMajor(String major) {
		this.major=major;
	}
}//class

public class PersonInherit {

	public static void main(String[] args) {

		Student st = new Student();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 나이, 전공 입력!");
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String major = sc.nextLine();
		
		st.setAge(age);
		st.setMajor(major);
		st.setName(name);
		
		System.out.println("\n이름 : " + st.getName());
		System.out.println("나이 : " + st.getAge());
		System.out.println("전공 : " + st.getMajor());
		
	}

}
