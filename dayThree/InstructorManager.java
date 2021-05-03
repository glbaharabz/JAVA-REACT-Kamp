package dayThree;

public class InstructorManager extends UserManager {
	public void add(Instructor instructor) {
		System.out.println("Instructor added: " + instructor.getFirstName() + " " + instructor.getLastName());
	}

	public void remove(Instructor instructor) {
		System.out.println("Instructor removed: " + instructor.getFirstName() + " " + instructor.getLastName());
	}

	public void addMultiple(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			add(instructor);
		}
	}

	public void removeMultiple(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			remove(instructor);
		}
	}
}
