package views;

import controllers.ShopController;
import models.ModelProduct;
import models.Shop;

public class ViewShop {
	
	private ShopController controller;
	private Shop model;
	
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
