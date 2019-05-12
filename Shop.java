package models;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import controllers.ControllerProduct;
import views.ViewProduct;

public abstract class Shop implements Serializable{
	protected ArrayList<ModelProduct> products;
	protected ArrayList<ViewProduct> views;
	protected ArrayList<ControllerProduct> controllers;
	//private static final long serialVersionUID = 1L;

	
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
	
	public ModelProduct getProduct_by_name(String name) {
		ModelProduct res = null;
		for(ModelProduct p:this.getProducts()) {
			if(p.getName().equals(name)) {
				res = p;
				break;
			}
		}
		return res;
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
	
	public boolean check_already_exist(String name) {
		boolean res = false;
		for(ModelProduct p:this.products) {
			if(p.getName().equals(name)){
				res = true;
				break;
			}
		}
		return res;
	}
	
	public void addProduct(ModelProduct m, ControllerProduct c, ViewProduct v) {
		this.products.add(m);
		this.controllers.add(c);
		this.views.add(v);
	}
	
	public void removeProduct(String name) {
		int i = 0;
		for(ModelProduct p:this.products) {
			if(p.getName().equals(name)) {
				break;
			}
			i++;
		}
		this.products.remove(i);
		this.controllers.remove(i);
		this.views.remove(i);
	}
	
	
public abstract void save();
public abstract void load();
	
	
	
	/*public void updShop(ModelProduct m,ViewProduct v,ControllerProduct c) {
		this.products
	}
*/
}
