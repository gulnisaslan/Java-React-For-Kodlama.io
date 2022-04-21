package Entities;

public class Student extends User{
	  private String name;
	  private String surname;
	  private int courseId;
	  private String courseName;
	  
	  public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String surname, int courseId, String courseName) {
		super();
		this.name = name;
		this.surname = surname;
		this.courseId = courseId;
		this.courseName = courseName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
}
