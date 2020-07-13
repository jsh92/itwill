package com.swing.day1;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TableTest2 extends JFrame{
	JTable table;
	JScrollPane scrollPane;
	DefaultTableModel model;
	
	String[] colNames= {"번호","이름","주소"};
	String[][] data = {
			{"1", "홍길동", "서울"},
			{"2", "김길동", "인천"},
			{"3", "이길동", "경기"},
			{"4", "박길동", "대전"}
	};
	
	public TableTest2(){
		super("jTable 연습2");
		init();
		
		setSize(300, 300);
		setVisible(true);
	}
	
	private void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//model = new DefaultTableModel(data, colNames);
		model = new DefaultTableModel();
		model.setDataVector(data, colNames);
		
		table = new JTable();
		scrollPane = new JScrollPane(table);
		
		table.setModel(model);
		
		add(scrollPane);
	}

	public static void main(String[] args) {
		TableTest2 f = new TableTest2();
	}

}
