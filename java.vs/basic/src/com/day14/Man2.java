package com.day14;

public class Man2 {
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int p_age) {
		if(p_age<0 || p_age >= 200) {  //잘못 들어온 값을 막을 수 있다.
			age = 0;
			System.out.println("\n유효하지 않은 나이입니다!");
		}else {
			age=p_age;
		}
	}
	
}
