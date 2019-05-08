package controllers;

import models.ModelProduct;
import models.ModelSubjectProduct;
import models.Shop;
import views.ViewProduct;
import views.ViewShop;

public class ShopController {
	private Shop model;
	private ViewShop view;
	
	public ShopController(Shop aModel) {
		this.model = aModel;
		//aModel.addObserver(this);
	}
	
	
	public void setView(ViewShop v) {
		// TODO Auto-generated method stub
		this.view = v;
	}
	
	public void addProduct(ModelProduct m, ControllerProduct c, ViewProduct v) {
		this.model.getProducts().add(m);
		this.model.getCP().add(c);
		this.model.getVP().add(v);
	}
	
	
	
}
