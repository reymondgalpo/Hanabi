package MyFirstGUIGalpoTubera;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import GalpoAndTubera.PersonClass;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class PasswordWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnSignUp;
	private JButton btnLogIn;
	private JButton btnCancel;
	private JLabel lblNewLAbel;
	private String Username = "Ikaw";
	private String Password = "123";
	private static PasswordWindow frame = new PasswordWindow(null);
	private SignUp SignUp = new SignUp(null);
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
	 * @param userProfile 
	 */
	public PasswordWindow(ArrayList<PersonClass> userProfile) {
		userList = userProfile;
		initComponent();
		createEvent();
		

		}
	public void initComponent() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\EXAM\\Downloads\\download.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Log In");
		lblNewLabel.setBounds(177, 10, 80, 31);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(52, 83, 94, 20);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(156, 82, 134, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(156, 122, 134, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(52, 125, 94, 14);
		contentPane.add(lblNewLabel_2);
		
		btnSignUp = new JButton("Sign up");
		
		btnSignUp.setBounds(52, 187, 89, 23);
		contentPane.add(btnSignUp);
		
		btnLogIn = new JButton("Log In");
	
		btnLogIn.setBounds(156, 187, 89, 23);
		contentPane.add(btnLogIn);
		
		btnCancel = new JButton("Cancel");
		
		btnCancel.setBounds(257, 187, 89, 23);
		contentPane.add(btnCancel);
		
	}
	
	private void createEvent() {
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				frame.dispose();
				SignUp.setVisible(true);
			}
		});
		
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Tama");
			}
		});
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Mali");	
			}
		});
	}
}

