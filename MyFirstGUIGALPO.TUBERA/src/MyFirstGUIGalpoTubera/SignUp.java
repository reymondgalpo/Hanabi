package MyFirstGUIGalpoTubera;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import GalpoAndTubera.PersonClass;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class SignUp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnSignUp;
	private JButton btnLogin;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JPasswordField passwordField;
	private static PasswordWindow frame = new PasswordWindow(null);
	private static SignUp SignUp = new SignUp(null);
	private ArrayList<PersonClass> userList;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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
	public SignUp(ArrayList<PersonClass> userProfile) {
		userList = userProfile;
		initComponent();
		createEvent();
		
	}
	public void initComponent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Sign Up");
		lblNewLabel.setBounds(163, 11, 120, 31);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(44, 82, 82, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(44, 119, 82, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(44, 155, 82, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_5 = new JLabel("User Name");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(44, 188, 82, 14);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Password");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(43, 223, 61, 14);
		contentPane.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(152, 81, 161, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(152, 118, 161, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(152, 154, 161, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(152, 187, 161, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(152, 222, 161, 20);
		contentPane.add(passwordField);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(285, 266, 89, 23);
		contentPane.add(btnCancel);
		
		btnSignUp = new JButton("Sign Up");
		btnSignUp.setBounds(180, 266, 89, 23);
		contentPane.add(btnSignUp);
		
		btnLogin = new JButton("Log in");
		btnLogin.setBounds(76, 266, 89, 23);
		contentPane.add(btnLogin);
	}
	private void createEvent() {
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String un = textField.getText();
				String pw = passwordField.getText();
				for(person p:userList) {
					if(un.equals(o.))
				}
			}
		});
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame1.dispose();
				PasswordWindow PasswordWindow = new PasswordWindow();
				PasswordWindow.setVisible(true);
				dispose();
			}
		});
	}
}
