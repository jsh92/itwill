package com.swing.day1;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableTest1 extends JFrame{
	JTable table;
	JScrollPane scrollPane;
	String[] colNames= {"번호","이름","주소"};
	String[][] data = {
			{"1", "홍길동", "서울"},
			{"2", "김길동", "인천"},
			{"3", "이길동", "경기"},
			{"4", "박길동", "대전"}
	};
	
	public TableTest1(){
		super("jTable 연습1");
		
		init();
		
		setSize(300, 300);
		setVisible(true);
	}
	
	private void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		table = new JTable(data, colNames);
		//public JTable(Object[][] rowData, Object[] columnNames)

		scrollPane = new JScrollPane(table);
		
		add(scrollPane);
	}

	public static void main(String[] args) {
		TableTest1 f = new TableTest1();
	}

}
