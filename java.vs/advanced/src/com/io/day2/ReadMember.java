package com.io.day2;

import java.awt.Frame;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Date;

public class ReadMember {

	public static void main(String[] args) throws ClassNotFoundException {
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try {
			fis=new FileInputStream("text/member.ser");
			ois=new ObjectInputStream(fis);
			
			//객체를 역직렬화할 때는 직렬화할 때의 순서와 일치해야 함
			Member mem=(Member) ois.readObject();
			Member mem2=(Member) ois.readObject();
			ArrayList<Member> list =(ArrayList<Member>) ois.readObject();
			Date date = (Date) ois.readObject();
			Frame f= (Frame) ois.readObject();
			
			mem.showInfo();
			mem2.showInfo();
			
			System.out.println("\n===list의 데이터=====");
			for(Member m : list) {
				m.showInfo();
			}
			
			System.out.println(date.toLocaleString());
			
			f.setSize(300, 200); 
			f.setVisible(true);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
