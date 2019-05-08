package views;
import java.util.Scanner;

import controllers.ControllerProduct;
import models.ModelProduct;
import models.ModelSubjectProduct;
import models.Observateur;

public class ViewProductText implements ViewProduct,Observateur{
	
	private ControllerProduct controller;
	private ModelProduct model;
	
	public ViewProductText(ControllerProduct aController, ModelSubjectProduct aModel) {
		// TODO Auto-generated constructor stub
		this.controller = aController;
		this.model = aModel;
		aModel.addObserver(this);
	}
	
	@Override
	public void displayId() {
		// TODO Auto-generated method stub
		System.out.println("ID = "+this.model.getId());
		
	}

	@Override
	public void displayName() {
		// TODO Auto-generated method stub
		System.out.println("Name = "+this.model.getName());
	}

	@Override
	public void displayPrice() {
		// TODO Auto-generated method stub
		System.out.println("Price = "+this.model.getPrice());
	}

	@Override
	public void displayQuantity() {
		// TODO Auto-generated method stub
		System.out.println("Quantity = "+this.model.getQuantity());
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		this.displayId();
		this.displayName();
		this.displayPrice();
		this.displayQuantity();
	}

	@Override
	public int enterId() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ID?");
		int str = sc.nextInt();
		sc.close();
		return str;
		
	}

	@Override
	public String enterName() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Name?");
		String str = sc.nextLine();
		sc.close();
		return str;
	}

	@Override
	public float enterPrice() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Price?");
		float str = sc.nextFloat();
		sc.close();
		return str;
	}

	@Override
	public int enterQuantity() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantity?");
		int str = sc.nextInt();
		sc.close();
		return str;
	}
	
	public void activateView() {
		this.update();
	}



}
