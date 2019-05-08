package models;

public interface Subject {
	void addObserver(Observateur o);
	void removeObserver(Observateur o);
	void notifyObserver();
}
