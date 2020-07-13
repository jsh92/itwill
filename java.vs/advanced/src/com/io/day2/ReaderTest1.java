package com.io.day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest1 {

	public static void main(String[] args) {
		//바이트 기반
		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream("text/test.txt");
			
			int data=0;
			while((data=fis.read())!=-1) {
				//System.out.print(data+" ");
				System.out.print((char)data);				
			}
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

		System.out.println("\n\n=======문자기반 =========");
		//문자기반, 파일에서 읽어오기
		FileReader fr = null;
		
		try {
			fr=new FileReader("text/test.txt");
			
			int data=0;
			while((data=fr.read())!=-1) {
				//System.out.print(data+" ");
				System.out.print((char)data);	
				//=> 한글이 깨지지 않는다
			}
			/*
			public int read() throws IOException
			- Reads a single character.
			*/
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
