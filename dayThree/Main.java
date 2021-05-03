package dayThree;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Gülbahar");
		student1.setLastName("Abazaoğlu");
		student1.setUniversity("Hacettepe University");
		student1.setDepartment("Mathematics");
		student1.setEmail("gulbaharabazaoglu6@gmail.com");
		student1.setPassword("12kdcn3");
		student1.setStudentNumber("125");

		Student student2 = new Student(2, "Medine", "Karaca", "medinekaraca@gmail.com", "hjsdk22", "Ankara University",
				"Nurse", "2354");
		StudentManager studentManager = new StudentManager();
		Student[] students = { student1, student2 };
		studentManager.addMultiple(students);
		studentManager.removeMultiple(students);

		Instructor instructor1 = new Instructor(3, "Engin", "Demiroğ", "engindemirog@gmail.com", "dkcklsds",
				"20 years");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.remove(instructor1);

		UserManager userManager = new UserManager();
		User[] users = { student1, student2, instructor1 };
		userManager.addMultiple(users);

		userManager.removeMultiple(users);

	}

}
