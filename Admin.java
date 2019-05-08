package models;

public class Admin extends User{

	public Admin(String n, String a, String m, String i, String p) {
		super(n, a, m,i,p);
		
	}
	
	public Product createProduct(int id, String name, double price,int quantity) {
		ModelProduct m1 = new Product(id,name,price,quantity);
		return (Product) m1;
	}
	
	

}
