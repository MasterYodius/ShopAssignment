package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;

//import jdk.nashorn.internal.runtime.ListAdapter;
import models.Admin;
import models.Customer;
import models.ListOfAdmin;
import models.ListOfCustomers;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginWinView {

	private JFrame frame;
	private JTextField textFieldUserId;
	private JTextField textFieldPassword;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginWinView window = new LoginWinView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginWinView() {
		Admin a1 = new Admin("alex", "Paris", "email", "alex","aaa" );
		Customer c1 = new Customer("kevin","Hong Kong","email","kev","azerty");
		
		
		
		ListOfAdmin listA = new ListOfAdmin();
		ListOfCustomers listC = new ListOfCustomers();
		
		
		listA.addAdmin(a1);
		listC.addCustomer(c1);
		
		
		
		initialize(listA,listC);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ListOfAdmin la, ListOfCustomers lc) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblShoppingSite = new JLabel("SHOPPING SITE");
		lblShoppingSite.setFont(new Font("MV Boli", Font.PLAIN, 20));
		panel.add(lblShoppingSite);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblUserid = new JLabel("UserID");
		lblUserid.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUserid.setBounds(71, 56, 63, 14);
		panel_1.add(lblUserid);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(71, 85, 63, 14);
		panel_1.add(lblPassword);
		
		textFieldUserId = new JTextField();
		textFieldUserId.setBounds(162, 55, 110, 20);
		panel_1.add(textFieldUserId);
		textFieldUserId.setColumns(10);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setBounds(162, 84, 110, 20);
		panel_1.add(textFieldPassword);
		textFieldPassword.setColumns(10);
		
		
		
		JLabel test = new JLabel("test");
		test.setBounds(340, 148, 48, 14);
		panel_1.add(test);
		
		
		
		JComboBox comboBoxTypeofUser = new JComboBox();
		comboBoxTypeofUser.setModel(new DefaultComboBoxModel(new String[] {"Customer", "Admin"}));
		comboBoxTypeofUser.setBounds(172, 115, 85, 22);
		panel_1.add(comboBoxTypeofUser);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = textFieldUserId.getText();
				String pass = textFieldPassword.getText();
				
				
				if(comboBoxTypeofUser.getSelectedItem().equals("Admin")) {
					if(la.check_user(user, pass) == true) {
						
						AllShopsWinView secondWin = new AllShopsWinView();
					}
					else {
						test.setText("Error");
					}
				}
				
				else if(comboBoxTypeofUser.getSelectedItem().equals("Customer")) {
					if(lc.check_user(user, pass) == true) {
						
						AllShopsWinView secondWin = new AllShopsWinView();
						
						
					}
					else {
						test.setText("Error");
					}
				}
				
				
				
				
			}
		});
		btnLogin.setBounds(182, 148, 65, 23);
		panel_1.add(btnLogin);
		
		
	}
}
