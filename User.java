package models;

public abstract class User {
	
	private String name;
	private String address;
	private String mail;
	private String id;
	private String password;
	
	public User(String n, String a, String m, String i, String p) {
		this.name = n;
		this.address = a;
		this.mail = m;
		this.id = i;
		this.password = p;
		
	}
	
	public User() {
		this.name = "alex";
		this.address = "a";
		this.mail = "m";
		this.id = "alex";
		this.password = "aaa";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
}
