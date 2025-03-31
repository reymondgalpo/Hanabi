package GalpoAndTubera;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Myshop extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JButton btnregister;
	String [] payment = {" ", "Cash", "Credit Card", "Debit Card", "PayPal"};
	String [] milktea = {" ", "Chocolate", "Strawberry", "Oreo", "Matcha", "Taro", "Mango", "Thai Tea", "Honeydew", "Avocado"};
	String [] size = {" ", "Small", "Medium", "Large", "Extra Large"};
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Myshop frame = new Myshop();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Myshop() {
		initComponent();
		createEvent();
	}
	private void initComponent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 612);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Custom Name");
		lblNewLabel.setBounds(49, 34, 89, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(49, 59, 183, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Pay");
		lblNewLabel_1.setBounds(324, 34, 97, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox cbPayment = new JComboBox(payment);
		cbPayment.setBounds(324, 59, 161, 37);
		contentPane.add(cbPayment);
		
		JLabel lblNewLabel_2 = new JLabel("Order");
		lblNewLabel_2.setBounds(119, 106, 44, 14);
		contentPane.add(lblNewLabel_2);
		
		JComboBox cbProduct = new JComboBox(milktea);
		cbProduct.setBounds(49, 131, 183, 36);
		contentPane.add(cbProduct);
		
		JLabel lblNewLabel_2_1 = new JLabel("Size");
		lblNewLabel_2_1.setBounds(119, 178, 35, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JComboBox cbSize = new JComboBox(size);
		cbSize.setBounds(49, 203, 183, 31);
		contentPane.add(cbSize);
		
		JLabel lblNewLabel_2_2 = new JLabel("Add on");
		lblNewLabel_2_2.setBounds(324, 106, 59, 25);
		contentPane.add(lblNewLabel_2_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Cheese foam");
		chckbxNewCheckBox.setBounds(286, 138, 109, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Pudding");
		chckbxNewCheckBox_1.setBounds(286, 174, 109, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Tapioca pearls");
		chckbxNewCheckBox_2.setBounds(286, 207, 109, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		btnregister = new JButton("Register");
		btnregister.setBounds(222, 277, 89, 23);
		contentPane.add(btnregister);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 315, 544, 247);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Tip");
		lblNewLabel_2_2_1.setBounds(439, 107, 73, 24);
		contentPane.add(lblNewLabel_2_2_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("$10");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(419, 138, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("$20");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(419, 174, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("$30");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(419, 211, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
	}
	private void createEvent() {
		btnregister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
	}
}
