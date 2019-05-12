package models;

import java.util.ArrayList;

import controllers.ControllerProduct;
import controllers.ShoppingCartController;
import views.ViewProduct;

public class ShoppingCart {
	
	private ArrayList<Product> products;
	private ArrayList<ViewProduct> views;
	private ArrayList<ControllerProduct> controllersProduct;
	
	
	
	public ShoppingCart() {
		this.products = new ArrayList<Product>();
		this.views = new ArrayList<ViewProduct>();
		this.controllersProduct = new ArrayList<ControllerProduct>();
	}
	
	public ArrayList<Product> getProducts(){
		return this.products;
	}
	
	public ArrayList<ViewProduct> getViewsProduct(){
		return this.views;
	}
	
	public Product getProduct(String name) {
		Product res = null;
		for(Product p:this.products) {
			if(p.getName().equals(name)) {
				res = p;
				break;
			}
		}
		return res;
	}
	
	public void updCart(ModelProduct m2, ViewProduct v, ControllerProduct c) {
		this.products.add((Product) m2);
		this.views.add(v);
		this.controllersProduct.add(c);
		
	}
	
	public void remove(Product p) {
		//int i = 0;
		this.products.remove(p);
		
	}
	
	public void removeAll() {
		this.products.clear();
	}
	
	public double totalPrice() {
		double sum = 0;
		for(Product p:products) {
			sum += p.getPrice();
		}
		return sum;
	}

}
