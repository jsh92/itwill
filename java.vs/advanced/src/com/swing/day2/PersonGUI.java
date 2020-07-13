package com.swing.day2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.person.model.PersonDAO;
import com.person.model.PersonDTO;

public class PersonGUI extends JFrame implements ActionListener{
	private JPanel plN, plS;
	private JLabel lb1, lb2, lb3;
	private JTextField tfNo, tfName, tfTel;
	private JButton btAdd, btEdit, btDel, btSearch, btAll, btCancel;
	private JTable table;
	private JScrollPane scrollPane;
	private DefaultTableModel model;
	private PersonDAO dao;
	private String[] colNames = {"번호","이름","전화번호"};
	
	public PersonGUI() {
		super("전화번호 관리");
		init();
		addEvent();
		
		setSize(500, 600);
		setVisible(true);
		
		tfName.requestFocus();
	}
	
	private void addEvent() {
		btAdd.addActionListener(this);
		btAll.addActionListener(this);
		btCancel.addActionListener(this);
		btDel.addActionListener(this);
		btEdit.addActionListener(this);
		btSearch.addActionListener(this);
		
		table.addMouseListener(new EventHandler());
		
	}
	
	
	

	private void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		dao = new PersonDAO();
		
		plN = new JPanel();
		plS = new JPanel();
		
		lb1 = new JLabel("번호");
		lb2 = new JLabel("이름");
		lb3 = new JLabel("전화번호");
		
		tfName=new JTextField(10);
		tfNo=new JTextField(10);
		tfTel=new JTextField(10);
		tfNo.setEditable(false);
		
		plN.add(lb1);
		plN.add(tfNo);
		plN.add(lb2);
		plN.add(tfName);
		plN.add(lb3);
		plN.add(tfTel);
		
		add(plN, "North");
		
		btAdd = new JButton("등록");
		btAll = new JButton("전체조회");
		btCancel = new JButton("취소");
		btDel = new JButton("삭제");
		btEdit = new JButton("수정");
		btSearch = new JButton("검색");
		
		plS.add(btAdd);
		plS.add(btEdit);
		plS.add(btDel);
		plS.add(btSearch);
		plS.add(btAll);
		plS.add(btCancel);
		
		add(plS, "South");
		
		table = new JTable();
		scrollPane = new JScrollPane();
		model = new DefaultTableModel();
		
		model.addColumn("번호");
		model.addColumn("이름");
		model.addColumn("전화번호");
				
		table.setModel(model);
		
		table.getTableHeader().setBackground(Color.black);
		table.getTableHeader().setForeground(Color.yellow);
		table.getTableHeader().setReorderingAllowed(false);
		table.setRowHeight(30);
		
		scrollPane.setViewportView(table);
		
		add(scrollPane, "Center");
		
		//전체 조회
		try {
			showAll();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		
	}

	private void showAll() throws SQLException {
		//1. 		
		//2. db
		ArrayList<PersonDTO> list = dao.selectAll();
		
		//3.
		if(list==null || list.isEmpty()) {
			JOptionPane.showMessageDialog(this, "데이터가 존재하지 않습니다.");
			return;
		}
		
		String[][] data = new String[list.size()][3];
		
		for(int i=0;i<list.size();i++) {
			PersonDTO dto=list.get(i);
			
			data[i][0] = dto.getNo()+"";
			data[i][1] = dto.getName();
			data[i][2] = dto.getTel();			
		}
		
		model.setDataVector(data, colNames);
		table.setModel(model);
	}

	public static void main(String[] args) {
		PersonGUI f = new PersonGUI();
	}
	
	//inner class
	class EventHandler extends MouseAdapter{

