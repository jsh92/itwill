package com.awt.day2;

import java.awt.Font;
import java.awt.GraphicsEnvironment;

public class FontList {

	public static void main(String[] args) {
		GraphicsEnvironment ge
			=GraphicsEnvironment.getLocalGraphicsEnvironment();
		Font[] fontArr=ge.getAllFonts();
		//=> 시스템에서 사용중인 폰트 리스트
		
		for(Font font : fontArr) {
			System.out.println(font.getFontName());
		}
		
	}

}


