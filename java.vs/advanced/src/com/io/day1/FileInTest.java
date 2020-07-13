package com.io.day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInTest {

	public static void main(String[] args) {
		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream("text/poetry2.txt");
			
			int count=0, data=0;
			while((data=fis.read())!=-1) {
				System.out.print((char)data);
				
				count++;
			}
			System.out.println("\n\n반복횟수:"+ count);
			
			File file = new File("text/poetry2.txt");
			long len=file.length();
			System.out.println("파일의 크기:"+ len+"byte");
			
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
