package models;

public interface ModelProduct {
	abstract int getId();
	abstract String getName();
	abstract double getPrice();
	abstract int getQuantity();
	
	void updProduct(int nId, String nName, float nPrice, int nQuantity);
	
}
