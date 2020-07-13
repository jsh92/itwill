package com.day20;

abstract class Player{
	protected int curPos;
	protected boolean isPaused;
	
	Player(){  //추상 클래스도 생성자 사용 가능
		curPos=0;
		isPaused=false;
	}
	
	//지정된 위치에서 재생을 시작하는 기능
	public abstract void play(int pos);
	public abstract void stop();  //재생을 멈추는 기능
	
	public void play() {
		play(curPos);  //추상 메서드 호출 가능
	}
	
	public void paused() {
		if(isPaused) {  //일시정지 상태인 경우
			isPaused = false;
			play();
		}else {  //재생 상태인 경우
			isPaused = true;
			stop();
		}
	}
}//class

class CDPlayer extends Player{
	private int currentTrack;  //현재 재생중인 트랙
	
	//추상 메서드 오버라이딩
	public void play(int pos) {
		System.out.println(pos +"위치에서 CD 플레이어 재생을 시작합니다.");
	}
	
	public void stop() {
		System.out.println("현재 위치에서 CD 플레이어의 재생을 멈춥니다.");
	}
	
	public void nextTrack() {
		currentTrack++;
		
		System.out.println("nextTrack 후 현재 트랙 : " +  currentTrack);		
	}
	
	public void prevTrack() {
		if(currentTrack > 1) {
			currentTrack--;
		}else {
			System.out.println("더 이상 앞으로 갈 수 없습니다.");
		}
		
		System.out.println("prevTrack 후 현재 트랙 : " +  currentTrack);
	}
}

public class PlayerTest {

	public static void main(String[] args) {
		CDPlayer cd = new CDPlayer();
		cd.play(10);
		cd.paused();
		cd.paused();
		cd.stop();
		
		cd.nextTrack();
		cd.prevTrack();
	}

}
