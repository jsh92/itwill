package com.day23;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<Member> vec = new Vector<Member>(5);
		
		vec.add(new Member("hong", 23));
		vec.add(new Member("kang", 24));
		vec.add(new Member("jung", 25));
		
		for(int i=0;i<vec.size();i++) {
			Member m = vec.get(i);
			m.showInfo();
		}

		System.out.println("\n===== Enumeration ÀÌ¿כ =======");
		Enumeration<Member> en = vec.elements();
		while(en.hasMoreElements()) {
			Member m = en.nextElement();
			
			System.out.println(m);
		}
		
	}

}
