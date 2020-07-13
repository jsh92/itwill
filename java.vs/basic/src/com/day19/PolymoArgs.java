package com.day19;

class Person{
	public String kind() {
		return "사람";
	}
}//

class Student extends Person{
	public String kind() {
		return "학생";
	}
}//

class Graduate extends Student{
	public String kind() {
		return "대학원생";
	}
}//

class Assitant extends Person{
	public String kind() {
		return "조교";
	}
}//

class Professor extends Person{
	public String kind() {
		return "교수";
	}
}//

public class PolymoArgs {
	/*
	public static void register(Student st) {
		System.out.println(st.kind() + "은 등록을 합니다.");
	}

	public static void register(Graduate gr) {
		System.out.println(gr.kind() + "은 등록을 합니다.");
	}
	
	public static void register(Assitant as) {
		System.out.println(as.kind() + "은 등록을 합니다.");
	}	
	*/
	
	public static void register(Person p) {
		//if(p instanceof Student || p instanceof Graduate 
		//		|| p instanceof Assitant) {
		if(p instanceof Student || p instanceof Assitant) {
			System.out.println(p.kind() + "은 등록을 합니다.");
		}else {
			System.out.println(p.kind() + "은 등록할 수 없습니다.");
		}
	}
	
	public static void main(String[] args) {
		Student s=new Student();
		register(s);
		
		Graduate g = new Graduate();
		register(g);
		
		register(new Assitant());
		
		Person p = new Professor();
		register(p);
		
	}

}
