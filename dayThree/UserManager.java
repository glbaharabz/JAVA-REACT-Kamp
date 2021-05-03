package dayThree;

public class UserManager {
	public void add(User user) {
		System.out.println("user added: " + user.getFirstName() + " " + user.getLastName());
	}

	public void remove(User user) {
		System.out.println("user removed: " + user.getFirstName() + " " + user.getLastName());
	}

	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}

	public void removeMultiple(User[] users) {
		for (User user : users) {
			remove(user);
		}
	}
}
