package models;

import java.util.ArrayList;

import controllers.ShopController;
import views.ViewShop;

public class ListOfShops {
	
	private ArrayList<Shop> models;
	private ArrayList<ViewShop> views;
	private ArrayList<ShopController> controllers;
	
	public ListOfShops() {
		this.models = new ArrayList<Shop>();
		this.views = new ArrayList<ViewShop>();
		this.controllers = new ArrayList<ShopController>();
	}
	
	public void setShop(Shop m, ViewShop v, ShopController c) {
		this.models.add(m);
	}

}
