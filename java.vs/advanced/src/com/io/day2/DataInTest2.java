package com.io.day2;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInTest2 {

	public static void main(String[] args) {
		FileInputStream fis= null;
		DataInputStream dis=null;
		int sum=0;
		try {
			fis = new FileInputStream("text/score.dat");
			dis = new DataInputStream(fis);
			
			while(true) {
				sum += dis.readInt();
			}
			/*
			• score.dat 파일을 읽어서 데이터의 총합을 구하는 예제
			• DataInputStream의 readInt() 와 같이 데이터를 읽는 메서드는
			더 이상 읽을 데이터가 없으면 EOFException 을 발생시킴 
			*/
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(EOFException e) {
			System.out.println("총합: "+sum);
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
