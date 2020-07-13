package com.io.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOTest1 {

	public static void main(String[] args) {
		//바이트 기반, 파일로부터 읽어오기
		
		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream("text/poetry2.txt");
			
			int data=0;
			while((data=fis.read())!=-1) {
				//System.out.print(data +" ");
				System.out.print((char)data);
				//=> 한글은 깨짐 
				/* public void print(char c)
					- Prints a character. 
					- char 단위로 출력 */
			}
			/*
			public int read() throws IOException
			- Reads a byte of data from this input stream.
			- inpuStream에서 1바이트씩 읽어온다
			- 아스키코드를 리턴함
			- 더 이상 읽어올 것이 없으면 -1을 리턴함 */ 

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
