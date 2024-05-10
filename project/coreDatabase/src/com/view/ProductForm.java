package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.model.Product;
import com.model.Product2;
import com.service.ProductService;
import com.service.ProductServiceimpl;

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
	private JTextField nametxt;
	private JTextField pricetxt;

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
		
		nametxt = new JTextField();
		nametxt.setBounds(209, 77, 174, 46);
		contentPane.add(nametxt);
		nametxt.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(154, 83, 45, 30);
		contentPane.add(lblNewLabel);
		
		pricetxt = new JTextField();
		pricetxt.setBounds(209, 222, 174, 46);
		contentPane.add(pricetxt);
		pricetxt.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Company");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(139, 158, 60, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Price");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(164, 235, 35, 17);
		contentPane.add(lblNewLabel_2);
		
		JComboBox companytxt = new JComboBox();
		companytxt.setModel(new DefaultComboBoxModel(new String[] {"Dell", "Cg", "Xiaomi", "Lenovo", "Samsung", "Apple"}));
		companytxt.setBounds(209, 152, 174, 46);
		contentPane.add(companytxt);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				Product2 p = new Product2();
				p.setName(nametxt.getText());
				p.setCompany(companytxt.getSelectedItem().toString());
				p.setPrice(Integer.parseInt(pricetxt.getText()));
			//	String company = companytxt.getText();
			//	String price = pricetxt.getText();
				
				ProductService ps = new ProductServiceimpl();
				ps.addProduct(p);
				
				JOptionPane.showMessageDialog(null, "added successfully");
			}
		});
		btnNewButton.setBounds(229, 311, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Display");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ProductList().setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(229, 356, 89, 23);
		contentPane.add(btnNewButton_1);
		
	
	}
}
