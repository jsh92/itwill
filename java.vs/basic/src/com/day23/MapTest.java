package com.day23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>(5);
		
		map.put(3, "홍길동");
		map.put(7, "김길동");
		map.put(12, "이길동");
		
		//public V get(Object key)
		String name = map.get(3); //key가 3인 데이터 읽어오기
		System.out.println("key가 3인 데이터 : " + name);
		System.out.println("7번 학생이름 : " + map.get(7));
		System.out.println("12번 학생이름 : " + map.get(12)+"\n");
		
		//public V remove(Object key)
		map.remove(7);  //key가 7인 데이터 제거(삭제)
		System.out.println("삭제 후 map요소의 개수 : "+map.size());
		
		//Iterator 이용
		System.out.println("\n======key Iterator 이용======");
		//public Set<K> keySet()
		
		//Set<Integer> set = map.keySet();
		//Iterator<Integer> iter = set.iterator();
		
		Iterator<Integer> iter = map.keySet().iterator();		
		while(iter.hasNext()) {
			int key = iter.next();
			String val = map.get(key);
			
			System.out.println("key="+ key+", value="+ val);
		}
		
	}

}
