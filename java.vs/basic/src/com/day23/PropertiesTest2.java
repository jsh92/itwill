package com.day23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest2 {

	public static void main(String[] args) {
		Properties props = new Properties();
		
		try {
			//public void load(InputStream inStream) throws IOException
			//public FileInputStream(String name) throws FileNotFoundException
			props.load(new FileInputStream("text/input.txt"));
			//=> 파일로부터 데이터를 읽어서 Properties 컬렉션에 저장
			
			/*
			 	props.setProperty("name", "Hong gil dong");
				props.setProperty("data", "9,3,6,29,3,7,6,11");
			 */
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String name = props.getProperty("name");
		String data = props.getProperty("data");
		
		System.out.println("name => "+ name);
		System.out.println("data => "+ data);
		
	}

}
