package homework2;

public class Main {

	public static void main(String[] args) {

		Categoryy category1 = new Categoryy();
		category1.id = 10;
		category1.categoryName = "Programlama ";

		Categoryy category2 = new Categoryy();
		category2.id = 20;
		category2.categoryName = "Tümü";

		Course course1 = new Course(1, "Yazılım Geliştirici Yetiştirme Kampı(C# + ANGULAR)",
				"2 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.",
				"Engin Demirog"

		);
		Course course2 = new Course();
		course2.courseNumber = 2;
		course2.courseName = "Yazılım Geliştirici Yetiştirme Kampı(JAVA + REACT)";
		course2.courseDetail = "2 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.";
		course2.instructor = "Engin Demirog";

		Course course3 = new Course(3, "Programlamaya Giriş için Temel Kurs",
				"PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantığını anlaşılır örneklerle öğrenin.",
				"Engin Demirog"

		);
		Course[] courses = { course1, course2, course3 };

		for (Course course : courses) {

			System.out.println("KURS : " + course.courseName + " / " + "EĞİTMEN : " + course.instructor);

		}

		CourseManager courseManager = new CourseManager();
		courseManager.join(course1);
		courseManager.join(course2);
		courseManager.join(course3);

	}

}
