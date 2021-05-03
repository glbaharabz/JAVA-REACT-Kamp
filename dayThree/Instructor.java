package dayThree;

public class Instructor extends User {
	private String experience;

	public Instructor() {

	}

	public Instructor(int id, String firstName, String lastName, String email, String password, String experience) {
		super(id, firstName, lastName, email, password);
		this.experience = experience;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}
}
