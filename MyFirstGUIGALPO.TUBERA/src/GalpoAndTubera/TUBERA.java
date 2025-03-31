package GalpoAndTubera;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class TUBERA extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTable table;
    String[] track = {"", "ABM", "TVL", "Sports", "Academic"};
    String[] strand = {"", "Humms", "ICT", "Stem"};
    String[] status = {"", "Irregular", "Regular"};
    String[] grade = {"", "11", "12"};

    // DefaultTableModel for table
    DefaultTableModel model;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TUBERA frame = new TUBERA();
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
    public TUBERA() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 377);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Name");
        lblNewLabel.setBounds(29, 11, 46, 14);
        contentPane.add(lblNewLabel);

        textField = new JTextField();
        textField.setBounds(104, 8, 86, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Grade");
        lblNewLabel_1.setBounds(29, 47, 46, 14);
        contentPane.add(lblNewLabel_1);

        JComboBox comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "11", "12"}));
        comboBox.setBounds(104, 43, 86, 22);
        contentPane.add(comboBox);

        JComboBox comboBox_1 = new JComboBox(strand);
        comboBox_1.setBounds(104, 83, 86, 22);
        contentPane.add(comboBox_1);

        JLabel lblNewLabel_2 = new JLabel("Strand");
        lblNewLabel_2.setBounds(29, 91, 46, 14);
        contentPane.add(lblNewLabel_2);

        JComboBox comboBox_2 = new JComboBox(track);
        comboBox_2.setBounds(297, 11, 86, 22);
        contentPane.add(comboBox_2);

        JLabel lblNewLabel_3 = new JLabel("Track");
        lblNewLabel_3.setBounds(226, 15, 46, 14);
        contentPane.add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("Status");
        lblNewLabel_4.setBounds(226, 58, 46, 14);
        contentPane.add(lblNewLabel_4);

        JComboBox comboBox_3 = new JComboBox(status);
        comboBox_3.setBounds(297, 54, 86, 22);
        contentPane.add(comboBox_3);

        JButton btnNewButton = new JButton("ADD");
        btnNewButton.setBounds(172, 152, 89, 23);
        contentPane.add(btnNewButton);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 195, 414, 132);
        contentPane.add(scrollPane);

        // Initialize table with column names
        table = new JTable();
        model = new DefaultTableModel(
            new Object[][] {},
            new String[] {"Name", "Grade", "Strand", "Track", "Status"}
        );
        table.setModel(model);  // Set the table model
        scrollPane.setViewportView(table);

        // Action listener for ADD button
        btnNewButton.addActionListener(e -> {
            String name = textField.getText();
            String grade = (String) comboBox.getSelectedItem();
            String strand = (String) comboBox_1.getSelectedItem();
            String track = (String) comboBox_2.getSelectedItem();
            String status = (String) comboBox_3.getSelectedItem();

            // Add new row to the table model
            model.addRow(new Object[]{name, grade, strand, track, status});

            // Clear the text field and reset combo boxes after adding
            textField.setText("");
            comboBox.setSelectedIndex(0);
            comboBox_1.setSelectedIndex(0);
            comboBox_2.setSelectedIndex(0);
            comboBox_3.setSelectedIndex(0);
        });
    }
}
