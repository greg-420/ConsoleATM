package pojo;

public class User {
	private String password;
	private String email;
	private String color;

	//1 for password, 2 for email, 3 for color.
	public String getString(int arg){
		if (arg == 1)
			return password;
		if (arg == 2)
			return email;
		if (arg == 3)
			return color;
		System.out.println("getString selection error!");
		return "";
	}
	
	
	public void setString(int arg, String newString){
		if (arg == 1)
			this.password = newString;
		else if (arg == 2)
			this.email = newString;
		else if (arg == 3)
			this.color = newString;
		else System.out.println("setString selection error!");
	}
}
