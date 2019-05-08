package models;

import java.util.ArrayList;

public class ListOfAdmin {

private ArrayList<Admin> admins;
	
	public ListOfAdmin() {
		this.admins = new ArrayList<Admin>();
	}
	
	public boolean check_user(String userName, String password) {
		boolean res = false;
		boolean idFound = false;
		for(Admin c:this.admins) {
			if(c.getId().equals(userName)) {
				idFound = true;
				break;
			}
		}
		if(idFound == false) {
			return false;
		}
		else if(idFound == true) {
			for(Admin c:this.admins) {
				if(c.getPassword().equals(password)) {
					res = true;
					break;
				}
			}
		}
		return res;
		
	}
	
	public void addAdmin(Admin a) {
		this.admins.add(a);
		
	}
	
}
