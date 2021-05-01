package homework2;

public class Main {

	public static void main(String[] args) {

		Categoryy category1 = new Categoryy();
		category1.id = 10;
		category1.categoryName = "Programlama ";

		Categoryy category2 = new Categoryy();
		category2.id = 20;
		category2.categoryName = "Tümü";

		Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý(C# + ANGULAR)",
				"2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.",
				"Engin Demirog"

		);
		Course course2 = new Course();
		course2.courseNumber = 2;
		course2.courseName = "Yazýlým Geliþtirici Yetiþtirme Kampý(JAVA + REACT)";
		course2.courseDetail = "2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.";
		course2.instructor = "Engin Demirog";

		Course course3 = new Course(3, "Programlamaya Giriþ Ýçin Temel Kurs",
				"PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin.",
				"Engin Demirog"

		);
		Course[] courses = { course1, course2, course3 };

		for (Course course : courses) {

			System.out.println("KURS : " + course.courseName + " / " + "EÐÝTMEN : " + course.instructor);

		}

		CourseManager courseManager = new CourseManager();
		courseManager.join(course1);
		courseManager.join(course2);
		courseManager.join(course3);

	}

}
