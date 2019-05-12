package controllers;

import models.ModelProduct;
import models.Product;
import models.ShoppingCart;

import views.ShoppingCartWinView;
import views.ViewProduct;

public class ShoppingCartController {
	
	private ShoppingCart model;
	private ShoppingCartWinView view;
	
	public ShoppingCartController(ShoppingCart m) {
		this.model = m;
	}
	
	public void setView(ShoppingCartWinView v) {
		this.view = v;
		
	}
	
	public void addProduct(ModelProduct m2,ControllerProduct c, ViewProduct v) {
		this.model.updCart(m2, v, c);
		//this.view.displayCart();
		
	}
	
	

}
