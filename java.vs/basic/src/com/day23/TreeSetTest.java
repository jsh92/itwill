package com.day23;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<Integer> tSet = new TreeSet<Integer>();
		
		tSet.add(10); //저장될때마다 데이터가 정렬됨
		tSet.add(2); 
		tSet.add(5); 
		tSet.add(99); 
		tSet.add(2); 
		
		System.out.println("요소의 개수 : " + tSet.size());
		
		Iterator<Integer> iter = tSet.iterator();
		while(iter.hasNext()) {
			int n = iter.next();
			System.out.println(n); 
		}
		
		TreeSet<String> tSet2 = new TreeSet<String>();
		
		tSet2.add("java");
		tSet2.add("한글");
		tSet2.add("abcdef");
		tSet2.add("가나다");
		tSet2.add("123");
		tSet2.add("ABC");
		tSet2.add("Oracle");
		tSet2.add("78");
		
		System.out.println("\n요소의 개수 : " + tSet2.size());
		
		Iterator<String> iter2 = tSet2.iterator();
		while(iter2.hasNext()) {
			String s = iter2.next();
			System.out.println(s);
		}
		
	}

}
