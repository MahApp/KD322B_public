package mah.k3.pfi2.loginproblem;

import java.util.ArrayList;

/**
 * Handle all logins.
 * 
 * @author andreas
 * 
 */
public class Users {

	private static ArrayList<Login> users = new ArrayList<Login>();

	public Users() {
		/* Create the admin user */
		users.add(new Login(users.size(), "admin", "admin"));
		users.add(new Login(users.size(), "anders", "larm"));
	}

	/**
	 * Used for testing login credentials to the current list of users.
	 * 
	 * @param username
	 * @param password
	 * @return boolean reflecting the result of login
	 */
	public boolean login(String username, String password) {
		int id = -1;
		for (Login l : users) {
			id = l.match(username, password);
			if (id != -1)
				return true;
		}

		return false;
	}
}
