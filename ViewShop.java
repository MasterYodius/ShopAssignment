package views;

import java.io.Serializable;

import controllers.ShopController;
import models.ModelProduct;
import models.Shop;

public class ViewShop implements Serializable{
	
	private ShopController controller;
	private Shop model;
	private static final long serialVersionUID = 1L;

	
	public ViewShop(ShopController c, Shop m) {
		this.controller = c;
		this.model = m;
	}
	
	public void displayProducts() {
		for(ViewProduct v:this.model.getVP()) {
			v.activateView();
			System.out.println("\n");
		}
	}
	
}
