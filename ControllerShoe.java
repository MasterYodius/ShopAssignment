package controllers;
import models.ModelProduct;
import models.ModelSubjectProduct;
import models.Observateur;
import views.ViewProduct;

public class ControllerShoe implements Observateur,ControllerProduct{
	
	private ModelProduct model;
	private ViewProduct view;
	
	public ControllerShoe(ModelSubjectProduct aModel) {
		this.model = aModel;
		aModel.addObserver(this);
	}
	
	@Override
	public void setView(ViewProduct v) {
		// TODO Auto-generated method stub
		this.view = v;
	}

	@Override
	public void ManageProduct() {
		// TODO Auto-generated method stub
		int id = this.view.enterId();
		String name = this.view.enterName();
		float price = this.view.enterPrice();
		int quantity = this.view.enterQuantity();
		
		this.model.updProduct(id, name, price, quantity);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
}
