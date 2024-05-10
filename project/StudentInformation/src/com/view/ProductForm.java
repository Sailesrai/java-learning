package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.model.Data;
import com.model.Data2;
import com.service.CRUD;
import com.service.CRUDimpl;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ProductForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField NameTxt;
	private JTextField AgeTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductForm frame = new ProductForm();
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
	public ProductForm() {
		setTitle("Product Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 611);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		NameTxt = new JTextField();
		NameTxt.setBounds(209, 77, 174, 46);
		contentPane.add(NameTxt);
		NameTxt.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(154, 83, 45, 30);
		contentPane.add(lblNewLabel);
		
		AgeTxt = new JTextField();
		AgeTxt.setBounds(209, 222, 174, 46);
		contentPane.add(AgeTxt);
		AgeTxt.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Faculty");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(139, 158, 60, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Age");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(164, 235, 35, 17);
		contentPane.add(lblNewLabel_2);
		
		JComboBox FacultyTxt = new JComboBox();
		FacultyTxt.setModel(new DefaultComboBoxModel(new String[] {"BIM", "BIT", "BscCSIT", "BBA", "BBS", "BBM"}));
		FacultyTxt.setBounds(209, 152, 174, 46);
		contentPane.add(FacultyTxt);
		
		JButton Submit = new JButton("Submit");
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new StudentData().setVisible(true);
			
				
				Data2 p = new Data2();
				p.setName(NameTxt.getText());
				p.setFaculty(FacultyTxt.getSelectedItem().toString());
				p.setAge(Integer.parseInt(AgeTxt.getText()));
			//	String company = companytxt.getText();
				
				
				CRUD ps = new CRUDimpl();
				ps.addStudent(p);
				JOptionPane.showMessageDialog(null, "Added successfully");
				
			}
		});
		Submit.setBounds(229, 311, 89, 23);
		contentPane.add(Submit);
		
		JButton btnNewButton = new JButton("Display");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(209, 360, 89, 23);
		contentPane.add(btnNewButton);
		
	
	}
}
