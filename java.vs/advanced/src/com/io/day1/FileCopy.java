package com.io.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		// 파일에서 읽어서 파일에 출력, 바이트 기반
		//=> FileInputStream, FileOutputStream
		
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			fis=new FileInputStream("text/poetry2.txt");
			fos=new FileOutputStream("text/poetry2.bak", true);
			//public FileOutputStream(String name, boolean append)
			//=> true => 파일의 내용이 추가(append)됨
			
			int data=0;
			while((data=fis.read())!=-1) {
				fos.write(data);
				
				/*public void write(int b) throws IOException
				- Writes the specified byte to this file output stream.
				- byte 단위로 출력 */
			}
			System.out.println("파일에 출력 완료!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
