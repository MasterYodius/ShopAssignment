package views;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;

import controllers.ShopController;
import models.ListOfShops;
import models.Shop;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AllShopsWinView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AllShopsWinView window = new AllShopsWinView();
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
	public AllShopsWinView() {
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
		
		ListOfShops listShops = new ListOfShops();
		listShops.setShop(s1, sv1, sc1);
		listShops.setShop(s2, sv2, sc2);
		listShops.setShop(s3, sv3, sc3);
		
		
		
		
		
		
		
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 555, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton phoneButton = new JButton("");
		phoneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		phoneButton.setIcon(new ImageIcon("C:\\Users\\alex-\\OneDrive\\Bureau\\UML_Assessement\\Shopping\\images\\Mobile-Smartphone-icon.png"));
		phoneButton.setBounds(188, 84, 161, 73);
		
		frame.getContentPane().add(phoneButton);
		
		JButton shoesButton = new JButton("");
		shoesButton.setIcon(new ImageIcon("C:\\Users\\alex-\\OneDrive\\Bureau\\UML_Assessement\\Shopping\\images\\Running-Shoes-icon.png"));
		shoesButton.setBounds(10, 84, 161, 73);
		frame.getContentPane().add(shoesButton);
		
		
		JButton carButton = new JButton("");
		carButton.setIcon(new ImageIcon("C:\\Users\\alex-\\OneDrive\\Bureau\\UML_Assessement\\Shopping\\images\\car-icon.png"));
		carButton.setBounds(365, 84, 161, 73);
		frame.getContentPane().add(carButton);
		
		JLabel labelShoes = new JLabel("Shoes Shop");
		labelShoes.setForeground(new Color(250, 128, 114));
		labelShoes.setFont(new Font("Sitka Small", Font.BOLD, 16));
		labelShoes.setBounds(61, 184, 98, 44);
		frame.getContentPane().add(labelShoes);
		
		JLabel phonelabel = new JLabel("Phone Shop");
		phonelabel.setForeground(new Color(255, 215, 0));
		phonelabel.setFont(new Font("Sitka Small", Font.BOLD, 16));
		phonelabel.setBounds(224, 196, 109, 21);
		frame.getContentPane().add(phonelabel);
		
		JLabel lblNewLabel = new JLabel("Car Shop");
		lblNewLabel.setForeground(new Color(154, 205, 50));
		lblNewLabel.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblNewLabel.setBounds(392, 197, 76, 19);
		frame.getContentPane().add(lblNewLabel);
		frame.setVisible(true);
		
		
	}
}
