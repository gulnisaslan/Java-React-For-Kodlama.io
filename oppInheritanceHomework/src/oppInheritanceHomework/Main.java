package oppInheritanceHomework;

import Business.InstructorManager;
import Entities.Instructor;

public class Main {

	public static void main(String[] args) {
		
		 Instructor instructor = new Instructor();
		 instructor.setId(1);
		 instructor.setName("Gülnisa");
		 instructor.setSurname("Aslan");
		 
		 
		
		 InstructorManager instructorManager = new InstructorManager();
	      instructorManager.add(instructor, instructor,null);
	}

}
