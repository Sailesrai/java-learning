package com.view;

import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.model.Product;
import com.model.Product2;
import com.service.ProductService;
import com.service.ProductServiceimpl;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ProductList extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField nametxt;
	private JTextField companytxt;
	private JTextField pricetxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductList frame = new ProductList();
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
	public ProductList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1010, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(460, 10, 2, 2);
		contentPane.add(scrollPane_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(467, 10, 2, 2);
		contentPane.add(scrollPane);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(223, 53, 761, 565);
		contentPane.add(scrollPane_2);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Name", "Company", "Price"
			}
		));
		scrollPane_2.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("ProductList");
		lblNewLabel.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 20));
		lblNewLabel.setBounds(321, 11, 148, 31);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add New");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
			new ProductForm().setVisible(true);
			}
			
		});
		btnNewButton.setBounds(52, 13, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(table.getSelectedRow() < 0 ) {
					JOptionPane.showMessageDialog(null, "select any data");
					return;
					
				}
				
				int srow = table.getSelectedRow();
				int id  = (int) table.getModel().getValueAt(srow ,0);
			
				ProductService ps = new ProductServiceimpl();
				ps.deleteProduct(id);
				
				JOptionPane.showMessageDialog(null , "delete success");
				displayData();
				
			}
		});
		btnNewButton_1.setBounds(460, 629, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Edit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(table.getSelectedRow() < 0 ) {
					JOptionPane.showMessageDialog(null, "select any data");
					return;
					
				}
				
				int srow = table.getSelectedRow();
				int id  = (int) table.getModel().getValueAt(srow ,0);
				
				nametxt.setText(table.getModel().getValueAt(srow, 1).toString());
				companytxt.setText(table.getModel().getValueAt(srow, 2).toString());
				pricetxt.setText(table.getModel().getValueAt(srow, 3).toString());
				

				Product2 p = new Product2();
				p.setName(nametxt.getText());
				p.setCompany(companytxt.getText());
				p.setPrice(Integer.parseInt(pricetxt.getText()));
			//	String company = companytxt.getText();
			//	String price = pricetxt.getText();
				
				ProductService ps = new ProductServiceimpl();
				ps.updateProduct(p);
				
				JOptionPane.showMessageDialog(null, "updated successfully");
			
             displayData();
             
             //clear form
             nametxt.setText("");
             companytxt.setText("");
             pricetxt.setText("");
			
				
			}
		});
		btnNewButton_2.setBounds(335, 629, 89, 23);
		contentPane.add(btnNewButton_2);
		
		nametxt = new JTextField();
		nametxt.setBounds(85, 157, 111, 38);
		contentPane.add(nametxt);
		nametxt.setColumns(10);
		
		JLabel NameTxt = new JLabel("Name");
		NameTxt.setBounds(29, 169, 46, 14);
		contentPane.add(NameTxt);
		
		companytxt = new JTextField();
		companytxt.setColumns(10);
		companytxt.setBounds(85, 219, 111, 38);
		contentPane.add(companytxt);
		
		pricetxt = new JTextField();
		pricetxt.setColumns(10);
		pricetxt.setBounds(85, 280, 111, 38);
		contentPane.add(pricetxt);
		
		JLabel CompanyTxt = new JLabel("Company");
		CompanyTxt.setBounds(29, 231, 46, 14);
		contentPane.add(CompanyTxt);
		
		JLabel PriceTxt = new JLabel("Price");
		PriceTxt.setBounds(29, 292, 46, 14);
		contentPane.add(PriceTxt);
		
		JButton btnNewButton_3 = new JButton("Update");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Product2 p = new Product2();
				p.setName(nametxt.getText());
				p.setCompany(companytxt.getText());
				p.setPrice(Integer.parseInt(pricetxt.getText()));
			//	String company = companytxt.getText();
			//	String price = pricetxt.getText();
				
				ProductService ps = new ProductServiceimpl();
				ps.updateProduct(p);
				
				JOptionPane.showMessageDialog(null, "updated successfully");
			
             displayData();
             
             //clear form
             nametxt.setText("");
             companytxt.setText("");
             pricetxt.setText("");
				
			}
		});
		btnNewButton_3.setBounds(575, 629, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Print");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					table.print();
				} catch (PrinterException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_4.setBounds(689, 629, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Refresh");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Successfully refreshed");
				
	             displayData();
				
			}
		});
		btnNewButton_5.setBounds(875, 19, 89, 23);
		contentPane.add(btnNewButton_5);
		
		displayData();
	}
	
	//get all products
	private void displayData() {
		ProductService ps = new ProductServiceimpl();
		List<Product> plist  = ps.getAllProducts();
		
		DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
		for(Product p : plist) {
			tmodel.addRow(new Object[] {p.getId(), p.getName(), p.getCompany(),p.getPrice()});
		}
	}
}
