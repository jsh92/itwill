package com.io.day2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputStreamTEST {

	public static void main(String[] args) {
		BufferedInputStream bis = null;
		FileInputStream fis = null;
		BufferedOutputStream bos = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("text/poetry3.txt");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("text/poetry3_bak.txt");
			bos = new BufferedOutputStream(fos);

			int data = 0;
			while ((data = bis.read()) != -1) {
				bos.write(data);
			}
			System.out.println("파일에 출력 완료됨!");

			File file = new File("C:\\Program Files\\Java\\jdk1.8.0_241");

			File[] fileArr = file.listFiles();

			for (int i = 0; i < fileArr.length; i++) {
				String fName = fileArr[i].getName();
				String str = "";
				if (fileArr[i].isDirectory()) {
					str = fName + " DIR";
				} else {
					if (fName.endsWith(".txt")) {
						str = fName + fileArr[i].length() + "byte";
					} else if (fName.endsWith("java")) {
						str = fName + fileArr[i].length() + "JAVA";
					}

				}
				System.out.println(str);
			} // for

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
