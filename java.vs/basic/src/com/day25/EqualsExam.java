package com.day25;

class Test2{
	private int value;
	
	Test2(int value){
		this.value=value;
	}
	
	public boolean equals(Object obj) {
		if(obj !=null && obj instanceof Test2) {
			return this.value == ((Test2)obj).value;
		}else {
			return false;
		}
	}
}//

public class EqualsExam {

	public static void main(String[] args) {
		Test2 t = new Test2(100);
		Test2 t2 = new Test2(100);
		
		if(t.equals(t2)) { 
			System.out.println("t와 t2는 같다");
		}else {
			System.out.println("t와 t2는 다르다");
		}
		
		if(t == t2) {
			System.out.println("t와 t2의 주소는 같다");
		}else {
			System.out.println("t와 t2의 주소는 다르다");
		}
		
	}

}