		@Override
		public void mousePressed(MouseEvent e) {
			//talbe에서 특정 row를 클릭하면 해당 행의 데이터를 읽어온다
			int selRow =table.getSelectedRow();
			
			//Object javax.swing.JTable.getValueAt(int row, int column)
			Object objVal = table.getValueAt(selRow, 0);
			String sNo= (String)objVal;
			System.out.println("선택한 행의 no =" + sNo);
			int no  = Integer.parseInt(sNo);
			
			try {
				showByNo(no);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			
		}
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		try {		
			if(e.getSource()==btAdd) {
				//등록
				addPerson();
				clear_tf();
				showAll();
			}else if(e.getSource()==btEdit) {
				editPerson();
				clear_tf();
				showAll();
			}else if(e.getSource()==btDel) {
				deletePerson();
				clear_tf();
				showAll();
			}else if(e.getSource()==btSearch) {
				search();
			}else if(e.getSource()==btAll) {
				showAll();
			}else if(e.getSource()==btCancel) {
				
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

	private void search() throws SQLException {
		//이름으로 조회
		
		//1.
		String name =tfName.getText();
		if(name==null || name.isEmpty()) {
			JOptionPane.showMessageDialog(this, "이름을 입력하세요");
			tfName.requestFocus();
			return;
		}
		
		//2. db
		ArrayList<PersonDTO> list=dao.selectByName(name);
		
		//3.결과 처리
		if(list==null || list.isEmpty()) {
			JOptionPane.showMessageDialog(this, name + "에 해당하는 데이터가 존재하지 않습니다");
			return;
		}
		
		//Table에 넣기 위해서는 2차원을 만들어놔야한다
		String[][] data = new String[list.size()][3];
		
		for(int i=0;i<list.size();i++) {
			PersonDTO dto=list.get(i);
			data[i][0] = dto.getNo()+"";
			data[i][1] = dto.getName();
			data[i][2] = dto.getTel();
		}//for
		
		model.setDataVector(data, colNames);
		table.setModel(model);
		
	}

	private void deletePerson() throws NumberFormatException, SQLException {
		//1.
		String no = tfNo.getText();	
		
		if(no==null || no.isEmpty()) {
			JOptionPane.showMessageDialog(this,"번호를 입력하거나 클릭하세요");
			return;
		}
		
		//2.
		int cnt = dao.deletePerson(Integer.parseInt(no));
		
		//3.
		String result="";
		if(cnt>0) {
			result="삭제되었습니다";
		}else {
			result="삭제되었습니다";
			
		}
		JOptionPane.showMessageDialog(this,	result);
		
	}

	private void editPerson() throws SQLException {
		//1.
		String name=tfName.getText();
		String tel=tfTel.getText();
		String no=tfNo.getText();
		
		if(no==null || no.isEmpty()) {
			JOptionPane.showMessageDialog(this, "번호를 입력하세요");
			return;
		}
		
		if(name==null || name.isEmpty()) {
			JOptionPane.showMessageDialog(this, "이름을 입력하세요");
			tfName.requestFocus();
			return;
		}
		
		//2.
		PersonDTO  dto = new PersonDTO();
		dto.setNo(Integer.parseInt(no));
		dto.setName(name);
		dto.setTel(tel);
		int cnt = dao.updatePerson(dto);
		
		//3.
		String result="";
		if(cnt>0) {
			result="수정되었습니다";
		}else {
			result="수정 실패";
			
		}
		JOptionPane.showMessageDialog(this, result);
		
	}

	public void showByNo(int no) throws SQLException {
		//1.
		//2.db
		PersonDTO dto=dao.selectByNo(no);
		//3.결과 출력
		if(dto==null) {
			JOptionPane.showMessageDialog(this, no+"에 해당하는 데이터가 없습니다.");
			return;
		}
		
		tfName.setText(dto.getName());
		tfTel.setText(dto.getTel());
		tfNo.setText(Integer.toString(no));
		//tfNo.setText(String.valueOf(no));
		
		
	}

	private void clear_tf() {
		tfName.setText("");
		tfNo.setText("");
		tfTel.setText("");
	}

	private void addPerson() throws SQLException {
		//1
		String name=tfName.getText();
		String tel=tfTel.getText();
		
		//필수 항목인 경우 입력안한 경우 에러 처리
		if(name==null || name.isEmpty()) {
			JOptionPane.showMessageDialog(this, "이름은 반드시 입력해야 합니다!");
			tfName.requestFocus();
			return;
		}
		
		//2
		PersonDTO dto = new PersonDTO();
		dto.setName(name);
		dto.setTel(tel);
		
		int cnt=dao.insertPerson(dto);
		
		//3
		String result = "";
		if(cnt>0) {
			result="등록되었습니다.";
		}else {
			result="등록 실패!";
		}
		
		JOptionPane.showMessageDialog(this, result);
	}
	
	
}
