package com.day8;

public class ContinueTest1 {

	public static void main(String[] args) {
		/*
		 break - switch�� �ݺ��������� ��� ����
		 		 �ش� ������ ��� �� ���
		 continue - �ݺ��������� ��� ����
		 		        ���� �ݺ� ��ġ�� �̵�
		 		        �� �� �ǳʶ۶� ���    
		 return - �޼��忡�� ���  
		 		    �޼����� ������ �����ϰ� ȣ������� ����
		 */
		
		System.out.println("========break �̿�=========");
		for(int i=0;i<10;i++) {
			if(i==5) break;
			
			System.out.println("i="+i); //0 1 2 3 4 
		}//for
		
		System.out.println("\n======continue �̿�======");
		for(int i=0;i<10;i++){
			if(i==5) continue;
			
			System.out.println("i=" + i); //0 1 2 3 4 6 7 8 9
		}//for
		
	}
}





