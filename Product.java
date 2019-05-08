package models;
import java.util.ArrayList;

public class Product implements ModelSubjectProduct{
	
	private int id;
	private String name;
	private double price;
	private int quantity;
	private ArrayList<Observateur> observateurs;
	
	public Product() {
		this.id = 0;
		this.name = "";
		this.price = 0;
		this.quantity = 0;
		this.observateurs = new ArrayList<Observateur>();
		
	}
	
	public Product(int i, String n, double p, int q) {
		this.id = i;
		this.name = n;
		this.price = p;
		this.quantity = q;
		this.observateurs = new ArrayList<Observateur>();
		
	}
	
	@Override
	public void addObserver(Observateur o) {
		// TODO Auto-generated method stub
		this.observateurs.add(o);
	}

	@Override
	public void removeObserver(Observateur o) {
		// TODO Auto-generated method stub
		this.observateurs.remove(o);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(int i = 0; i < this.observateurs.size(); i++) {
			this.observateurs.get(i).update();
		}
		
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public int getQuantity() {
		// TODO Auto-generated method stub
		return this.quantity;
	}

	@Override
	public void updProduct(int nId, String nName, float nPrice, int nQuantity) {
		// TODO Auto-generated method stub
		this.id = nId;
		this.name = nName;
		this.price = nPrice;
		this.quantity = nQuantity;
		
	}
	

	
}
