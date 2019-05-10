package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;

import controllers.ControllerProduct;
import controllers.ControllerShoe;
import controllers.ShopController;
//import jdk.nashorn.internal.runtime.ListAdapter;
import models.Admin;
import models.CarShop;
import models.Customer;
import models.ListOfAdmin;
import models.ListOfCustomers;
import models.ListOfShops;
import models.ModelProduct;
import models.ModelSubjectProduct;
import models.PhoneShop;
import models.Product;
import models.ShoesShop;
import models.Shop;

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
	/*public static void main(String[] args) {
		
		
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
	}*/

	/**
	 * Create the application.
	 */
	public LoginWinView(ShoesShop sShop, PhoneShop pShop, CarShop cShop, ListOfAdmin listA, ListOfCustomers listC,ShopController sc1,ShopController sc2,ShopController sc3) {
		
		
		
		
		/*ListOfAdmin listA = new ListOfAdmin();
		ListOfCustomers listC = new ListOfCustomers();
		
		
		listA.addAdmin(a1);
		listC.addCustomer(c1);
		
		
		ModelProduct m1 = new Product("test",125,3);
		ControllerProduct cp1 = new ControllerShoe((ModelSubjectProduct) m1);
		ViewProduct v1 = new ViewProductText(cp1, (ModelSubjectProduct) m1);
		
		ModelProduct m2 = new Product( "test2", 500, 2);
		ControllerProduct c2 = new ControllerShoe((ModelSubjectProduct) m2);
		ViewProduct v2 = new ViewProductText(c2, (ModelSubjectProduct) m2);
		
		
		
		Shop s1 = new Shop();
		ShopController sc1 = new ShopController(s1);
		ViewShop sv1 = new ViewShop(sc1, s1);
		sc1.setView(sv1);
		
		Shop s2 = new Shop();
		ShopController sc2 = new ShopController(s2);
		ViewShop sv2 = new ViewShop(sc2, s2);
		sc2.setView(sv2);
		
		Shop s3 = new Shop();
		ShopController sc3 = new ShopController(s3);
		ViewShop sv3 = new ViewShop(sc1, s3);
		sc1.setView(sv3);
		
		sc1.addProduct(m1, cp1, v1);
		sc1.addProduct(m2, c2, v2);
		
		
		
		listShops.setShop(s1, sv1, sc1);
		listShops.setShop(s2, sv2, sc2);
		listShops.setShop(s3, sv3, sc3);
		*/
		
		
		
		initialize(listA,listC,sShop,pShop,cShop,sc1,sc2,sc3);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ListOfAdmin la, ListOfCustomers lc,ShoesShop sShop, PhoneShop pShop, CarShop cShop,ShopController sc1,ShopController sc2,ShopController sc3) {
		
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
						
						//AllShopsWinCustomerView secondWin = new AllShopsWinCustomerView();
						Admin a = new Admin();
						AdminHomeView window = new AdminHomeView( sShop,pShop,cShop,sc1,sc2,sc3,a);
						frame.dispose();
					}
					else {
						test.setText("Error");
					}
				}
				
				else if(comboBoxTypeofUser.getSelectedItem().equals("Customer")) {
					if(lc.check_user(user, pass) == true) {
						
						AllShopsWinCustomerView secondWin = new AllShopsWinCustomerView( sShop,pShop,cShop,sc1,sc2,sc3);
						frame.dispose();
						
						
					}
					else {
						test.setText("Error");
					}
				}
				
				
				
				
			}
		});
		btnLogin.setBounds(182, 148, 65, 23);
		panel_1.add(btnLogin);
		frame.setVisible(true);
		
		
	}
}
