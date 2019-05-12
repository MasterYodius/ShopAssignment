package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import controllers.ShopController;
import models.Admin;
import models.CarShop;
import models.ListOfShops;
import models.PhoneShop;
import models.ShoesShop;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminHomeView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminHomeView window = new AdminHomeView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the application.
	 */
	public AdminHomeView(ShoesShop sShop, PhoneShop pShop, CarShop cShop,ShopController sc1,ShopController sc2,ShopController sc3,Admin a) {
		initialize(sShop,pShop,cShop,sc1,sc2,sc3,a);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ShoesShop sShop, PhoneShop pShop, CarShop cShop,ShopController sc1,ShopController sc2,ShopController sc3,Admin a) {
		frame = new JFrame();
		frame.setBounds(100, 100, 560, 436);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAdminHomePage = new JLabel("ADMIN HOME PAGE");
		lblAdminHomePage.setFont(new Font("Segoe Script", Font.BOLD, 22));
		lblAdminHomePage.setBounds(138, 11, 255, 42);
		frame.getContentPane().add(lblAdminHomePage);
		
		JButton addButton = new JButton("Add product");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddProductView window = new AddProductView(sShop,pShop,cShop,sc1,sc2,sc3,a);
			}
		});
		addButton.setFont(new Font("Sitka Small", Font.BOLD, 13));
		addButton.setBounds(28, 96, 188, 49);
		frame.getContentPane().add(addButton);
		
		JButton deleteButton = new JButton("Remove a product");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RemoveWinView window = new RemoveWinView(sShop,pShop,cShop);
			}
		});
		deleteButton.setFont(new Font("Sitka Small", Font.BOLD, 13));
		deleteButton.setBounds(28, 167, 188, 49);
		frame.getContentPane().add(deleteButton);
		
		JButton editButton = new JButton("Edit a product");
		editButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditView window = new EditView(sShop, pShop, cShop, sc1, sc2, sc3);
			}
		});
		editButton.setFont(new Font("Sitka Small", Font.BOLD, 13));
		editButton.setBounds(28, 227, 188, 49);
		frame.getContentPane().add(editButton);
		
		JButton logOutButton = new JButton("");
		logOutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//LoginWinView window = new LoginWinView(ListOfShops listShops,Admin a);
				frame.dispose();
			}
		});
		logOutButton.setIcon(new ImageIcon("C:\\Users\\alex-\\OneDrive\\Bureau\\UML_Assessement\\Shopping\\images\\Button-Log-Off-icon.png"));
		logOutButton.setFont(new Font("Sitka Small", Font.BOLD, 13));
		logOutButton.setBounds(28, 287, 188, 76);
		frame.getContentPane().add(logOutButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\alex-\\OneDrive\\Bureau\\UML_Assessement\\Shopping\\images\\Admin-icon.png"));
		lblNewLabel.setBounds(258, 77, 276, 256);
		frame.getContentPane().add(lblNewLabel);
		frame.setVisible(true);
	}
}
