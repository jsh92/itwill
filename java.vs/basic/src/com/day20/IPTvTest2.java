package com.day20;

interface Tv2{
	public void onTv();
}//

interface Computer2{
	void dataReceive();
}//

//인터페이스는 다중 상속이 가능함
class IPTv2 implements Tv2, Computer2{
	public void dataReceive() {
		System.out.println("영상 데이터 수신 중");
	}
	
	public void onTv() {
		System.out.println("Tv 영상 출력 중");
	}
	
	public void powerOn() {
		dataReceive();
		onTv();
	}
}//

public class IPTvTest2 {
	public static void main(String[] args) {
		IPTv2 obj = new IPTv2();
		obj.powerOn();
		
	}

}
