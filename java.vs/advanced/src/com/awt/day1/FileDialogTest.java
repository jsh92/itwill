package com.awt.day1;

import java.awt.FileDialog;
import java.awt.Frame;

public class FileDialogTest {

	public static void main(String[] args) {
		Frame f = new Frame("파일 열기 연습");
		f.setSize(400, 400);
		f.setVisible(true);
		
		FileDialog fd = new FileDialog(f, "파일 열기", FileDialog.LOAD);
		//FileDialog fd = new FileDialog(f, "파일 저장", FileDialog.SAVE);
		fd.setDirectory("d:\\lecture");
		fd.setVisible(true);
		
		//파일을 선택한 다음, FileDialog의 열기버튼을 누르면,
		// getFile()과 getDirectory()를 이용해서 파일이름과 위치한 디렉토리를 
		//얻을 수 있다.
		System.out.println("선택한 dir : " +  fd.getDirectory());
		System.out.println("선택한 file : " +  fd.getFile());
		System.out.println(fd.getDirectory()+fd.getFile());
		//취소를 누르면  null을 리턴
	}

}
