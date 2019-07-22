package pojo;

public class User {
	private int id;
	private String password;
	private String email;
	private String color;
	
	int getID(){
		return this.id;
	}
	
	String getString(int arg){
		if (arg == 1)
			return password;
		if (arg == 2)
			return email;
		if (arg == 3)
			return color;
		System.out.println("getString selection error!");
		return "";
	}
	
	void setID(int newID){
		this.id = newID;
	}
	
	void setString(int arg, String newString){
		if (arg == 1)
			this.password = newString;
		if (arg == 2)
			this.email = newString;
		if (arg == 3)
			this.color = newString;
		System.out.println("setString selection error!");
	}
}
