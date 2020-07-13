package com.io.day2;

import java.io.File;

public class FileTest3 {

	public static void main(String[] args) {
		File file = new File("text/score.dat");
		
		System.out.println("파일명 - "+file.getName());
		System.out.println("절대경로 - "+file.getAbsolutePath());
		System.out.println("파일 크기 - "+file.length()+"byte");
		
		File file2 = new File("text","test.txt");
		File file3 = new File("text\\123.txt");
		
		System.out.println("test.txt 파일 존재여부 : "+file2.exists());
		System.out.println("123.txt 읽기 가능? : "+file3.canRead());
		System.out.println("123.txt 쓰기 가능? : "+file3.canWrite());
		
		System.out.println("file인지 여부: "+file2.isFile());
		System.out.println("dir 인지 여부: "+file2.isDirectory());
		
		File file4 = new File("rain");
		file4.mkdir(); //디렉토리 생성
		
		File file5 = new File("sun","moon");
		file5.mkdirs();
		//=> sun디렉토리 생성하고, 그 아래에 하위 디렉토리 moon 생성
		
		
		boolean bool=file4.renameTo(new File("star")); 
		//=>rain을  star로 이름 변경
		System.out.println("이름 변경 여부 : "+ bool);
		
		bool = file5.delete(); //디렉토리 삭제시 비어있어야 함
		System.out.println("삭제 여부:"+ bool); //moon 이 삭제됨
		
	}

}
