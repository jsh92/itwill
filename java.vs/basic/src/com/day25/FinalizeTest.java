package com.day25;

class MyName{
	private String objName;
	
	MyName(String objName){
		this.objName=objName;
	}
	
	//protected void finalize() throws Throwable
	public void finalize() throws Throwable{ //인스턴스가 소멸되기 직전에
											 //자바가상머신에 의해 자동으로 호출됨
		super.finalize();
		
		System.out.println(objName+" 인스턴스 소멸됨!");
	}
}

public class FinalizeTest {

	public static void main(String[] args) {
		MyName obj1 = new MyName("instance1");
		MyName obj2 = new MyName("instance2");
		
		//obj1 = null;  //instance1은 소멸 대상이 됨
		//obj2 = null;
		
		obj1 = obj2;  //instance1 이 소멸 대상 
		obj2 = null;  //
		obj1 = null;  //instance2 이 소멸 대상	
		System.out.println("\n프로그램 종료!!!");
		
		System.gc();
		System.runFinalization();
		//=> finalize 메서드의 완벽한 호출이 필요한 상황에서는 
		//위 두 메서드의 연이은 호출이 필요함
	}

}
