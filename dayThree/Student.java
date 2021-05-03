package dayThree;

public class Student extends User{
	
	private String studentNumber;
	private String university;
	private String department;
	public Student () {
		
	}
	
	public Student(int id, String firstName, String lastName, String email, String password, String university,
			String department,String studentNumber) {
		super(id, firstName, lastName, email, password);
		this.university = university;
		this.department = department;
		this.studentNumber = studentNumber;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	

	
}
