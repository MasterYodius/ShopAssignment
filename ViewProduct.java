package views;

public interface ViewProduct {
	void displayId();
	void displayName();
	void displayPrice();
	void displayQuantity();
	
	int enterId();
	String enterName();
	float enterPrice();
	int enterQuantity();
	
	void activateView();
	
}
