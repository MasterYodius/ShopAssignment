package views;

import java.awt.EventQueue;

import javax.swing.JFrame;

import controllers.ShopController;
import models.CarShop;
import models.ModelProduct;
import models.PhoneShop;
import models.ShoesShop;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import java.util.Vector;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditView window = new EditView();
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
	public EditView(ShoesShop s1, PhoneShop s2, CarShop s3,ShopController sc1,ShopController sc2,ShopController sc3) {
		initialize(s1,s2,s3,sc1,sc2,sc3);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ShoesShop s1, PhoneShop s2, CarShop s3,ShopController sc1,ShopController sc2,ShopController sc3) {
		frame = new JFrame();
		frame.setBounds(100, 100, 454, 314);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		Vector products = new Vector<String>();
		frame.setVisible(true);
		
		
			
			for(ModelProduct p:s1.getProducts()) {
				products.add( p.getName());
			}
			for(ModelProduct p:s2.getProducts()) {
				products.add( p.getName());
			}
			for(ModelProduct p:s3.getProducts()) {
				products.add( p.getName());
			}
		
		
		
		JComboBox comboBox = new JComboBox<String>(products);
		comboBox.setBounds(85, 54, 264, 22);
		frame.getContentPane().add(comboBox);
		
		JButton selectButton = new JButton("Select");
		selectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ModelProduct p = null; 
				if(s1.check_already_exist(String.valueOf(comboBox.getSelectedItem()))){
					p = s1.getProduct_by_name(String.valueOf(comboBox.getSelectedItem()));
				}
				else if(s2.check_already_exist(String.valueOf(comboBox.getSelectedItem()))) {
					p = s2.getProduct_by_name(String.valueOf(comboBox.getSelectedItem()));
				}
				else if(s3.check_already_exist(String.valueOf(comboBox.getSelectedItem()))) {
					p = s3.getProduct_by_name(String.valueOf(comboBox.getSelectedItem()));
				}
				
				
				
				
				EditProductView window = new EditProductView(p,s1,s2,s3);
			}
		});
		selectButton.setFont(new Font("Sitka Small", Font.BOLD, 16));
		selectButton.setBounds(85, 143, 109, 36);
		frame.getContentPane().add(selectButton);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.setFont(new Font("Sitka Small", Font.BOLD, 16));
		btnNewButton.setBounds(242, 143, 109, 36);
		frame.getContentPane().add(btnNewButton);
	}

}
