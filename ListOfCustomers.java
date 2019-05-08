package models;

import java.util.ArrayList;

public class ListOfCustomers {
	private ArrayList<Customer> customers;
	
	public ListOfCustomers() {
		this.customers = new ArrayList<Customer>();
	}
	
	public boolean check_user(String userName, String password) {
		boolean res = false;
		boolean idFound = false;
		for(Customer c:this.customers) {
			if(c.getId().equals(userName)) {
				idFound = true;
				break;
			}
		}
		if(idFound == false) {
			return false;
		}
		else if(idFound == true) {
			for(Customer c:this.customers) {
				if(c.getPassword().equals(password)) {
					res = true;
					break;
				}
			}
		}
		return res;
		
	}
	
	public void addCustomer(Customer c) {
		this.customers.add(c);
	}

}
