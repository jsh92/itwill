package com.day23;

import java.util.TreeSet;

public class HeadSetTest {

	public static void main(String[] args) {
		int[] arr = {85, 95, 50, 35, 45, 65, 10, 100};
		
		TreeSet<Integer> tset = new TreeSet<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			tset.add(arr[i]);
		}//for
		
		System.out.println(tset);
		
		System.out.println("50보다 작은 요소 : "+tset.headSet(50));
		System.out.println("50보다 크거나 같은 요소 : "+tset.tailSet(50));
		System.out.println("범위 검색(65 <= x < 95) : "
				+ tset.subSet(65, 95));
		
	}

}
