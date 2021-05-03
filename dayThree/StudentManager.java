package dayThree;

public class StudentManager extends UserManager {

	public void add(Student student) {
		System.out.println("Student added: " + student.getFirstName() + " " + student.getLastName());
	}

	public void remove(Student student) {
		System.out.println("Student removed: " + student.getFirstName() + " " + student.getLastName());
	}

	public void addMultiple(Student[] students) {
		for (Student student : students) {
			add(student);
		}
	}

	public void removeMultiple(Student[] students) {
		for (Student student : students) {
			remove(student);
		}
	}

}
