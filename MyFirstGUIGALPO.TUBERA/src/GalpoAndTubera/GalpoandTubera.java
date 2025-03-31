package GalpoAndTubera;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class GalpoandTubera extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox<String> thenbruh;
	private JComboBox<String> Options;
	String[] Onepisos = {"Be poor but happy", "Be poor but have family", "Be poor but go to heaven", "Be poor but live longer"};
	String[] Onebillionpisos = {"Be rich but depressed", "Be rich but a virgin till death", "Be rich but go to hell", "Be rich but die young"};
	private JRadioButton rdbtnNewRadioButton_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GalpoandTubera frame = new GalpoandTubera();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public GalpoandTubera() {
		initComponent();
		createEvent();
		
	}
	public void initComponent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		thenbruh = new JComboBox();
		thenbruh.setBounds(106, 120, 220, 20);
		contentPane.add(thenbruh);
		
		JLabel lblNewLabel = new JLabel("Then...");
		lblNewLabel.setBounds(169, 82, 63, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Would you rather");
		lblNewLabel_1.setBounds(155, 11, 99, 27);
		contentPane.add(lblNewLabel_1);
		
		Options = new JComboBox();
		Options.setModel(new DefaultComboBoxModel(new String[] {"100 Billion pesos", "1 pesos"}));
		Options.setBounds(106, 49, 220, 22);
		contentPane.add(Options);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Confirm");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(169, 158, 85, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Confirm");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(169, 184, 85, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
	}
	
	private void createEvent() {
		thenbruh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(thenbruh.getSelectedItem().equals("Onebillionpisos")) {
					thenbruh.setModel(new DefaultComboBoxModel(Onebillionpisos));
				}
			}
		});
		
	}
}
