package com.io.day2;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputReaderTest2 {

	public static void main(String[] args) {
		// public InputStreamReader(InputStream in, String charsetName)

		InputStreamReader isr = null;

		try {
			isr = new InputStreamReader(System.in);
			System.out.println("현재 os에서 사용중인 인코딩:" + isr.getEncoding());
			System.out.println("문자 입력!!!");

			int data = 0;
			while ((data = isr.read()) != -1) {
				System.out.println(data + " => " + (char) data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
