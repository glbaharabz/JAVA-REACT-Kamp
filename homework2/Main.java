package homework2;

public class Main {

	public static void main(String[] args) {

		Categoryy category1 = new Categoryy();
		category1.id = 10;
		category1.categoryName = "Programlama ";

		Categoryy category2 = new Categoryy();
		category2.id = 20;
		category2.categoryName = "T�m�";

		Course course1 = new Course(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp�(C# + ANGULAR)",
				"2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.",
				"Engin Demirog"

		);
		Course course2 = new Course();
		course2.courseNumber = 2;
		course2.courseName = "Yaz�l�m Geli�tirici Yeti�tirme Kamp�(JAVA + REACT)";
		course2.courseDetail = "2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.";
		course2.instructor = "Engin Demirog";

		Course course3 = new Course(3, "Programlamaya Giri� ��in Temel Kurs",
				"PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin.",
				"Engin Demirog"

		);
		Course[] courses = { course1, course2, course3 };

		for (Course course : courses) {

			System.out.println("KURS : " + course.courseName + " / " + "E��TMEN : " + course.instructor);

		}

		CourseManager courseManager = new CourseManager();
		courseManager.join(course1);
		courseManager.join(course2);
		courseManager.join(course3);

	}

}
