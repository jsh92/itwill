package com.day8;

public class LabelFor {

	public static void main(String[] args) {
		/*
		 �̸� ���� �ݺ���
		 - ���� �ݺ����� ��ø�Ǿ� ���� �� �ݺ��� �տ� �̸� (Label) �� ���̰� 
		 break ���� continue���� �̸� (Label)�� ������ �����ν� 
		 �ϳ� �̻��� �ݺ����� ����ų� �ݺ��� �ǳ� �� �� �ִ� 
		*/
		
		Loop1: for(int i=2;i<=9;i++) {
					for(int j=1;j<=9;j++) {
						if(j==5) {
							//break Loop1;
							//continue Loop1;
							//break;
							continue;							
						}
						
						System.out.println(i + " * " + j + " = " + i*j);
					}//����  for
					
					System.out.println();
		}//�ٱ� for
		
	
	}

}