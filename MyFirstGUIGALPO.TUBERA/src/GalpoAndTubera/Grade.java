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
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class Grade extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtName;
    private JTable table;
    private JComboBox cbMIL;
    private JComboBox cbPE;
    private JComboBox cbPS;
    private JComboBox cbIIR;
    private JComboBox cbWork;
    private JComboBox cbJava;
    private JButton btnAdd;
    String[] columnNames = {"Name", "MIL", "P.E", "P.S", "IIR", "Work", "Java"};
    DefaultTableModel tableModel;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Grade frame = new Grade();
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
    public Grade() {
        initComponent();
        createEvent();
    }

    private void initComponent() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 358);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Name");
        lblNewLabel.setBounds(40, 25, 46, 14);
        contentPane.add(lblNewLabel);

        txtName = new JTextField();
        txtName.setBounds(96, 22, 289, 20);
        contentPane.add(txtName);
        txtName.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("MIL");
        lblNewLabel_1.setBounds(40, 60, 46, 14);
        contentPane.add(lblNewLabel_1);

        cbMIL = new JComboBox();
        cbMIL.setModel(new DefaultComboBoxModel(new String[] {"", "below 75", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "88", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100"}));
        cbMIL.setBounds(96, 56, 64, 22);
        contentPane.add(cbMIL);

        JLabel lblNewLabel_1_1 = new JLabel("P.E");
        lblNewLabel_1_1.setBounds(197, 60, 36, 14);
        contentPane.add(lblNewLabel_1_1);

        cbPE = new JComboBox();
        cbPE.setModel(new DefaultComboBoxModel(new String[] {"", "below 75", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "88", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100"}));
        cbPE.setBounds(256, 56, 74, 22);
        contentPane.add(cbPE);

        JLabel lblNewLabel_1_2 = new JLabel("P.S");
        lblNewLabel_1_2.setBounds(40, 93, 46, 14);
        contentPane.add(lblNewLabel_1_2);

        cbPS = new JComboBox();
        cbPS.setModel(new DefaultComboBoxModel(new String[] {"", "below 75", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "88", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100"}));
        cbPS.setBounds(96, 89, 64, 22);
        contentPane.add(cbPS);

        JLabel lblNewLabel_1_3 = new JLabel("IIR");
        lblNewLabel_1_3.setBounds(197, 93, 36, 14);
        contentPane.add(lblNewLabel_1_3);

        cbIIR = new JComboBox();
        cbIIR.setModel(new DefaultComboBoxModel(new String[] {"", "below 75", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "88", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100"}));
        cbIIR.setBounds(256, 89, 74, 22);
        contentPane.add(cbIIR);

        JLabel lblNewLabel_1_2_1 = new JLabel("Work");
        lblNewLabel_1_2_1.setBounds(40, 123, 46, 14);
        contentPane.add(lblNewLabel_1_2_1);

        cbWork = new JComboBox();
        cbWork.setModel(new DefaultComboBoxModel(new String[] {"", "below 75", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "88", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100"}));
        cbWork.setBounds(96, 122, 64, 22);
        contentPane.add(cbWork);

        JLabel lblNewLabel_1_3_1 = new JLabel("Java");
        lblNewLabel_1_3_1.setBounds(197, 123, 36, 14);
        contentPane.add(lblNewLabel_1_3_1);

        cbJava = new JComboBox();
        cbJava.setModel(new DefaultComboBoxModel(new String[] {"", "below 75", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "88", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100"}));
        cbJava.setBounds(256, 119, 74, 22);
        contentPane.add(cbJava);

        btnAdd = new JButton("Add");
        btnAdd.setBounds(177, 177, 89, 23);
        contentPane.add(btnAdd);

        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(columnNames);

        table = new JTable(tableModel);
        table.setBounds(10, 211, 414, 97);
        contentPane.add(table);
    }

    private void createEvent() {
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = txtName.getText();
                String mil = (String) cbMIL.getSelectedItem();
                String pe = (String) cbPE.getSelectedItem();
                String ps = (String) cbPS.getSelectedItem();
                String iir = (String) cbIIR.getSelectedItem();
                String work = (String) cbWork.getSelectedItem();
                String java = (String) cbJava.getSelectedItem();


                if (name.isEmpty() || mil.isEmpty() || pe.isEmpty() || ps.isEmpty() || iir.isEmpty() || work.isEmpty() || java.isEmpty()) {

                    System.out.println("Please fill all the fields.");
                } else {

                    tableModel.addRow(new Object[]{name, mil, pe, ps, iir, work, java});
                }
            }
        });
    }
}
