package com.day25;
/*
static import 문 사용
 - static 멤버를 호출할 때 클래스명을 생략할 수 있음
 - JDK 5.0 에 추가됨
*/
import static java.lang.System.out;
import static java.lang.Math.random;
import static java.lang.Math.PI;
//import static java.lang.Math.*;

public class StaticImportTest {

	public static void main(String[] args) {
		System.out.println(Math.random());
		out.println(random());
		
		System.out.println(Math.PI);
		out.println(PI);
		
	}

}
