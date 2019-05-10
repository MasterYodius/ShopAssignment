package models;

public interface ModelProduct {
	abstract int getId();
	abstract String getName();
	abstract double getPrice();
	abstract int getQuantity();
	abstract void increaseQuantity(int n);
	
	void updProduct(int nId, String nName, float nPrice, int nQuantity);
	
}
