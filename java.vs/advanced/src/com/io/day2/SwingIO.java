package com.io.day2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SwingIO extends JFrame implements ActionListener {
	private JButton btByte, btChar;
	private JPanel pl;
	private JTextArea ta;
	private JScrollPane scrollPane;
	
	public SwingIO() {
		super("입출력");
		init();
		addEvent();
		
		setSize(500,500);
		setVisible(true);
		
	}
	private void addEvent() {
		btByte.addActionListener(this);
		btChar.addActionListener(this);
	}
	private void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btByte= new JButton("바이트기반");
		btChar= new JButton("문자기반");
		pl=new JPanel();
		pl.add(btByte);
		pl.add(btChar);
		
		ta = new JTextArea();
		scrollPane = new JScrollPane(ta);
		
		add(pl, "North");
		add(scrollPane, "Center");
	
	}
	public static void main(String[] args) {
		SwingIO f = new SwingIO();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btByte) {
			openByte();
		}else if(e.getSource()==btChar) {
			openChar();
		}
	}
	private void openChar() {
		//문자기반, 파일에서 읽어오기
		//버퍼 이용
		//=> FileReader, BufferedReader
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("text/poetry2.txt");
			br = new BufferedReader(fr);
			
			String line ="";
			while((line=br.readLine())!=null) {
				ta.append(line+"\n");
				
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}//
	
	private void openByte() {
		//바이트 기반, 파일에서 읽어오기
		//버퍼 이용
		//=> FileInputStream, BufferedInputStream
		
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		
		try {
			fis=new FileInputStream("text/poetry2.txt");
			bis = new BufferedInputStream(fis);
			
			int data=0;
			String str="";
			while((data=bis.read())!=-1) {
				str +=Character.toString((char)data);
			}
			ta.setText(str);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
