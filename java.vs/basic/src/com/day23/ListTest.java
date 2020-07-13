package com.day23;

import java.util.ArrayList;
import java.util.Iterator;

class Member{
	private String id;
	private int age;
	
	Member(String id, int age){
		this.id=id;
		this.age=age;				
	}
	
	public String toString() {
		return "Member[id="+id+", age="+age+ "]";
	}	
	
	public void showInfo() {
		System.out.println("아이디 : " + id);
		System.out.println("나이 : " + age+"\n");		
	}
	
}//

public class ListTest {
	public static void main(String[] args) {
		ArrayList<Member> list = new ArrayList<Member>(3);
		
		list.add(new Member("hong", 20));
		list.add(new Member("kim", 21));
		list.add(new Member("lee", 22));
		
		for(int i=0;i<list.size();i++) {
			Member m=list.get(i);
			
			System.out.println(m);
		}//for

		System.out.println("\n=====Iterator 이용======");
		
		Iterator<Member> iter = list.iterator();
		while(iter.hasNext()) {
			Member m = iter.next();
			m.showInfo();
		}
		
		
	}

}
