package com.io.day2;

import java.awt.Frame;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class WriteMember { //객체를 직렬화 - 객체를 파일로 저장

	public static void main(String[] args) {
		//생성한 객체를 직렬화하여 파일 (member.ser)에 저장하는 예제
		
		FileOutputStream fos = null;
		ObjectOutputStream oos=null;
		
		try {
			fos=new FileOutputStream("text/member.ser");
			oos=new ObjectOutputStream(fos);
			
			Member m1=new Member("hong", "1234", 25);
			Member m2=new Member("kim", "5678", 20);
			ArrayList<Member> list = new ArrayList<Member>();
			list.add(m1);
			list.add(m2);
			
			Date d = new Date();
			Frame f = new Frame("프레임");
			
			oos.writeObject(m1);
			oos.writeObject(m2);
			oos.writeObject(list);
			oos.writeObject(d);
			oos.writeObject(f);
			
			System.out.println("직렬화 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}

