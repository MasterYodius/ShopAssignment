package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import java.util.Vector;

import javax.swing.JLabel;

import models.CarShop;
import models.ModelProduct;
import models.PhoneShop;
import models.ShoesShop;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class RemoveWinView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoveWinView window = new RemoveWinView();
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
	public RemoveWinView(ShoesShop s1, PhoneShop s2, CarShop s3) {
		initialize(s1,s2,s3);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ShoesShop s1, PhoneShop s2, CarShop s3) {
		frame = new JFrame();
		frame.setBounds(100, 100, 543, 282);
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
		
		
		
		
		
		
		JComboBox comboBoxProduct = new JComboBox<String>(products);
		comboBoxProduct.setBounds(121, 70, 292, 22);
		frame.getContentPane().add(comboBoxProduct);
		
		
		JButton deleteButton = new JButton("Remove");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s1.check_already_exist(String.valueOf(comboBoxProduct.getSelectedItem()))) {
					s1.removeProduct(String.valueOf(comboBoxProduct.getSelectedItem()));
					s1.save();
				}
				else if(s2.check_already_exist(String.valueOf(comboBoxProduct.getSelectedItem()))) {
					s2.removeProduct(String.valueOf(comboBoxProduct.getSelectedItem()));
					s2.save();
				}
				else if(s3.check_already_exist(String.valueOf(comboBoxProduct.getSelectedItem()))) {
					s3.removeProduct(String.valueOf(comboBoxProduct.getSelectedItem()));
					s3.save();
				}
				frame.dispose();
			}
		});
		deleteButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		deleteButton.setBounds(130, 131, 113, 48);
		frame.getContentPane().add(deleteButton);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(284, 131, 116, 48);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Select a product");
		lblNewLabel.setFont(new Font("Sitka Small", Font.BOLD, 25));
		lblNewLabel.setBounds(154, 11, 247, 48);
		frame.getContentPane().add(lblNewLabel);
		
		
	}
}
