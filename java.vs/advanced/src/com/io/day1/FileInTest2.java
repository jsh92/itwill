package com.io.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInTest2 {

	public static void main(String[] args) {
		//파일에서 읽어서 파일에 출력
		//배열 이용
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			fis=new FileInputStream("text/poetry4.txt");
			fos=new FileOutputStream("text/poetry4.bak");
			
			int cnt=0, total=0, count=0;
			byte[] buf = new byte[1024];
			
			/*
			 public int read(byte[] b) throws IOException
				- Reads up to b.length bytes of data from this 
				inputstream into an array of bytes. 
				-InputStream에서 읽어서 byte배열에 넣는다(byte배열의 길이만큼)
			 	-읽어온 개수를 리턴함 
			  */
			while((cnt=fis.read(buf))!=-1) {
				fos.write(buf, 0, cnt);
				//=> buf 배열에서 0부터 cnt개 읽어서 출력소스에 쓴다
				System.out.write(buf, 0, cnt);
				/*				 
				public void write(byte[] buf, int off, int len)				
				- Writes len bytes from the specified byte array 
				   starting at offset off to this stream.
				- byte배열에서 시작위치 off에서 len개 만큼 OutputStream에 출력   
				  */
				
				System.out.println("\n\n=============cnt : "+ cnt);
				total+=cnt;
				count++;
			}
			
			
			System.out.println("\n반복횟수 : " + count+", total="+total);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}



