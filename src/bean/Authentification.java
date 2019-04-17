package bean;

public class Authentification {
	private String username;
	private String password;

	public Authentification() {
		this.username = "Antoine";
		this.password = "password";
	}

	
	public boolean checkAuthentification(String username, String password) {
		if(username.equals(this.username) && password.equals(this.password)) {
			return true;
		}
		else {
			return false;
		}
	}
}
