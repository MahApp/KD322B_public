package mah.k3.pfi2.loginproblem;

/**
 * Login description.
 * 
 * @author andreas
 * 
 */
public class Login {
	private int id;
	private String username;
	private String password;

	public Login(int id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}

	/**
	 * Match the credentials, return the id (index in list) if there is a match
	 * or -1 if they don't match.
	 * 
	 * @param username
	 * @param password
	 *
	 */
	public int match(String username, String password) {
		if ((this.username.equals(username)) && this.password.equals(password))
			return id;
		return -1;
	}
}
