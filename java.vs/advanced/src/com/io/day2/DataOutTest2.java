package com.io.day2;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutTest2 {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		DataOutputStream dos=null;
		
		int[] arr= {99,80,75,96,73,100,91};
		try {
			fos = new FileOutputStream("text/score.dat");
			dos = new DataOutputStream(fos);
			
			for(int i=0;i<arr.length;i++) {
				dos.writeInt(arr[i]);
				
			}//for
			System.out.println("file 저장 완료");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
