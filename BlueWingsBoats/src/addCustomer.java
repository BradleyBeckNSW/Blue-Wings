import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class addCustomer extends JFrame {

	private JPanel contentPane;
	private JTextField nameTextField;
	private JTextField addressTextField;
	private JTextField phoneTextField;
	private JTextField emailTextField;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addCustomer frame = new addCustomer();
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
	public addCustomer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBlueWingsSystem = new JLabel("BLUE WINGS SYSTEM");
		lblBlueWingsSystem.setBounds(5, 5, 440, 16);
		lblBlueWingsSystem.setForeground(new Color(0, 0, 128));
		lblBlueWingsSystem.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblBlueWingsSystem);
		
		JLabel lblAddCustom = new JLabel("ADD CUSTOMER");
		lblAddCustom.setBounds(175, 33, 102, 16);
		contentPane.add(lblAddCustom);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setBounds(32, 99, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Address:");
		lblNewLabel_1.setBounds(32, 127, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Phone:");
		lblNewLabel_2.setBounds(32, 155, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email:");
		lblNewLabel_3.setBounds(32, 183, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(105, 94, 130, 26);
		contentPane.add(nameTextField);
		nameTextField.setColumns(10);
		
		addressTextField = new JTextField();
		addressTextField.setBounds(105, 122, 130, 26);
		contentPane.add(addressTextField);
		addressTextField.setColumns(10);
		
		phoneTextField = new JTextField();
		phoneTextField.setBounds(105, 150, 130, 26);
		contentPane.add(phoneTextField);
		phoneTextField.setColumns(10);
		
		emailTextField = new JTextField();
		emailTextField.setBounds(105, 178, 130, 26);
		contentPane.add(emailTextField);
		emailTextField.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Database myDatabase = new Database();
				try {
					
					PreparedStatement insertCustomer = myDatabase.connect().prepareStatement(("insert into customer(name, address, phone, email) VALUES (?, ?, ?, ?)"));
					insertCustomer.setString(1, nameTextField.getText());
					insertCustomer.setString(2, addressTextField.getText());
					insertCustomer.setString(3, phoneTextField.getText());
					insertCustomer.setString(4, emailTextField.getText());
					int update = insertCustomer.executeUpdate();
					if (update > 0) {
						System.out.println("Row inserted.");
						nameTextField.setText("");
						addressTextField.setText("");
						phoneTextField.setText("");
						emailTextField.setText("");
						JOptionPane.showMessageDialog(null, "Customer added successfully.");
					} else {
						JOptionPane.showMessageDialog(null, "Customer can't be added.");
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnAdd.setBounds(327, 94, 117, 29);
		contentPane.add(btnAdd);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBounds(327, 150, 117, 29);
		contentPane.add(btnDelete);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBounds(327, 206, 117, 29);
		contentPane.add(btnExit);
		
		JLabel lblForDeletionOf = new JLabel("FOR DELETION OF CUSTOMER");
		lblForDeletionOf.setBounds(32, 219, 195, 16);
		contentPane.add(lblForDeletionOf);
		
		textField_4 = new JTextField();
		textField_4.setBounds(105, 246, 130, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblCustomerId = new JLabel("Customer ID:");
		lblCustomerId.setBounds(17, 251, 93, 16);
		contentPane.add(lblCustomerId);
	}
}
