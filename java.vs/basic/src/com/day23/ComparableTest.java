package com.day23;

import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public String toString() {
		return "Person[name="+name+", age="+ age +"]";
	}
	
	public int compareTo(Person p) {
		//나이를 기준으로 정렬되도록 오버라이딩
		if(this.age > p.age) {
			return 1;  //양수를 리턴
		}else if(this.age< p.age) {
			return -1;	//음수 리턴
		}else {
			return 0;	//0 리턴
		}
	}
}//

public class ComparableTest {

	public static void main(String[] args) {
		TreeSet<Person> tSet = new TreeSet<Person>();
		
		tSet.add(new Person("홍길동", 20));//Person 인스턴스가 TreeSet<E>에 
										//저장될 때, 나이를 기준으로 정렬됨
		tSet.add(new Person("김길동", 15));
		tSet.add(new Person("이길동", 7));
		
		Iterator<Person> iter = tSet.iterator();
		while(iter.hasNext()) {
			Person p = iter.next();
			System.out.println(p);
		}		
		/*	
		 Person 인스턴스의 크고 작음을 비교할 수 있게 됨
		 TreeSet<E> 는  Person인스턴스가 저장될 때마다  
		 기존에 저장된 인스턴스와의 비교를 위해서 compareTo() 메서드를  빈번히 호출하여, 
		 이때 반환되는 값을 기반으로 정렬을 진행
	 	*/
		
		//TreeSet<E>에 저장되는 인스턴스는 반드시 Comparable<T> 인터페이스를 
		//구현하고 있어야 함
	}

}
