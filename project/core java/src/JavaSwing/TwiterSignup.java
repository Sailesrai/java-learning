package JavaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class TwiterSignup extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TwiterSignup frame = new TwiterSignup();
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
	public TwiterSignup() {
		setFont(new Font("Kozuka Gothic Pr6N H", Font.BOLD, 12));
		setTitle("Twitter Login");
		setForeground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 473, 460);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sign in to X");
		lblNewLabel.setFont(new Font("Bodoni MT", Font.BOLD, 20));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(143, 31, 137, 41);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Sign in with Google");
		btnNewButton.setFont(new Font("Tekton Pro Ext", Font.BOLD, 13));
		btnNewButton.setBounds(143, 83, 198, 31);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sign in with Apple");
		btnNewButton_1.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(143, 143, 198, 31);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Next");
		btnNewButton_2.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 13));
		btnNewButton_2.setBounds(143, 237, 198, 31);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Don't have  an account?");
		lblNewLabel_1.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 13));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(143, 334, 161, 31);
		contentPane.add(lblNewLabel_1);
		
		JTextArea txtrPhoneemailOrUsername = new JTextArea();
		txtrPhoneemailOrUsername.setForeground(Color.GRAY);
		txtrPhoneemailOrUsername.setBackground(Color.BLACK);
		txtrPhoneemailOrUsername.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtrPhoneemailOrUsername.setText("Phone,email, or username");
		txtrPhoneemailOrUsername.setBounds(143, 185, 198, 31);
		contentPane.add(txtrPhoneemailOrUsername);
		
		JButton btnNewButton_3 = new JButton("Forgot password?");
		btnNewButton_3.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 13));
		btnNewButton_3.setBounds(143, 285, 198, 31);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_2 = new JLabel("X");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(232, 0, 33, 31);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_4 = new JButton("Sign up");
		btnNewButton_4.setBackground(Color.BLACK);
		btnNewButton_4.setForeground(new Color(0, 51, 204));
		btnNewButton_4.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 12));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(314, 335, 89, 23);
		contentPane.add(btnNewButton_4);
	}
}
