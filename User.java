package libraryManagementSystem;

public class User{
	
	private int studentId;
	private String studentName;
	private String course;

	public User(int studentId, String studentName, String course) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}
