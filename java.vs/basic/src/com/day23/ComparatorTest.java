package com.day23;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class StrLenComparator implements Comparator<String>{
	
	public int compare(String s1, String s2) {
		if(s1.length() > s2.length()) {
			return 1;
		}else if(s1.length() < s2.length()) {
			return -1;
		}else {
			return 0;
		}
		
		//return s1.length() - s2.length();
	}
}//

public class ComparatorTest {

	public static void main(String[] args) {
		TreeSet<String> tset = new TreeSet<String>();
		
		tset.add("orange");
		tset.add("dog");
		tset.add("individual");
		tset.add("apple");
		
		//기본 정렬 순서대로 처리 - 유니코드 순
		Iterator<String> iter = tset.iterator();
		while(iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}
		
		//새로운 정렬 순서로 정렬
		System.out.println("\n=====문자열의 길이순으로 정렬=======");
		//public TreeSet(Comparator<? super E> comparator)
		TreeSet<String> tset2 
			= new TreeSet<String>(new StrLenComparator());
		
		tset2.add("orange");
		tset2.add("dog");
		tset2.add("individual");
		tset2.add("apple");
		
		Iterator<String> iter2 = tset2.iterator();
		while(iter2.hasNext()) {
			String s=iter2.next();
			System.out.println(s);
		}
				
	}

}
