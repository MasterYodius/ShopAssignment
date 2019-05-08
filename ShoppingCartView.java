package views;

import controllers.ShoppingCartController;
import models.Product;
import models.ShoppingCart;

public class ShoppingCartView {
	
	private ShoppingCart model;
	private ShoppingCartController controller;
	
	public ShoppingCartView(ShoppingCart m, ShoppingCartController c) {
		this.model = m;
		this.controller = c;
	}
	
	public void displayCart() {
		for(ViewProduct v:this.model.getViewsProduct()) {
			v.activateView();
			System.out.println("\n");
			
		}
	}

}
