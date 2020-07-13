package com.io.day2;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInTest {
	public static void main(String[] args) {
		FileInputStream fis=null;
		DataInputStream dis=null;
		
		try {
			fis=new FileInputStream("text/sample.dat");
			dis=new DataInputStream(fis);
			
			boolean bool = dis.readBoolean();
			System.out.println(bool);
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			String str=dis.readUTF();
			System.out.println(str);
			System.out.println(dis.readChar());
			
			/* 
			• DataOutputStream 의 write 메서드들로 기록한 데이터는
			DataInputStream의 read 메서드들로 읽는다
			• 여러 가지 종류의 자료형으로 출력한 경우, 읽을 때는 반드시 쓰인 순서대로 읽어야 한다.
			
			EOFException : End of File Exception
			 */
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	} 
}
