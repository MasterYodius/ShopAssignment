package views;

import java.awt.EventQueue;

import javax.swing.JFrame;

import controllers.ShoppingCartController;
import models.ModelProduct;
import models.Product;
import models.ShoppingCart;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.Font;
import java.util.Vector;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShoppingCartWinView {

	private JFrame frame;
	private ShoppingCart model;
	private ShoppingCartController controller;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShoppingCartWinView window = new ShoppingCartWinView();
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
	public ShoppingCartWinView(ShoppingCart m, ShoppingCartController c) {
		this.model = m;
		this.controller = c;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 561, 441);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Vector nameID = new Vector<String>();
		String name = "";
		for(ModelProduct p:this.model.getProducts()) {
			name = p.getName();
			nameID.add(name);
		}
		
		JList listProduct = new JList(nameID);
		listProduct.setBounds(10, 11, 251, 320);
		frame.getContentPane().add(listProduct);
		
		
		
		ShoppingCart m = this.model;
		JButton removeButton = new JButton("Remove");
		removeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//frame.dispose();
				Product p = model.getProduct(String.valueOf(listProduct.getSelectedValue()));
				m.remove(p);
				ShoppingCartWinView nmindow = new ShoppingCartWinView(m, controller);
				frame.dispose();
				//nameID.remove(p.getName());
				
				
			}
		});
		removeButton.setFont(new Font("Sitka Small", Font.BOLD, 16));
		removeButton.setBounds(339, 107, 131, 50);
		frame.getContentPane().add(removeButton);
		
		JButton btnNewButton = new JButton("Buy");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.removeAll();
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Sitka Small", Font.BOLD, 16));
		btnNewButton.setBounds(339, 327, 131, 50);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Total price : ");
		lblNewLabel.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		lblNewLabel.setBounds(20, 342, 110, 21);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPrice = new JLabel("New label");
		lblPrice.setForeground(new Color(220, 20, 60));
		lblPrice.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		lblPrice.setBounds(140, 342, 121, 21);
		lblPrice.setText(String.valueOf(model.totalPrice()));
		frame.getContentPane().add(lblPrice);
		frame.setVisible(true);
	}
}
