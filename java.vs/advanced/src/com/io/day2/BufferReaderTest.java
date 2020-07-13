package com.io.day2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderTest {

	public static void main(String[] args) {
		
		FileReader fr= null;
		BufferedReader br=null;
		
		
		try {
			fr = new FileReader("text/FileCopy2.java");
			br = new BufferedReader(fr);
			
			String line="";
			while((line=br.readLine())!=null) {//엔터를 기준으로 한 줄 값을 가져옴
				if(line.indexOf(";")!=-1)
				System.out.println(line);
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
