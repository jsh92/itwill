package com.awt.day1;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;

public class ListTest {

	public static void main(String[] args) {
		Frame f = new Frame("List");
		f.setLayout(new FlowLayout());
		
		List list1 = new List(5);
		list1.add("java");
		list1.add("jsp");
		list1.add("oracle");
		list1.add("html");
		list1.add("jquery");
		list1.add("spring");
		
		List list2 = new List(3, true); //다중선택 가능
		list2.add("딸기");
		list2.add("자두");
		list2.add("오렌지");
		
		List list3 = new List(); //default=>4
		list3.add("컴퓨터");
		list3.add("노트북");
		list3.add("모니터");
		list3.add("키보드");
		list3.add("마우스");
		
		f.add(list1);
		f.add(list2);
		f.add(list3);
		
		f.setSize(300, 400);
		f.setVisible(true);
		
	}

}
