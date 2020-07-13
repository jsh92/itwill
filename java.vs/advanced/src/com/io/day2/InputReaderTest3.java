package com.io.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReaderTest3 {

	public static void main(String[] args) {
		// public InputStreamReader(InputStream in, String charsetName)

		InputStreamReader isr = null;
BufferedReader br=null;
		try {
			isr = new InputStreamReader(System.in);
			br=new BufferedReader(isr);
			System.out.println("현재 os에서 사용중인 인코딩:" + isr.getEncoding());
			System.out.println("문자 입력!!!");

			String data = "";
			while ((data = br.readLine()) != null) {
				System.out.println(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
