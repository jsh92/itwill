package com.day16;

import com.test2.Child;

public class ProtectedTest {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.showInfo();
		
		ch.address = "³íÇöµ¿";
		ch.showInfo();
		
		//ch.name=""; //error : protected
		//ch.age=10; //error : protected
		//ch.number=100; //error : default
		//ch.nickName=""; //error : private
		
	}

}
