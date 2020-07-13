package com.day7;

public class ForExam5 {

	public static void main(String[] args) {
		int sum=0;
		for (int i=1;i<=20 ;i++ ){
			if (i%2!=0 && i%3!=0){
				sum+=i;
			}
		}//for
		
		System.out.println(sum+"\n");

		sum = 0;
		int totalSum = 0;
		for(int i=1; i <=10; i++) {
			sum += i;
			totalSum += sum;
			
			//System.out.println("i="+i+", sum="+sum);
		}
		
		System.out.println("totalSum="+totalSum+"\n");

		sum=0;
		for(int i=1; i <=10; i++) {
			for (int j=1;j<=i;j++ )	{			
				sum += j;
			}
		}
		
		System.out.println("sum="+sum+"\n");

		for(int i=1;i<=6;i++){
			for(int j=1;j<=6;j++){
				if(i+j==6)
					System.out.println(i+"+"+j+"="+(i+j));
			}
		}//for

	}
}
