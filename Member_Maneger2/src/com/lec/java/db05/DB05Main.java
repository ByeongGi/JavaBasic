package com.lec.java.db05;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class DB05Main {

	private JFrame frame;
	private JTextField text_Id;
	private JTextField text_Pw;
	private JTextField text_Email;
	private JTable table_Output;
	private JTextArea text_Output;
	private MemberControl memberMgr;
	private DefaultTableModel tblmodel= new DefaultTableModel(); 
	private int rowSelected= -1;
	private int colSelected= -1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DB05Main window = new DB05Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DB05Main() {
		memberMgr= MemberControl.getInstance();
		initialize();
		selectAllData();
		System.out.println("GUI가 작동되었습니다.");
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 951, 616);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lb_Title = new JLabel("멤버 관리 프로그램");
		lb_Title.setBackground(new Color(192, 192, 192));
		lb_Title.setHorizontalAlignment(SwingConstants.CENTER);
		lb_Title.setFont(new Font("나눔고딕", Font.BOLD, 26));
		lb_Title.setBounds(0, 0, 924, 67);
		frame.getContentPane().add(lb_Title);
		
		JLabel label_Id = new JLabel("I D");
		label_Id.setHorizontalAlignment(SwingConstants.CENTER);
		label_Id.setFont(new Font("나눔고딕", Font.BOLD, 21));
		label_Id.setBounds(10, 77, 118, 52);
		frame.getContentPane().add(label_Id);
		
		JLabel label_Pw = new JLabel("PASSWORD");
		label_Pw.setHorizontalAlignment(SwingConstants.CENTER);
		label_Pw.setFont(new Font("나눔고딕", Font.BOLD, 21));
		label_Pw.setBounds(20, 139, 118, 52);
		frame.getContentPane().add(label_Pw);
		
		JLabel label_Email = new JLabel("EMAIL");
		label_Email.setHorizontalAlignment(SwingConstants.CENTER);
		label_Email.setFont(new Font("나눔고딕", Font.BOLD, 21));
		label_Email.setBounds(10, 203, 118, 52);
		frame.getContentPane().add(label_Email);
		
		text_Id = new JTextField();
		text_Id.setFont(new Font("굴림", Font.PLAIN, 18));
		text_Id.setBounds(145, 79, 247, 50);
		frame.getContentPane().add(text_Id);
		text_Id.setColumns(10);
		
		text_Pw = new JTextField();
		text_Pw.setFont(new Font("굴림", Font.PLAIN, 18));
		text_Pw.setColumns(10);
		text_Pw.setBounds(145, 144, 247, 50);
		frame.getContentPane().add(text_Pw);
		
		text_Email = new JTextField();
		text_Email.setFont(new Font("굴림", Font.PLAIN, 18));
		text_Email.setColumns(10);
		text_Email.setBounds(145, 208, 247, 50);
		frame.getContentPane().add(text_Email);
		
		JButton btn_Select = new JButton("SELECT");
		btn_Select.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		btn_Select.setFont(new Font("굴림", Font.BOLD, 18));
		btn_Select.setBounds(20, 265, 118, 50);
		frame.getContentPane().add(btn_Select);
		
		JButton btn_Update = new JButton("UPDATE");
		btn_Update.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				updateData();
			}
		});
		btn_Update.setFont(new Font("굴림", Font.BOLD, 18));
		btn_Update.setBounds(145, 325, 118, 50);
		frame.getContentPane().add(btn_Update);
		
		JButton btn_Insert = new JButton("INSERT");
		btn_Insert.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				insertData();
				
			}
		});
		btn_Insert.setFont(new Font("굴림", Font.BOLD, 18));
		btn_Insert.setBounds(20, 325, 118, 50);
		frame.getContentPane().add(btn_Insert);
		
		JButton btn_Delete = new JButton("DELETE");
		btn_Delete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				deleteData();
			}
		});
		btn_Delete.setFont(new Font("굴림", Font.BOLD, 18));
		btn_Delete.setBounds(274, 325, 118, 50);
		frame.getContentPane().add(btn_Delete);
		
		
	
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(40, 408, 860, 169);
		frame.getContentPane().add(scrollPane);
		
		text_Output = new JTextArea();
		scrollPane.setViewportView(text_Output);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(457, 77, 467, 318);
		frame.getContentPane().add(scrollPane_1);
		
		Object[][] values={};
		String[] indexname ={"I D", "PASSWORD", "EMAIL"};
		tblmodel = new DefaultTableModel(values,indexname);
		
		
		table_Output = new JTable();
		table_Output.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row =table_Output.getSelectedRow();
				int col =table_Output.getSelectedColumn();
				text_Output.setText(row+", "+col+"선택됨");
				
				text_Id.setText(table_Output.getValueAt(row, 0).toString());
				text_Pw.setText(table_Output.getValueAt(row, 1).toString());
				text_Pw.setText(table_Output.getValueAt(row, 2).toString());
			}
		});
		
		table_Output.setModel(tblmodel);
		table_Output.getColumnModel().getColumn(0).setPreferredWidth(39);
		table_Output.getColumnModel().getColumn(1).setPreferredWidth(81);
		scrollPane_1.setViewportView(table_Output);
	
	} // end initialize()
	
	
	
	
	void selectAllData(){
		
		ArrayList<MemberModel> list=memberMgr.select();
		text_Output.setText("SELECT 결과 "+"\n");
		
		for(MemberModel m :list){
			String[] rowData = {m.getId(),m.getPw(),m.getEmail()};
			tblmodel.addRow(rowData);
			text_Output.append("I D :"+m.getId()+"\n"+"PASSWORD : "+m.getPw()+"\n"+"EMAIL : "+m.getEmail()+"\n\n");
		}// for
			text_Output.append(list.size()+"개 행 선택됨"+"\n");
	} // end selectAllData
	
	
	void insertData(){
		String id=text_Id.getText();
		String pw=text_Pw.getText();
		String email= text_Email.getText();
		
		
		
		if (!id.equals("")&&!pw.equals("")&&!email.equals("")) {
		int row=memberMgr.insert(id,pw,email);
		text_Output.append(row+"row(열) 이 추가 되었습니다."+"\n");	
		
			String[] rowData = {id,pw,email};
			tblmodel.addRow(rowData);
			
		} else {
		System.out.println("빈칸을 넣으세요");
		}
			
		
	} // end insertData()
	
	
	void updateData(){
		
		String id=text_Id.getText();
		String pw=text_Pw.getText();
		String email= text_Email.getText();
		
		if (!pw.equals("")&&!email.equals("")) {
			
			int row=memberMgr.update(id,pw,email);	
			text_Output.append(row+"row(열) 이 수정 되었습니다."+"\n");
			} else {
			System.out.println("빈칸을 넣으세요");
			}
		
		
		
	} // end updateData() 
	
	
	
	
	void deleteData(){
		String id=text_Id.getText();
		int row=memberMgr.delete(id);
		text_Output.append(row+"row(열) 이 수정 되었습니다."+"\n");
		if(row >0){
			tblmodel.removeRow(rowSelected);
		}
		
	}
	
	
	
	
}// end class DB05Main
