package models;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import controllers.ShopController;
import views.ViewShop;

public class ListOfShops implements Serializable{
	
	private ArrayList<Shop> models;
	private ArrayList<ViewShop> views;
	private ArrayList<ShopController> controllers;
	//private static final long serialVersionUID = 1L;

	
	public ListOfShops() {
		this.models = new ArrayList<Shop>();
		this.views = new ArrayList<ViewShop>();
		this.controllers = new ArrayList<ShopController>();
	}
	
	public void setShop(Shop m, ViewShop v, ShopController c) {
		this.models.add(m);
		this.views.add(v);
		this.controllers.add(c);
	}
	
	public Shop getModel(int i) {
		return this.models.get(i);
	}
	
	public ShopController getController(int i) {
		return this.controllers.get(i);
	}
	
	public void save() {
		
		try {
			FileOutputStream file = new FileOutputStream("listModels");
			ObjectOutputStream oos = new ObjectOutputStream(file);
			//System.out.println(this.listeAdherents);
			oos.writeObject(this.models);
			/*for(Adherent a : this.listeAdherents) {
				oos.writeObject(a);
			}*/
			oos.close();
			file.close();
			
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		try {
			FileOutputStream file = new FileOutputStream("listControllers");
			ObjectOutputStream oos = new ObjectOutputStream(file);
			//System.out.println(this.listeAdherents);
			oos.writeObject(this.controllers);
			/*for(Adherent a : this.listeAdherents) {
				oos.writeObject(a);
			}*/
			oos.close();
			file.close();
			
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		try {
			FileOutputStream file = new FileOutputStream("listViews");
			ObjectOutputStream oos = new ObjectOutputStream(file);
			//System.out.println(this.listeAdherents);
			oos.writeObject(this.views);
			/*for(Adherent a : this.listeAdherents) {
				oos.writeObject(a);
			}*/
			oos.close();
			file.close();
			
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	
	public void load() {
		try {
			FileInputStream file = new FileInputStream("listModels");
			ObjectInputStream ois = new ObjectInputStream(file);
			this.models = (ArrayList<Shop>)ois.readObject();
			ois.close();
			file.close();
		}catch(ClassNotFoundException c){
            System.out.println("Class not found");
            c.printStackTrace();
            return;
         } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileInputStream file = new FileInputStream("listControllers");
			ObjectInputStream ois = new ObjectInputStream(file);
			this.controllers = (ArrayList<ShopController>)ois.readObject();
			ois.close();
			file.close();
		}catch(ClassNotFoundException c){
            System.out.println("Class not found");
            c.printStackTrace();
            return;
         } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileInputStream file = new FileInputStream("listViews");
			ObjectInputStream ois = new ObjectInputStream(file);
			this.views = (ArrayList<ViewShop>)ois.readObject();
			ois.close();
			file.close();
		}catch(ClassNotFoundException c){
            System.out.println("Class not found");
            c.printStackTrace();
            return;
         } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String toString() {
		String s = "";
		for(ModelProduct p:this.models.get(0).getProducts()) {
			s = s+p.getName()+"\n";
		}
		return s;
	}

}
