package models;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import controllers.ControllerProduct;
import views.ViewProduct;

public class PhoneShop extends Shop{

	
		public void save() {
			// TODO Auto-generated method stub
			try {
				FileOutputStream file = new FileOutputStream("listModels2");
				ObjectOutputStream oos = new ObjectOutputStream(file);
				//System.out.println(this.listeAdherents);
				oos.writeObject(this.getProducts());
				/*for(Adherent a : this.listeAdherents) {
					oos.writeObject(a);
				}*/
				oos.close();
				file.close();
				
			}catch(IOException ioe) {
				ioe.printStackTrace();
			}
			
			try {
				FileOutputStream file = new FileOutputStream("listControllers2");
				ObjectOutputStream oos = new ObjectOutputStream(file);
				//System.out.println(this.listeAdherents);
				oos.writeObject(this.getCP());
				/*for(Adherent a : this.listeAdherents) {
					oos.writeObject(a);
				}*/
				oos.close();
				file.close();
				
			}catch(IOException ioe) {
				ioe.printStackTrace();
			}
			
			try {
				FileOutputStream file = new FileOutputStream("listViews2");
				ObjectOutputStream oos = new ObjectOutputStream(file);
				//System.out.println(this.listeAdherents);
				oos.writeObject(this.getVP());
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
				FileInputStream file = new FileInputStream("listModels2");
				ObjectInputStream ois = new ObjectInputStream(file);
				this.products = (ArrayList<ModelProduct>)ois.readObject();
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
				FileInputStream file = new FileInputStream("listControllers2");
				ObjectInputStream ois = new ObjectInputStream(file);
				this.controllers = (ArrayList<ControllerProduct>)ois.readObject();
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
				FileInputStream file = new FileInputStream("listViews2");
				ObjectInputStream ois = new ObjectInputStream(file);
				this.views = (ArrayList<ViewProduct>)ois.readObject();
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
		
}


