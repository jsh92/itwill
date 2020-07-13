package com.test2;

import com.test1.Parent;

public class Child extends Parent{
	public Child(){
		name="자식";
		age=20;
		address = "서초동";
		//nickName="별명"; //error: private
		//number=10; //error: default
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address + "\n");
	}
}
