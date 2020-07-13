package com.io.day2;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputReaderTest {

	public static void main(String[] args) {
		//InputStreamReader/inputstreamwReader
		//- 바이트 기반 스트림의 데이터를 지정된 인코딩의 문자 데이터로 변환하는 작업을 수행
		
		System.out.println("문자를 입력하세요");
		
		try {
			int data=0;
			while((data=System.in.read())!=-1) {
				System.out.println(data + "=> "+(char)data);
				//ctrl + z => console 창 멈추기
			}
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				System.in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	
	}

}
