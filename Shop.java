package models;

import java.util.ArrayList;

import controllers.ControllerProduct;
import views.ViewProduct;

public class Shop {
	private ArrayList<ModelProduct> products;
	private ArrayList<ViewProduct> views;
	private ArrayList<ControllerProduct> controllers;
	
	public Shop() {
		this.products = new ArrayList<ModelProduct>();
		this.views = new ArrayList<ViewProduct>();
		this.controllers = new ArrayList<ControllerProduct>();
	}
	
	/*public void addProduct(ModelProduct p) {
		this.products.add(p);
	}
	*/
	public ModelProduct getProduct(int i) {
		return this.products.get(i);
	}
	
	public ArrayList<ModelProduct> getProducts(){
		return this.products;
	}
	
	public ArrayList<ControllerProduct> getCP(){
		return this.controllers;
	}
	
	public ArrayList<ViewProduct> getVP(){
		return this.views;
	}
	
	/*public void updShop(ModelProduct m,ViewProduct v,ControllerProduct c) {
		this.products
	}
*/
}
