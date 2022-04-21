package Business;

import Entities.Instructor;
import Entities.Student;
import Entities.User;

public class StudentManager extends UserManager {

	@Override
	public void add(User user, Instructor instructor, Student student) {
		System.out.println(student.getName()+" "+student.getSurname() +" adlı öğrenci eklendi. ");
	}

	@Override
	public void delete(User user, Instructor instructor, Student student) {
		System.out.println(student.getName()+" "+student.getSurname() +" adlı öğrenci silindi. ");
	}

	@Override
	public void update(User user, Instructor instructor, Student student) {
		System.out.println(student.getName()+" "+student.getSurname() +" adlı öğrenci güncellendi. ");
	}

	


	
    
}
