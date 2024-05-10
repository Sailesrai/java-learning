package JavaSwing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingDocs {
/*
 * -----Java Swings/Swing Framework---------
 * 
 * # use to create UI for desktop application in java
 * 
 * # UI components : 
 *   *JFrame
 *   *JPanel
 *   *JButton
 *   *JLabel
 *   *JTextField
 *   *JPasswordField
 *   *JTable
 *   *JRadioBox
 *   *JComboBox
 *   *JMenu
 *   *JMenuBar
 *  
 */
	public static void main(String[] args) {
		
		JFrame form = new JFrame();
		
		form.setTitle("Login/Signup");
		form.setSize(600,400);
		form.setLayout(null); //it is done so we can keep field as we like
		
		//create a button
		JButton jb = new JButton("Login");
		jb.setBounds(200,100,200,30);
		
		form.add(jb);
		
		form.setVisible(true);
	}
}
