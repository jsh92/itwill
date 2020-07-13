package com.day23;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest2 {

	public static void main(String[] args) {
		//로또 
		TreeSet<Integer> tSet = new TreeSet<Integer>();
		
		while(tSet.size()<6) {
			int rnd = (int)(Math.random()*45+1); //1~45
			
			tSet.add(rnd);  //중복되지 않고, 정렬되어 들어감
		}
		
		Iterator<Integer> iter = tSet.iterator();
		while(iter.hasNext()) {
			int n = iter.next();
			System.out.print(n+" ");
		}//while
		
	}

}
