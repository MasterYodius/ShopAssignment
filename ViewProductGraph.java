package views;

import java.awt.EventQueue;
import java.io.Serializable;

import javax.swing.JFrame;

import controllers.ControllerProduct;
import controllers.ShoppingCartController;
import models.ModelProduct;
import models.ModelSubjectProduct;
import models.Observateur;
import models.ShoppingCart;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewProductGraph implements ViewProduct,Observateur,Serializable{

	private JFrame frame;
	private ControllerProduct controller;
	private ModelProduct model;
	ShoppingCartController shoppinCart;
	private static final long serialVersionUID = 1L;

	
	public ViewProductGraph(ControllerProduct aController, ModelSubjectProduct aModel, ShoppingCartController sc) {
		this.controller = aController;
		this.model = aModel;
		aModel.addObserver(this);
		this.shoppinCart = sc;
		this.initialise( sc);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	@Override
	public void displayId() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayPrice() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayQuantity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int enterId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String enterName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float enterPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int enterQuantity() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void initialise(ShoppingCartController sc) {
		// TODO Auto-generated method stub
		frame = new JFrame();
		frame.setBounds(100, 100, 579, 432);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblId = new JLabel("ID : ");
		lblId.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblId.setBounds(96, 94, 68, 31);
		frame.getContentPane().add(lblId);
		
		JLabel lblNamz = new JLabel("Name : ");
		lblNamz.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblNamz.setBounds(96, 151, 68, 21);
		frame.getContentPane().add(lblNamz);
		
		JLabel lblNewLabel = new JLabel("Price : ");
		lblNewLabel.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblNewLabel.setBounds(96, 197, 68, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Quantity : ");
		lblNewLabel_1.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblNewLabel_1.setBounds(96, 249, 91, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel id = new JLabel("New label");
		id.setText(String.valueOf(this.model.getId()));
		id.setFont(new Font("Tahoma", Font.PLAIN, 16));
		id.setBounds(212, 96, 209, 24);
		frame.getContentPane().add(id);
		
		JLabel name = new JLabel("New label");
		name.setText(this.model.getName());
		name.setFont(new Font("Tahoma", Font.PLAIN, 16));
		name.setBounds(212, 146, 209, 24);
		frame.getContentPane().add(name);
		
		JLabel price = new JLabel("New label");
		price.setText(String.valueOf(this.model.getPrice()));
		price.setFont(new Font("Tahoma", Font.PLAIN, 16));
		price.setBounds(212, 197, 209, 24);
		frame.getContentPane().add(price);
		
		JLabel quantity = new JLabel("New label");
		quantity.setText(String.valueOf(this.model.getQuantity()));
		quantity.setFont(new Font("Tahoma", Font.PLAIN, 16));
		quantity.setBounds(212, 249, 209, 24);
		frame.getContentPane().add(quantity);
		ViewProduct v = this;
		
		JButton addCart = new JButton("");
		addCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sc.addProduct(model, controller, v);
				frame.dispose();
			}
		});
		addCart.setIcon(new ImageIcon("C:\\Users\\alex-\\OneDrive\\Bureau\\UML_Assessement\\Shopping\\images\\shopping-basket-icon.png"));
		addCart.setBounds(96, 301, 173, 66);
		frame.getContentPane().add(addCart);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setFont(new Font("Sitka Small", Font.BOLD, 16));
		cancelButton.setBounds(289, 301, 173, 66);
		frame.getContentPane().add(cancelButton);
		frame.setVisible(true);
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void activateView() {
		// TODO Auto-generated method stub
		
		
	}

	

}
