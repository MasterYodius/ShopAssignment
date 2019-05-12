package views;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JFrame;

import controllers.ControllerProduct;
import controllers.ControllerShoe;
import controllers.ShopController;
import controllers.ShoppingCartController;
import models.ModelProduct;
import models.ModelSubjectProduct;
import models.Product;
import models.Shop;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	public ViewShopGraphInterface(ShopController c, Shop m,ShoppingCartController sc) {
		
		this.controller = c;
		this.model = m;
		initialize(sc,m);
		this.frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ShoppingCartController sc,Shop m) {
		frame = new JFrame();
		frame.setBounds(100, 100, 695, 456);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		Vector nameID = new Vector<String>();
		String name = "";
		for(ModelProduct p:this.model.getProducts()) {
			name = p.getName();
			nameID.add(name);
		}
		
		JList list = new JList(nameID);
		list.setBounds(344, 36, 313, 357);
		frame.getContentPane().add(list);
		
		
		JButton viewProduct = new JButton("Infos");
		viewProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModelProduct p = m.getProduct_by_name(String.valueOf(list.getSelectedValue()));
				ControllerProduct c = new ControllerShoe((ModelSubjectProduct) p);
				ViewProductGraph window = new ViewProductGraph(c, (ModelSubjectProduct) p, sc);
			}
		});
		viewProduct.setFont(new Font("Sitka Small", Font.BOLD, 16));
		viewProduct.setBounds(99, 205, 129, 52);
		frame.getContentPane().add(viewProduct);
	}
}
