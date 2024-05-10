package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class StudentData extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentData frame = new StudentData();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StudentData() {
		setBackground(SystemColor.activeCaption);
		setTitle("StudentData");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 760, 616);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Create Data");
		btnNewButton.setBounds(311, 333, 134, 34);
		contentPane.add(btnNewButton);

		DefaultTableModel model = new DefaultTableModel();
		table = new JTable(model);

		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Faculty");
		model.addColumn("Age");
try {
		ResultSet resultSet = null;
		while (resultSet.next()) {
		    int id = resultSet.getInt("id");
		    String name = resultSet.getString("Name");
		    String faculty = resultSet.getString("Faculty");
		    int age = resultSet.getInt("Age");
		    model.addRow(new Object[]{id, name, faculty, age});
	}
	}catch (Exception e) {
			e.printStackTrace();
}
//		JScrollPane scrollPane = new JScrollPane(table);
//		getContentPane().add(scrollPane);
		setVisible(true);


		
		JButton btnNewButton_1 = new JButton("Delete Data");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ProductForm().setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(311, 389, 134, 34);
		contentPane.add(btnNewButton_1);
	}
}


