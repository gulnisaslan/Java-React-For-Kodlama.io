package Business;

import Entities.Instructor;
import Entities.Student;
import Entities.User;

public class UserManager {
	public void add(User user, Instructor instructor,Student student) {
		System.out.println("Kullanýcý eklendi");
	}
	
	public void delete(User user, Instructor instructor,Student student) {
		System.out.println("Kullanýcý silindi");
	}
	
	public void update(User user, Instructor instructor,Student student) {
		System.out.println("Kullanýcý güncellendi");
	}

	
	
	
	

}
