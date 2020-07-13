package com.day16;

class Data{
	int x;
}//class

public class ParameterTest {

	public static void main(String[] args) {
		//1.
		Data d = new Data();
		d.x=10;
		System.out.println("main() - d.x = " + d.x); //10
		
		change1(d.x);
		System.out.println("change1 메서드 호출 후 main() - d.x = " 
				+ d.x+"\n"); //10
				
		//2.
		Data d2=new Data(); 
		d2.x=20;
		System.out.println("main() - d2.x = " + d2.x); //20
		
		change2(d2);
		System.out.println("change2 메서드 호출 후 main() - d2.x = "
				+ d2.x); //2000
		
		int[] arr=new int[3];
		arr[0]=30;
		arr[1]=31;
		arr[2]=32;
		
		System.out.println("\nmain() - arr[0] = " + arr[0]);//30
		
		change3(new int[3]);
		System.out.println("change3 메서드 호출 후 main() - arr[0] = "
				+ arr[0]); //3000
	}

	public static void change1(int a) { 
		//기본형 매개변수, call by value
		/* 기본형 매개변수 - 변수의 값을 읽기만 할 수 있다. (read only)		 
		  			   - 메서드에서 매개변수의 값을 변경해도
		  			         호출한 곳에서는 변경의 영향을 받지 않는다	
		 */
		 
		a=1000;
		
		System.out.println("change1() 메서드에서 a="+a); //1000
	}
	
	public static void change2(Data data) {
		/* 참조형 매개변수 - 변수의 값을 읽고 변경할 수 있다.(read & write)
		   - call by reference
		   - 메서드에서 매개변수의 값을 변경하면 호출한 곳에서도 변경의
		   	  영향을 받는다
		*/ 
		data.x = 2000;
		
		System.out.println("change2() 메서드에서 data.x = " + data.x);	//2000	
	}
	
	public static void change3(int[] arr) {
		//참조형 매개변수
		arr[0] = 3000;
		
		System.out.println("change3()메서드에서 arr[0]=" + arr[0]);
		//3000
	}
	
}



