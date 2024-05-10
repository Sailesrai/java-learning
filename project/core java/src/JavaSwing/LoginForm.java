package JavaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;

public class LoginForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Usernametxt;
	private JPasswordField Passwordtxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
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
	public LoginForm() {
		setTitle("LoginForm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 378);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(307, 140, 82, 34);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, "hello");
			String un = Usernametxt.getText();
			String pw = Passwordtxt.getText();
			
			if(un.equals("ram")&& pw.equals("123")) {
	
				JOptionPane.showMessageDialog(null, "Login Success");
				
				new HomePage().setVisible(true);
				dispose();
			}else {
				JOptionPane.showMessageDialog(null, "Login failed");
			}
			
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setBounds(163, 70, 67, 14);
		contentPane.add(lblNewLabel);
		
		Usernametxt = new JTextField();
		Usernametxt.setBounds(253, 67, 193, 20);
		contentPane.add(Usernametxt);
		Usernametxt.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(162, 105, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		Passwordtxt = new JPasswordField();
		Passwordtxt.setBounds(253, 102, 195, 20);
		contentPane.add(Passwordtxt);
		
		JLabel lblNewLabel_2 = new JLabel("UserLogin");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBackground(Color.GRAY);
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setBounds(301, 11, 88, 48);
		contentPane.add(lblNewLabel_2);
	}
}
