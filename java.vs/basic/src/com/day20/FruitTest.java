package com.day20;

//과일 판매자
class FruitSeller{
	private int numOfApple; //보유하고 있는 사과 개수 30=>27, 20=>18
	private int myMoney;	//판매 수익 0=>4500, 0=>2000
	public final int PRICE_OF_APPLE; //개당 사과 가격 1500, 1000
	
	FruitSeller(int numOfApple, int price){
		this.numOfApple=numOfApple;
		PRICE_OF_APPLE = price;
	}
	
	public int[] saleFruit(int money) {  //3500
		int num = money/PRICE_OF_APPLE;  //3, 2
		//=> 2
		//거스름돈을 구한다
		int change = money%PRICE_OF_APPLE; //500
		
		numOfApple -= num;  //사과 개수는 줄고		
		myMoney += (money-change);  //판매수익은 늘어남
		
		//사과개수와 거스름돈을 담을 배열을 선언한다
		int[] arr = new int[2];
		
		//거스름돈과 사과개수를 배열의 각 요소에 넣는다
		arr[0] = num;
		arr[1] = change;
		
		//배열을 리턴한다
		return arr;
	}
	
	public void showInfo() {
		System.out.println("남은 사과 개수 : " + numOfApple);
		System.out.println("판매 수익 : " + myMoney+"\n");
	}
}//class

class FruitBuyer{  //과일 구매자
	private int myMoney;  //보유 자산  10000=> 5500 => 3500
	private int numOfApple; //구매한 사과 개수 0=>3=>5
	
	FruitBuyer(int myMoney){
		this.myMoney = myMoney;		
	}
	
	//과일을 구매하는 메서드
	public void buyFruit(FruitSeller seller, int money) {
		if(myMoney < money) {
			System.out.println("잔액이 부족하여 구매할 수 없습니다.");
			return;
		}
		
		int[] arr=seller.saleFruit(money);  //3, 2
		int num = arr[0];
		int change = arr[1];
		
		numOfApple += num;
		myMoney -= (money-change);
	}
	
	public void showInfo() {
		System.out.println("구매한 사과 개수 : " + numOfApple);
		System.out.println("남은 보유 자산 : " + myMoney+"\n");
	}
}//class

public class FruitTest {

	public static void main(String[] args) {
		//과일장사1 : 30개 사과 보유, 개당 1500원
		FruitSeller seller1 = new FruitSeller(30, 1500);
		
		//과일장사2 : 20개 사과 보유, 개당 1000원
		FruitSeller seller2 = new FruitSeller(20, 1000);
		
		//구매자 : 보유자산 10000원
		FruitBuyer buyer = new FruitBuyer(10000);
		
		//구매자가 과일장사1에게 4500원만큼의 사과 구매
		buyer.buyFruit(seller1, 4500);
		
		//구매자가 과일장사2에게 2000원만큼의 사과 구매
		buyer.buyFruit(seller2, 2000);
		
		//과일장사1의 현재 상태 출력
		seller1.showInfo();
		
		//과일장사2의 현재 상태
		seller2.showInfo();
		
		//구매자의 현재 상태
		buyer.showInfo();
		
		//구매자가 과일장사2에게 4000원 만큼 구매하기
		buyer.buyFruit(seller2, 4000);
		buyer.showInfo();
		
		//구매자가 과일장사1에게 3500원 만큼 구매하기
		//(2000원 만큼 구매하기)
		buyer.buyFruit(seller1, 3500);
		buyer.showInfo();
		
	}

}
