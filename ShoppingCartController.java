package controllers;

import models.ModelProduct;
import models.Product;
import models.ShoppingCart;
import views.ShoppingCartView;
import views.ViewProduct;

public class ShoppingCartController {
	
	private ShoppingCart model;
	private ShoppingCartView view;
	
	public ShoppingCartController(ShoppingCart m) {
		this.model = m;
	}
	
	public void setView(ShoppingCartView v) {
		this.view = v;
		
	}
	
	public void addProduct(ModelProduct m2,ControllerProduct c, ViewProduct v) {
		this.model.updCart(m2, v, c);
		this.view.displayCart();
		
	}

}
