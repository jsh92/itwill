package com.day26;

enum OverTimeValues{
	//야근수당과 휴일 근무 수당 관련 열거형
	THREE_HOUR(18000),
	FIVE_HOUR(30000),
	WEEKEND_FOUR_HOUR(40000),
	WEEKEND_EIGHT_HOUR(60000);
	
	private final int amount;
	
	//생성자
	OverTimeValues(int amount){
		this.amount=amount;
	}
	
	public int getAmount() {
		return amount;
	}
}

public class EnumTest4 {

	public static void main(String[] args) {
		OverTimeValues overTime = OverTimeValues.FIVE_HOUR;
		System.out.println("5시간 야근 : " + overTime +", 야근 수당 : "
				+ overTime.getAmount() + "원");
		
		System.out.println("휴일 8시간 근무 : " 
				+ OverTimeValues.WEEKEND_EIGHT_HOUR
				+", 휴일 근무 수당 : " 
				+ OverTimeValues.WEEKEND_EIGHT_HOUR.getAmount()+"원");
		
	}

}
