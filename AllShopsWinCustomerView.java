package views;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;

import controllers.ControllerProduct;
import controllers.ControllerShoe;
import controllers.ShopController;
import models.CarShop;
import models.ListOfShops;
import models.ModelProduct;
import models.ModelSubjectProduct;
import models.PhoneShop;
import models.Product;
import models.ShoesShop;
import models.Shop;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AllShopsWinCustomerView {

	private JFrame frame;
	//private ListOfShops listShops = new ListOfShops();

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AllShopsWinCustomerView window = new AllShopsWinCustomerView();
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
	public AllShopsWinCustomerView(ShoesShop sShop, PhoneShop pShop, CarShop cShop,ShopController sc1,ShopController sc2,ShopController sc3) {
		
		/*ModelProduct m1 = new Product("test",125,3);
		ControllerProduct c1 = new ControllerShoe((ModelSubjectProduct) m1);
		ViewProduct v1 = new ViewProductText(c1, (ModelSubjectProduct) m1);
		
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
		
		sc1.addProduct(m1, c1, v1);
		sc1.addProduct(m2, c2, v2);
		
		
		
		listShops.setShop(s1, sv1, sc1);
		listShops.setShop(s2, sv2, sc2);
		listShops.setShop(s3, sv3, sc3);
		*/
		
		
		
		
		
		
		
		initialize(sShop,pShop,cShop,sc1,sc2,sc3);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ShoesShop sShop, PhoneShop pShop, CarShop cShop,ShopController sc1,ShopController sc2,ShopController sc3) {
		//listShops.load();
		frame = new JFrame();
		frame.setBounds(100, 100, 555, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton phoneButton = new JButton("");
		phoneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewShopGraphInterface win = new ViewShopGraphInterface(sc2,pShop);
			}
		});
		phoneButton.setIcon(new ImageIcon("C:\\Users\\alex-\\OneDrive\\Bureau\\UML_Assessement\\Shopping\\images\\Mobile-Smartphone-icon.png"));
		phoneButton.setBounds(188, 84, 161, 73);
		
		frame.getContentPane().add(phoneButton);
		
		JButton shoesButton = new JButton("");
		shoesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewShopGraphInterface win = new ViewShopGraphInterface(sc1, sShop);
			}
		});
		shoesButton.setIcon(new ImageIcon("C:\\Users\\alex-\\OneDrive\\Bureau\\UML_Assessement\\Shopping\\images\\Running-Shoes-icon.png"));
		shoesButton.setBounds(10, 84, 161, 73);
		frame.getContentPane().add(shoesButton);
		
		
		JButton carButton = new JButton("");
		carButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewShopGraphInterface win = new ViewShopGraphInterface(sc3, cShop);
			}
		});
		carButton.setIcon(new ImageIcon("C:\\Users\\alex-\\OneDrive\\Bureau\\UML_Assessement\\Shopping\\images\\car-icon.png"));
		carButton.setBounds(365, 84, 161, 73);
		frame.getContentPane().add(carButton);
		
		JLabel labelShoes = new JLabel("Shoes Shop");
		labelShoes.setForeground(new Color(250, 128, 114));
		labelShoes.setFont(new Font("Sitka Small", Font.BOLD, 16));
		labelShoes.setBounds(47, 168, 98, 44);
		frame.getContentPane().add(labelShoes);
		
		JLabel phonelabel = new JLabel("Phone Shop");
		phonelabel.setForeground(new Color(255, 215, 0));
		phonelabel.setFont(new Font("Sitka Small", Font.BOLD, 16));
		phonelabel.setBounds(224, 180, 109, 21);
		frame.getContentPane().add(phonelabel);
		
		JLabel lblNewLabel = new JLabel("Car Shop");
		lblNewLabel.setForeground(new Color(154, 205, 50));
		lblNewLabel.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblNewLabel.setBounds(404, 181, 76, 19);
		frame.getContentPane().add(lblNewLabel);
		
		JButton basketButton = new JButton("");
		basketButton.setIcon(new ImageIcon("C:\\Users\\alex-\\OneDrive\\Bureau\\UML_Assessement\\Shopping\\images\\shopping-basket-icon.png"));
		basketButton.setBounds(216, 213, 117, 73);
		frame.getContentPane().add(basketButton);
		
		JLabel lblYourShoppingCart = new JLabel("Your shopping cart");
		lblYourShoppingCart.setForeground(new Color(0, 0, 0));
		lblYourShoppingCart.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblYourShoppingCart.setBounds(194, 297, 168, 21);
		frame.getContentPane().add(lblYourShoppingCart);
		frame.setVisible(true);
		
		
	}
}
