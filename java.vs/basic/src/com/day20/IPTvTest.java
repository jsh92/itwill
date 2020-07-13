package com.day20;

class Tv{
	public void onTv() {
		System.out.println("TV영상 출력 중");
	}
}//

interface Computer{
	void dataReceive();
}//

//상속과 구현을 동시에 할 수 있다
class IPTv extends Tv implements Computer{
	public void dataReceive() {
		System.out.println("영상 데이터 수신 중");
	}
	
	public void powerOn() {
		dataReceive();
		onTv();
	}
}//

public class IPTvTest {
	public static void main(String[] args) {
		IPTv obj = new IPTv();
		obj.powerOn();
		
	}

}
