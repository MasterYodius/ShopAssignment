package controllers;

import java.io.Serializable;

import models.ModelProduct;
import models.ModelSubjectProduct;
import models.Shop;
import views.ViewProduct;
import views.ViewShop;

public class ShopController implements Serializable{
	private Shop model;
	private ViewShop view;
	private static final long serialVersionUID = 1L;

	
	public ShopController(Shop aModel) {
		this.model = aModel;
		//aModel.addObserver(this);
	}
	
	
	public void setView(ViewShop v) {
		// TODO Auto-generated method stub
		this.view = v;
	}
	
	public void addProduct(ModelProduct m, ControllerProduct c, ViewProduct v) {
		System.out.println("IIIIIIIIIt WoOOOOOOOOOOOOrk");
		this.model.getProducts().add(m);
		System.out.println(this.model.getProducts().get(this.model.getProducts().size()-1).getName());
		this.model.getCP().add(c);
		this.model.getVP().add(v);
		//this.activateView();
		for(ModelProduct p:this.model.getProducts()) {
			
			System.out.println(p.getName());
		}
		
		
	}
	
	public void activateView() {
		this.view.displayProducts();
	}
	
	
	
}
