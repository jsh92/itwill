package com.io.day2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInTest {

	public static void main(String[] args) {
		//파일에서 바이트 단위로 읽어온다
		//버퍼 이용
		//=> FileInputStream, BufferedInputStream
		
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		
		try {
			fis=new FileInputStream("text/poetry2.txt");
			bis=new BufferedInputStream(fis, 1024);
			//=> 버퍼 사이즈 생략하면 2048
			
			int data=0;
			while((data=bis.read())!=-1) {
				System.out.print((char)data);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bis.close(); //bis만  close()해도 기반 스트림도  close()됨
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}




