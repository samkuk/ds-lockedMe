package lockers;

import java.io.Serializable;

public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public int id;
	public String name;
	public String email;
	public String phone;
	
	public int getId() {
		return id;
	}
	
	public User() {};
	
	public User(int id, String name, String email, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return String.format("Employee [id=%s, name=%s, email=%s, phone=%s]", id, name, email, phone);
	}

}
