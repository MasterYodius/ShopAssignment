package models;
import controllers.ControllerProduct;
import controllers.ShoppingCartController;
import views.ViewProduct;

public class Customer extends User{
	
	private ShoppingCart shoppingCart;
	private ShoppingCartController cartController;
	
	public Customer(String n, String a, String m,String i,String p) {
		super(n,a,m,i,p);
		this.shoppingCart = new ShoppingCart();
	}
	
	public void addToCart(ModelProduct p,ControllerProduct c,ViewProduct v) {
		cartController.addProduct(p, c, v);
		
	}

}
