package views;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JFrame;

import controllers.ShopController;
import models.ModelProduct;
import models.Product;
import models.Shop;
import javax.swing.JList;

public class ViewShopGraphInterface {

	private JFrame frame;
	private ShopController controller;
	private Shop model;
	
	

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewShopGraphInterface window = new ViewShopGraphInterface();
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
	public ViewShopGraphInterface(ShopController c, Shop m) {
		
		this.controller = c;
		this.model = m;
		initialize();
		this.frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 695, 456);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		Vector nameID = new Vector<String>();
		String name = "";
		for(ModelProduct p:this.model.getProducts()) {
			name = p.getId() + " " +p.getName();
			nameID.add(name);
		}
		
		JList list = new JList(nameID);
		list.setBounds(344, 36, 313, 357);
		frame.getContentPane().add(list);
	}
}
