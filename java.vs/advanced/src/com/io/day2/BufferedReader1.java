package com.io.day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReader1 {

	public static void main(String[] args) {
		FileReader fr= null;
		BufferedReader br=null;
		FileWriter fw = null;
		BufferedWriter bw=null;
		
		try {
			fr= new FileReader("text/poetry.txt");
			br=new BufferedReader(fr);
			
			fw = new FileWriter("text/poetry_bak.txt");
			bw= new BufferedWriter(fw);
			
			String line="";
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
