package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import controllers.ControllerProduct;
import controllers.ControllerShoe;
import controllers.ShopController;
import models.Admin;
import models.CarShop;
import models.ListOfShops;
import models.ModelProduct;
import models.ModelSubjectProduct;
import models.PhoneShop;
import models.Product;
import models.ShoesShop;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class AddProductView {

	private JFrame frame;
	private JTextField textFieldName;
	private JTextField textFieldPrice;
	private JTextField textFieldQuantity;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddProductView window = new AddProductView();
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
	public AddProductView(ShoesShop sShop, PhoneShop pShop, CarShop cShop,ShopController sc1,ShopController sc2,ShopController sc3, Admin a) {
		
		
		
		
		
		initialize(sShop,pShop,cShop,sc1,sc2,sc3,a);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ShoesShop sShop, PhoneShop pShop, CarShop cShop,ShopController sc1,ShopController sc2,ShopController sc3,Admin a) {
		frame = new JFrame();
		frame.setBounds(100, 100, 559, 423);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAddAProduct = new JLabel("Add a product");
		lblAddAProduct.setFont(new Font("Segoe Script", Font.BOLD, 22));
		lblAddAProduct.setBounds(200, 11, 180, 30);
		frame.getContentPane().add(lblAddAProduct);
		
		JLabel lblSelectAShop = new JLabel("Select a shop");
		lblSelectAShop.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSelectAShop.setBounds(66, 105, 108, 30);
		frame.getContentPane().add(lblSelectAShop);
		
		JComboBox comboBoxShop = new JComboBox();
		comboBoxShop.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBoxShop.setModel(new DefaultComboBoxModel(new String[] {"Shoes Shop", "Phones Shop", "Cars Shop"}));
		comboBoxShop.setBounds(184, 110, 163, 24);
		frame.getContentPane().add(comboBoxShop);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblName.setBounds(126, 161, 48, 14);
		frame.getContentPane().add(lblName);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(184, 158, 163, 20);
		frame.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPrice.setBounds(126, 202, 48, 14);
		frame.getContentPane().add(lblPrice);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setBounds(184, 201, 163, 20);
		frame.getContentPane().add(textFieldPrice);
		textFieldPrice.setColumns(10);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblQuantity.setBounds(104, 241, 70, 24);
		frame.getContentPane().add(lblQuantity);
		
		
		
		JLabel errorQuantity = new JLabel("");
		errorQuantity.setForeground(Color.RED);
		errorQuantity.setBounds(386, 248, 48, 14);
		frame.getContentPane().add(errorQuantity);
		
		JLabel errorPrice = new JLabel("");
		errorPrice.setForeground(Color.RED);
		errorPrice.setBounds(386, 204, 48, 14);
		frame.getContentPane().add(errorPrice);
		
		
		textFieldQuantity = new JTextField();
		textFieldQuantity.setBounds(184, 241, 163, 20);
		frame.getContentPane().add(textFieldQuantity);
		textFieldQuantity.setColumns(10);
		
		JButton submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBoxShop.getSelectedItem().equals("Shoes Shop")) {
					if(sShop.check_already_exist(textFieldName.getText())) {
						sShop.getProduct_by_name(textFieldName.getText()).increaseQuantity(Integer.parseInt(textFieldQuantity.getText()));
					}
					
					else{
						System.out.println("OOOOOOOOOOOOOOOOK");
						ModelProduct m = a.createProduct(textFieldName.getText(), Double.parseDouble(textFieldPrice.getText()), Integer.parseInt(textFieldQuantity.getText()));
						ControllerProduct c = new ControllerShoe((ModelSubjectProduct) m);
						ViewProduct v = new ViewProductText(c, (ModelSubjectProduct) m);
						
						c.setView(v);
						v.activateView();
						
						
						sc1.addProduct(m, c, v);
						//System.out.println(listShops.toString());
						sShop.save();
						//listShops.getController(0).activateView();
						//frame.dispose();
					}
				}
				
				else if(comboBoxShop.getSelectedItem().equals("Phones Shop")) {
					if(pShop.check_already_exist(textFieldName.getText())) {
						pShop.getProduct_by_name(textFieldName.getText()).increaseQuantity(Integer.parseInt(textFieldQuantity.getText()));
					}
					
					else{
						ModelProduct m = a.createProduct(textFieldName.getText(), Double.parseDouble(textFieldPrice.getText()), Integer.parseInt(textFieldQuantity.getText()));
						ControllerProduct c = new ControllerShoe((ModelSubjectProduct) m);
						ViewProduct v = new ViewProductText(c, (ModelSubjectProduct) m);
						
						
						sc2.addProduct(m, c, v);
						pShop.save();
						frame.dispose();
					}
				}
				
				else if(comboBoxShop.getSelectedItem().equals("Cars Shop")) {
					if(cShop.check_already_exist(textFieldName.getText())) {
						cShop.getProduct_by_name(textFieldName.getText()).increaseQuantity(Integer.parseInt(textFieldQuantity.getText()));
					}
					
					else{
						ModelProduct m = a.createProduct(textFieldName.getText(), Double.parseDouble(textFieldPrice.getText()), Integer.parseInt(textFieldQuantity.getText()));
						ControllerProduct c = new ControllerShoe((ModelSubjectProduct) m);
						ViewProduct v = new ViewProductText(c, (ModelSubjectProduct) m);
						
						
						sc3.addProduct(m, c, v);
						cShop.save();
						frame.dispose();
					}
				}
			}
		});
		submitButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		submitButton.setBounds(100, 311, 132, 47);
		frame.getContentPane().add(submitButton);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		cancelButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		cancelButton.setBounds(283, 311, 132, 47);
		frame.getContentPane().add(cancelButton);
		
		
		frame.setVisible(true);
	}
}
