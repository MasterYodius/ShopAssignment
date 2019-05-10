package models;

public class Admin extends User{

	public Admin(String n, String a, String m, String i, String p) {
		super(n, a, m,i,p);
		
	}
	
	public Admin() {
		
	}
	
	public Product createProduct( String name, double price,int quantity) {
		ModelProduct m1 = new Product(name,price,quantity);
		return (Product) m1;
	}
	
	

}
