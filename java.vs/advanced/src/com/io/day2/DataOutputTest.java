package com.io.day2;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputTest {

	public static void main(String[] args) {

		/*
		• FileOutputStream 을 기반으로 하는 DataOutputStream 을 생성한 후,
		  DataOutputStream의 메서드들을 이용해서 sample.dat 파일에 값들을 출력
		• 출력한 값들은 이진데이터로 저장됨
		*/
		FileOutputStream fos=null;
		DataOutputStream dos=null;
		
		try {
			fos = new FileOutputStream("sample.dat");
			dos = new DataOutputStream(fos);
			dos.writeInt(10); //4byte
			dos.writeFloat(20.0f); //4byte
			dos.writeBoolean(true); //1byte
			dos.writeChar('A'); //2byte
			dos.writeUTF("hello"); //유니코드의 utf-8 형식으로 문자열을 출력하는 메서드
			
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
