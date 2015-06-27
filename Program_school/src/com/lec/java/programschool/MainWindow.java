package com.lec.java.programschool;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;

public class MainWindow {

	private JFrame frame;
	private Controler schoolmgr = Controler.getInstance();
	private DefaultTableModel tblmodel;
	private DefaultTableModel tblmodel2;
	private int rowcount;
	private int colcount;
	private int rowcount2;
	private int colcount2;
	private JPanel panel_ScoreManagement;
	private JPanel panel;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JTextField textField_Id;
	private JTextField textField_Name;
	private JTextField textField_Phone;
	private JTextField textField_Email;
	private JTable table_StudentInfo;
	private JButton btn_insert1;
	private JButton btn_update1;
	private JButton btn_delete;
	private JComboBox comboBox_Grade;
	private JTable table_Score;
	private JTextField textField_Math;
	private JTextField textField_Kor;
	private JTextField textField_Eng;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JTextField textField_id2;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
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
	public MainWindow() {

		schoolmgr.connectdb();
		initialize();
		selectData();
		selectData2();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("학생 관리 프로그램 0.8");
		frame.getContentPane().setBackground(new Color(255, 255, 204));
		frame.setBounds(100, 100, 964, 609);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.PINK, new Color(153, 255, 255), null, null));
		desktopPane.setBackground(Color.WHITE);
		desktopPane.setBounds(0, 26, 948, 544);
		frame.getContentPane().add(desktopPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setFont(new Font("굴림", Font.PLAIN, 20));
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane.setBounds(0, 25, 948, 509);
		desktopPane.add(tabbedPane);
		
		JPanel panel_StudentInfo = new JPanel();
		tabbedPane.addTab("학생정보입력", null, panel_StudentInfo, null);
		panel_StudentInfo.setLayout(null);
		
		btn_insert1 = new JButton("입력");
		btn_insert1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertData();
				
				
			}
		});
		btn_insert1.setBounds(0, 238, 96, 33);
		panel_StudentInfo.add(btn_insert1);
		
		btn_update1 = new JButton("수정");
		btn_update1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateData();
			}
		});
		btn_update1.setBounds(104, 238, 96, 33);
		panel_StudentInfo.add(btn_update1);
		
		btn_delete = new JButton("삭제");
		btn_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deletaData();
			}
		});
		btn_delete.setBounds(206, 238, 96, 33);
		panel_StudentInfo.add(btn_delete);
		
		JLabel label = new JLabel("ID");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("굴림", Font.PLAIN, 14));
		label.setBounds(12, 63, 60, 23);
		panel_StudentInfo.add(label);
		
		JLabel label_1 = new JLabel("Name");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("굴림", Font.PLAIN, 14));
		label_1.setBounds(12, 93, 60, 23);
		panel_StudentInfo.add(label_1);
		
		JLabel label_2 = new JLabel("Phone");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("굴림", Font.PLAIN, 14));
		label_2.setBounds(12, 126, 60, 23);
		panel_StudentInfo.add(label_2);
		
		JLabel label_3 = new JLabel("email");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("굴림", Font.PLAIN, 14));
		label_3.setBounds(12, 159, 60, 23);
		panel_StudentInfo.add(label_3);
		
		JLabel label_4 = new JLabel("grade");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("굴림", Font.PLAIN, 14));
		label_4.setBounds(12, 188, 60, 23);
		panel_StudentInfo.add(label_4);
		
		textField_Id = new JTextField();
		textField_Id.setColumns(10);
		textField_Id.setBounds(84, 63, 167, 21);
		panel_StudentInfo.add(textField_Id);
		
		textField_Name = new JTextField();
		textField_Name.setColumns(10);
		textField_Name.setBounds(84, 95, 167, 21);
		panel_StudentInfo.add(textField_Name);
		
		textField_Phone = new JTextField();
		textField_Phone.setColumns(10);
		textField_Phone.setBounds(84, 128, 167, 21);
		panel_StudentInfo.add(textField_Phone);
		
		textField_Email = new JTextField();
		textField_Email.setColumns(10);
		textField_Email.setBounds(84, 161, 167, 21);
		panel_StudentInfo.add(textField_Email);
		
		comboBox_Grade = new JComboBox();
		comboBox_Grade.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		comboBox_Grade.setBounds(152, 189, 42, 23);
		panel_StudentInfo.add(comboBox_Grade);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(312, 28, 510, 423);
		panel_StudentInfo.add(scrollPane);
		
		
		// 학생 정보 j테이블
		Object[][] values = {};

		String[] indexName = { "id", "name", "phone", "email", "grade" };
		tblmodel = new DefaultTableModel(values, indexName);
		
		table_StudentInfo = new JTable();
		table_StudentInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rowcount=table_StudentInfo.getSelectedRow();
				colcount=table_StudentInfo.getSelectedColumn();
				
				textField_Id.setText(tblmodel.getValueAt(rowcount, 0).toString());
				textField_Name.setText(tblmodel.getValueAt(rowcount, 1).toString());
				textField_Phone.setText(tblmodel.getValueAt(rowcount, 2).toString());
				textField_Email.setText(tblmodel.getValueAt(rowcount, 3).toString());
				comboBox_Grade.setSelectedItem(tblmodel.getValueAt(rowcount, 4));
			}
		});
		table_StudentInfo.setModel(tblmodel);
		scrollPane.setViewportView(table_StudentInfo);
		
		panel_ScoreManagement = new JPanel();
		tabbedPane.addTab("학점입력", null, panel_ScoreManagement, null);
		panel_ScoreManagement.setLayout(null);
		
		JButton btn_insert2 = new JButton("입력");
		btn_insert2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				insertData2();
			}
		});
		btn_insert2.setBounds(12, 163, 96, 33);
		panel_ScoreManagement.add(btn_insert2);
		
		JButton btn_update2 = new JButton("수정");
		btn_update2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				updateData2();
				
			}
		});
		btn_update2.setBounds(116, 163, 96, 33);
		panel_ScoreManagement.add(btn_update2);
		
		JButton btn_delete2 = new JButton("삭제");
		btn_delete2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deletaData2();
			}
		});
		btn_delete2.setBounds(218, 163, 96, 33);
		panel_ScoreManagement.add(btn_delete2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(329, 22, 493, 435);
		panel_ScoreManagement.add(scrollPane_1);
		
		// 성적 정보 입력창
		Object[][] values2={};

		String[] indexName2={"ID", "KOR", "ENG", "MATH"};
		tblmodel2= new DefaultTableModel(values2,indexName2);
		table_Score = new JTable();
		table_Score.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rowcount2=table_Score.getSelectedRow();
				colcount2=table_Score.getSelectedColumn();
				textField_id2.setText(tblmodel2.getValueAt(rowcount2, 0).toString());
				textField_Kor.setText(tblmodel2.getValueAt(rowcount2, 1).toString());
				textField_Eng.setText(tblmodel2.getValueAt(rowcount2, 2).toString());
				textField_Math.setText(tblmodel2.getValueAt(rowcount2, 3).toString());
				
			}
		});
		table_Score.setModel(tblmodel2);
		scrollPane_1.setViewportView(table_Score);
		
		textField_Math = new JTextField();
		textField_Math.setColumns(10);
		textField_Math.setBounds(108, 130, 116, 21);
		panel_ScoreManagement.add(textField_Math);
		
		textField_Kor = new JTextField();
		textField_Kor.setColumns(10);
		textField_Kor.setBounds(108, 65, 116, 21);
		panel_ScoreManagement.add(textField_Kor);
		
		textField_Eng = new JTextField();
		textField_Eng.setColumns(10);
		textField_Eng.setBounds(108, 97, 116, 21);
		panel_ScoreManagement.add(textField_Eng);
		
		label_5 = new JLabel("KOR");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("굴림", Font.PLAIN, 14));
		label_5.setBounds(12, 65, 60, 23);
		panel_ScoreManagement.add(label_5);
		
		label_6 = new JLabel("ENG");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("굴림", Font.PLAIN, 14));
		label_6.setBounds(12, 98, 60, 23);
		panel_ScoreManagement.add(label_6);
		
		label_7 = new JLabel("MATH");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("굴림", Font.PLAIN, 14));
		label_7.setBounds(12, 131, 60, 23);
		panel_ScoreManagement.add(label_7);
		
		label_8 = new JLabel("ID");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("굴림", Font.PLAIN, 14));
		label_8.setBounds(12, 32, 60, 23);
		panel_ScoreManagement.add(label_8);
		
		textField_id2 = new JTextField();
		textField_id2.setColumns(10);
		textField_id2.setBounds(108, 34, 116, 21);
		panel_ScoreManagement.add(textField_id2);
		
		panel = new JPanel();
		tabbedPane.addTab("학생 평가 정보", null, panel, null);
		panel.setLayout(null);
		
		label_9 = new JLabel("ID");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("굴림", Font.PLAIN, 14));
		label_9.setBounds(64, 73, 60, 23);
		panel.add(label_9);
		
		label_10 = new JLabel("Name");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("굴림", Font.PLAIN, 14));
		label_10.setBounds(64, 103, 60, 23);
		panel.add(label_10);
		
		label_11 = new JLabel("Phone");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("굴림", Font.PLAIN, 14));
		label_11.setBounds(64, 136, 60, 23);
		panel.add(label_11);
		
		label_12 = new JLabel("Email");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("굴림", Font.PLAIN, 14));
		label_12.setBounds(64, 169, 60, 23);
		panel.add(label_12);
		
		label_13 = new JLabel("Grade");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("굴림", Font.PLAIN, 14));
		label_13.setBounds(64, 198, 60, 23);
		panel.add(label_13);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(136, 73, 167, 21);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(136, 105, 167, 21);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(136, 138, 167, 21);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(136, 171, 167, 21);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(136, 200, 167, 21);
		panel.add(textField_4);
		
		JLabel lblNewLabel = new JLabel("학생정보");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(64, 20, 239, 32);
		panel.add(lblNewLabel);
		
		JLabel label_14 = new JLabel("KOR");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("굴림", Font.PLAIN, 14));
		label_14.setBounds(338, 73, 60, 23);
		panel.add(label_14);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(434, 73, 116, 21);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(434, 105, 116, 21);
		panel.add(textField_6);
		
		JLabel label_15 = new JLabel("ENG");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setFont(new Font("굴림", Font.PLAIN, 14));
		label_15.setBounds(338, 106, 60, 23);
		panel.add(label_15);
		
		JLabel label_16 = new JLabel("MATH");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("굴림", Font.PLAIN, 14));
		label_16.setBounds(338, 139, 60, 23);
		panel.add(label_16);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(434, 138, 116, 21);
		panel.add(textField_7);
		
		JLabel label_17 = new JLabel("성적정보");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setFont(new Font("굴림", Font.PLAIN, 20));
		label_17.setBounds(351, 20, 239, 32);
		panel.add(label_17);
		
		JLabel label_18 = new JLabel("총점");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setFont(new Font("굴림", Font.PLAIN, 14));
		label_18.setBounds(338, 170, 60, 23);
		panel.add(label_18);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(434, 169, 116, 21);
		panel.add(textField_8);
		
		JLabel label_19 = new JLabel("과목평균");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setFont(new Font("굴림", Font.PLAIN, 14));
		label_19.setBounds(338, 198, 60, 23);
		panel.add(label_19);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(434, 198, 116, 21);
		panel.add(textField_9);
		
		JLabel label_20 = new JLabel("전체석차");
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setFont(new Font("굴림", Font.PLAIN, 14));
		label_20.setBounds(338, 228, 60, 23);
		panel.add(label_20);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(434, 227, 116, 21);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(434, 256, 116, 21);
		panel.add(textField_11);
		
		JLabel label_21 = new JLabel("전체평균");
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		label_21.setFont(new Font("굴림", Font.PLAIN, 14));
		label_21.setBounds(338, 257, 60, 23);
		panel.add(label_21);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 948, 33);
		frame.getContentPane().add(menuBar);
		
		JMenu menu = new JMenu("메뉴");
		menuBar.add(menu);
		
		mntmNewMenuItem_1 = new JMenuItem("저장");
		menu.add(mntmNewMenuItem_1);
		
		mntmNewMenuItem = new JMenuItem("읽기");
		menu.add(mntmNewMenuItem);
		
		mntmNewMenuItem_2 = new JMenuItem("도움말");
		menu.add(mntmNewMenuItem_2);

		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 메서드 기능부
	private void selectData() {
		ArrayList<model> list = schoolmgr.select();

		for (model m : list) {

			String[] rowdata = { m.getId(), m.getName(), m.getPhone(),
					m.getEmail(), m.getGrade() };
			tblmodel.addRow(rowdata);
		}

	} // end selectData()
	
	
	private void insertData(){
		
		String id=textField_Id.getText();
		String name=textField_Name.getText();
		String phone=textField_Phone.getText();
		String email=textField_Email.getText();
		String grade=String.valueOf(comboBox_Grade.getSelectedItem());
		System.out.println(grade);
		try {
			if (id!=""||name!=""||phone!=""||email!=""||grade!="") {
				schoolmgr.insert(id, name, phone, email, grade);
				String[] rowData={id, name, phone, email, grade};
				tblmodel.addRow(rowData);
			}
			
			
			
		} catch (SQLIntegrityConstraintViolationException e) {
			JOptionPane.showMessageDialog(frame,"중복된 ID입니다.");
					
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(frame,
					"id 숫자만 입력하고"+"\n"+"빈칸은 없어야합니다");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(frame,"빈칸은 없어야합니다");
		}
		
		
		
		
	}// end insertData()
	
	
	
	
	private void updateData(){
		
		
		
		String id=textField_Id.getText();
		String name=textField_Name.getText();
		String phone=textField_Phone.getText();
		String email=textField_Email.getText();
		String grade=String.valueOf(comboBox_Grade.getSelectedItem());
		System.out.println(grade);
		try {
			if (id!=""||name!=""||phone!=""||email!=""||grade!="") {
				schoolmgr.update(id, name, phone, email, grade);
				String[] rowData={id, name, phone, email, grade};
				tblmodel.removeRow(rowcount);
				tblmodel.insertRow(rowcount, rowData);
				
		
			}
			
			
			
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(frame,"빈칸은 없어야합니다");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(frame,
			"id 숫자만 입력하고"+"\n"+"빈칸은 없어야합니다");
			
		}
		
		
		
	
		
		
	} // end updateData()
	
	private void deletaData(){
		
		
		try {
			String id=textField_Id.getText();
			schoolmgr.delete(id);
			tblmodel.removeRow(rowcount);
			
		} catch (SQLException e) {
			System.out.println("삭제 기능에서  에러났습니다");
			e.printStackTrace();
		}
	}// end deletaData()
	
	
	
	
	
	
	// 학점 입력 메뉴 메소드 
	
	private void selectData2() {
		ArrayList<model> list = schoolmgr.select2();

		for (model m : list) {

			Object[] rowdata = {m.getId2(),m.getKor(),m.getEng(),m.getMath()};
			tblmodel2.addRow(rowdata);
		}

	} // end selectData()
	
	
	
	
	
	
	
	
	
	
	
	
	private void insertData2(){
		String id= textField_id2.getText();
		String kor=textField_Kor.getText();
		String eng=textField_Eng.getText();
		String math=textField_Math.getText();
		
		String[] rowData={id,kor,eng,math};
		try {
			
			
			if (id!=""||kor!=""||eng!=""||math!=""){
				int int_id= Integer.parseInt(id);
				double double_kor=Double.parseDouble(kor);
				double double_Eng=Double.parseDouble(eng);
				double double_Math=Double.parseDouble(math);
				schoolmgr.insert2(int_id, double_kor, double_Eng, double_Math);
				tblmodel2.addRow(rowData);
				
				
			}
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(frame,
					"id 숫자만 입력하고"+"\n"+"빈칸은 없어야합니다");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(frame,"빈칸은 없어야합니다");
		}
		
		
	} // end insertData2()
	
	
	
	
	private void updateData2(){
		
		
		String id= textField_id2.getText();
		String kor=textField_Kor.getText();
		String eng=textField_Eng.getText();
		String math=textField_Math.getText();
		
		String[] rowData={id,kor,eng,math};
		try {
			if (id!=""||kor!=""||eng!=""||math!=""){
		int int_id= Integer.parseInt(id);
		double double_kor=Double.parseDouble(kor);
		double double_Eng=Double.parseDouble(eng);
		double double_Math=Double.parseDouble(math);
				schoolmgr.update2(int_id, double_kor, double_Eng, double_Math);
				tblmodel2.removeRow(rowcount);
				tblmodel2.insertRow(rowcount, rowData);
				
		
			}
			
	
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(frame,"빈칸은 없어야합니다");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(frame,
					"id 숫자만 입력하고"+"\n"+"빈칸은 없어야합니다");
		}
		
		
		
	
		
		
	} // end updateData2()
	
	
	
	private void deletaData2(){
		
		
		try {
			int id=Integer.parseInt(textField_id2.getText());
			schoolmgr.delete2(id);
			tblmodel2.removeRow(rowcount2);
			
		} catch (SQLException e) {
			System.out.println("삭제 기능에서  에러났습니다");
			e.printStackTrace();
		}
	}// end deletaData()
} // end class MainWindow

