package Business;

import Entities.Instructor;
import Entities.Student;
import Entities.User;

public class InstructorManager extends UserManager{

	@Override
	public void add(User user, Instructor instructor, Student student) {
		System.out.println(instructor.getName()+" "+instructor.getSurname() +" adlý eðitmen eklendi. ");
	}

	@Override
	public void delete(User user, Instructor instructor, Student student) {
		System.out.println(instructor.getName()+" "+instructor.getSurname() +" adlý eðitmen silindi. ");
	}

	@Override
	public void update(User user, Instructor instructor, Student student) {
		System.out.println(instructor.getName()+" "+instructor.getSurname() +" adlý eðitmen güncellendi. ");
	}



	
	
}
