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
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Registrationform extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Firstname;
	private JTextField Middlename;
	private JTextField Lastname;
	private JTextField LRN;
	private static Registrationform frame = new Registrationform();
	String[] ext = {" ", "Jr", "I", "II", "III", "IV", "V", "VI", "VII"};
	String[] month = {"month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	String[] day = {"day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
	String[] year = {"year", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025"};
	String[] track = {"Science", "Arts", "TVL", "Engineering"};
	String[] column = {"First Name", "Middle Name", "Last Name", "Ext", "Sex", "LRN", "Birthday", "Grade", "Track", "Strand"};
	
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JComboBox<String> cbExt;
	private JComboBox<String> cbMonth;
	private JComboBox<String> cbDay;
	private JComboBox<String> cbYear;
	private JComboBox<String> cbTrack;
	private JComboBox<String> cbStrand;
	private JTable table;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registrationform frame = new Registrationform();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Registrationform() {
		setTitle("Registration Form (Student)");
		initComponent();
		createEvent();
	}
	
	private void initComponent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 746);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Fn = new JLabel("Firstname");
		Fn.setBounds(36, 24, 68, 14);
		contentPane.add(Fn);
		
		Firstname = new JTextField();
		Firstname.setBounds(36, 49, 176, 20);
		contentPane.add(Firstname);
		Firstname.setColumns(10);
		
		JLabel Mn = new JLabel("Middlename");
		Mn.setBounds(236, 24, 78, 14);
		contentPane.add(Mn);
		
		Middlename = new JTextField();
		Middlename.setColumns(10);
		Middlename.setBounds(236, 49, 142, 20);
		contentPane.add(Middlename);
		
		Lastname = new JTextField();
		Lastname.setColumns(10);
		Lastname.setBounds(388, 49, 170, 20);
		contentPane.add(Lastname);
		
		JLabel Ln = new JLabel("Lastname");
		Ln.setBounds(388, 24, 71, 14);
		contentPane.add(Ln);
		
		JLabel Ext = new JLabel("Ext");
		Ext.setBounds(588, 24, 46, 14);
		contentPane.add(Ext);
		
		cbExt = new JComboBox(ext);
		cbExt.setBounds(575, 48, 99, 22);
		cbExt.setModel(new DefaultComboBoxModel<>(ext));
		contentPane.add(cbExt);
		
		JLabel sex = new JLabel("Sex");
		sex.setBounds(91, 80, 46, 14);
		contentPane.add(sex);
		
		JRadioButton male = new JRadioButton("Male");
		buttonGroup.add(male);
		male.setBounds(36, 101, 80, 23);
		contentPane.add(male);
		
		JRadioButton female = new JRadioButton("Female");
		buttonGroup.add(female);
		female.setBounds(132, 101, 80, 23);
		contentPane.add(female);
		
		JLabel Lrn = new JLabel("LRN");
		Lrn.setBounds(237, 80, 46, 14);
		contentPane.add(Lrn);
		
		LRN = new JTextField();
		LRN.setColumns(10);
		LRN.setBounds(237, 102, 184, 20);
		contentPane.add(LRN);
		
		cbMonth = new JComboBox();
		cbMonth.setBounds(447, 101, 71, 22);
		cbMonth.setModel(new DefaultComboBoxModel<>(month));
		contentPane.add(cbMonth);
		
		cbDay = new JComboBox();
		cbDay.setBounds(528, 101, 59, 22);
		cbDay.setModel(new DefaultComboBoxModel<>(day));
		contentPane.add(cbDay);
		
		cbYear = new JComboBox();
		cbYear.setBounds(596, 101, 78, 22);
		cbYear.setModel(new DefaultComboBoxModel<>(year));
		contentPane.add(cbYear);
		
		JLabel birthday = new JLabel("Birthday");
		birthday.setBounds(538, 80, 59, 14);
		contentPane.add(birthday);
		
		JLabel grade = new JLabel("Grade");
		grade.setBounds(91, 145, 46, 14);
		contentPane.add(grade);
		
		JRadioButton eleven = new JRadioButton("11");
		eleven.setBounds(36, 166, 80, 23);
		contentPane.add(eleven);
		
		JRadioButton twelve = new JRadioButton("12");
		twelve.setBounds(132, 166, 80, 23);
		contentPane.add(twelve);
		
		JLabel track = new JLabel("Track");
		track.setBounds(237, 145, 46, 14);
		contentPane.add(track);
		
		JLabel strand = new JLabel("Strand");
		strand.setBounds(447, 145, 46, 14);
		contentPane.add(strand);
		
		cbTrack = new JComboBox<>();
		cbTrack.setBounds(237, 166, 184, 22);
		cbTrack.setModel(new DefaultComboBoxModel<>());
		contentPane.add(cbTrack);
		
		cbStrand = new JComboBox();
		cbStrand.setBounds(447, 166, 187, 22);
		contentPane.add(cbStrand);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(69, 196, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(235, 196, 89, 23);
		contentPane.add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(404, 199, 89, 23);
		contentPane.add(btnDelete);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(565, 199, 89, 23);
		contentPane.add(btnClear);
		
		 
	}
	
	private void createEvent() {
		cbMonth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

		
	});
}
