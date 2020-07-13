package com.io.day2;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutTest {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		
		try {
			fos=new FileOutputStream("text/123.txt");
			bos=new BufferedOutputStream(fos, 5); //버퍼 크기를 5로 지정
			
			for(int i='1';i<='9';i++) {
				bos.write(i);
			}
			System.out.println("파일에 출력 완료됨!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				//fos.close();
				/*크기가 5인 BufferedOutputStream 을 이용해서 파일 123.txt에 
				  1~9까지 출력하는 예제
				   결과 : 5까지만 출력
				 <= 버퍼에 남아있는 데이터가 출력되지 못한 상태로 프로그램이 종료되었기 때문 
				 */
				bos.close();
				//bos.close() 를 호출해서 BufferedOutputStream 의 close()를
				//호출해주어 버퍼에 남아있던 모든 내용이 출력됨
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
