package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import controllers.ShopController;
import models.CarShop;
import models.ModelProduct;
import models.PhoneShop;
import models.ShoesShop;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditProductView {

	private JFrame frame;
	private JTextField textFieldname;
	private JTextField textFieldprice;
	private JTextField textFieldquantity;
	private JTextField textFieldid;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditProductView window = new EditProductView();
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
	public EditProductView(ModelProduct p,ShoesShop s1, PhoneShop s2, CarShop s3) {
		initialize(p,s1,s2,s3);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ModelProduct p,ShoesShop s1, PhoneShop s2, CarShop s3) {
		frame = new JFrame();
		frame.setBounds(100, 100, 576, 387);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel productName = new JLabel("label");
		productName.setText(p.getName());
		productName.setBounds(10, 51, 150, 23);
		frame.getContentPane().add(productName);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setText(String.valueOf(p.getPrice()));
		lblPrice.setBounds(191, 55, 48, 14);
		frame.getContentPane().add(lblPrice);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setText(String.valueOf(p.getQuantity()));
		lblQuantity.setBounds(345, 55, 65, 14);
		frame.getContentPane().add(lblQuantity);
		
		JLabel lblId = new JLabel("ID");
		lblId.setText(String.valueOf(p.getId()));
		lblId.setBounds(478, 55, 48, 14);
		frame.getContentPane().add(lblId);
		
		JLabel lblNewLabel_1 = new JLabel("New name");
		lblNewLabel_1.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblNewLabel_1.setBounds(103, 129, 118, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New price");
		lblNewLabel_2.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblNewLabel_2.setBounds(103, 173, 92, 23);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewQuantity = new JLabel("New Quantity");
		lblNewQuantity.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblNewQuantity.setBounds(103, 215, 118, 23);
		frame.getContentPane().add(lblNewQuantity);
		
		JLabel lblNewLabel_3 = new JLabel("New ID");
		lblNewLabel_3.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblNewLabel_3.setBounds(103, 249, 92, 23);
		frame.getContentPane().add(lblNewLabel_3);
		
		textFieldname = new JTextField();
		textFieldname.setBounds(236, 129, 169, 20);
		frame.getContentPane().add(textFieldname);
		textFieldname.setColumns(10);
		
		textFieldprice = new JTextField();
		textFieldprice.setBounds(236, 173, 169, 20);
		frame.getContentPane().add(textFieldprice);
		textFieldprice.setColumns(10);
		
		textFieldquantity = new JTextField();
		textFieldquantity.setText("");
		textFieldquantity.setBounds(237, 215, 168, 20);
		frame.getContentPane().add(textFieldquantity);
		textFieldquantity.setColumns(10);
		
		textFieldid = new JTextField();
		textFieldid.setBounds(236, 249, 169, 20);
		frame.getContentPane().add(textFieldid);
		textFieldid.setColumns(10);
		
		JButton submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(textFieldname.equals("")) && !(textFieldprice.equals("")) && !(textFieldquantity.equals("")) && !(textFieldid.equals(""))) {
					p.updProduct(Integer.parseInt(textFieldid.getText()), textFieldname.getText(),Double.parseDouble(textFieldprice.getText()),Integer.parseInt(textFieldquantity.getText()));
					s1.save();
					s2.save();
					s3.save();
					frame.dispose();
					
				}
			}
		});
		submitButton.setFont(new Font("Sitka Small", Font.BOLD, 16));
		submitButton.setBounds(171, 297, 106, 40);
		frame.getContentPane().add(submitButton);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setFont(new Font("Sitka Small", Font.BOLD, 16));
		cancelButton.setBounds(301, 297, 104, 40);
		frame.getContentPane().add(cancelButton);
		
		JLabel lblPrice_1 = new JLabel("Price :");
		lblPrice_1.setBounds(147, 55, 48, 14);
		frame.getContentPane().add(lblPrice_1);
		
		JLabel lblQuantity_1 = new JLabel("Quantity : ");
		lblQuantity_1.setBounds(276, 55, 59, 14);
		frame.getContentPane().add(lblQuantity_1);
		
		JLabel lblId_1 = new JLabel("ID : ");
		lblId_1.setBounds(420, 55, 48, 14);
		frame.getContentPane().add(lblId_1);
		
		frame.setVisible(true);
	}
}
