package com.io.day2;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		File f = new File("text/test.txt");
		
		String fileName = f.getName();
		int pos = fileName.lastIndexOf(".");
		System.out.println("경로를 제외한 파일이름 - " + f.getName());
		System.out.println("확장자를 제외한 파일이름 - " + fileName.substring(0,pos));
		System.out.println("확장자 - " + fileName.substring(pos+1));
		System.out.println("경로를 포함한 파일이름 - " + f.getPath());
		System.out.println("파일의 절대경로 - " + f.getAbsolutePath());
		System.out.println("파일이 속해 있는 디렉토리 - " + f.getParent());
		System.out.println();
		System.out.println("File.pathSeparator - " + File.pathSeparator);
		System.out.println("File.pathSeparatorChar - " + File.pathSeparatorChar);
		System.out.println("File.separator - " + File.separator);
		System.out.println("File.separatorChar - " + File.separatorChar);
		System.out.println();
		System.out.println("user.dir="+System.getProperty("user.dir"));
		System.out.println("sun.boot.class.path=" + System.getProperty("sun.boot.class.path"));

		File file2 = new File("d:\\lecture","abt.txt");
		
		try {
			boolean bool = file2.createNewFile();
			System.out.println("파일 생성 여부 : "+ bool);
			
			if(file2.exists()) {
				System.out.println("파일이 생성됨!");
			}
				
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
	}

}
