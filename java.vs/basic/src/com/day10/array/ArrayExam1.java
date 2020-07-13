package com.day10.array;

public class ArrayExam1 {

	public static void main(String[] args) {
		double[] darr=new double[4];
		darr[0]=70.5;
		darr[1]=90;
		darr[2]=88.3;
		darr[3]=95.4;

		//double[] darr2= {90.6, 88.7, 76.3, 65.4};
		
		double sum=0;
		for (int i=0;i<darr.length ;i++ ){
			sum+=darr[i];
		}
		
		double avg=sum/darr.length;
		
		System.out.println("ÃÑÁ¡: " + sum + ", Æò±Õ: " + avg);
		System.out.println("ÃÑÁ¡: " + Math.round(sum*10)/10.0 
				+ ", Æò±Õ: " + Math.round(avg*10)/10.0);
		System.out.println("ÃÑÁ¡: " + (int)(sum*10)/10.0 
				+ ", Æò±Õ: " + (int)(avg*10)/10.0);

	}

}
