package Business;

import Entities.Instructor;
import Entities.Student;
import Entities.User;

public class UserManager {
	public void add(User user, Instructor instructor,Student student) {
		System.out.println("Kullanıcı eklendi");
	}
	
	public void delete(User user, Instructor instructor,Student student) {
		System.out.println("Kullanıcı silindi");
	}
	
	public void update(User user, Instructor instructor,Student student) {
		System.out.println("Kullanıcı güncellendi");
	}

	
	
	
	

}
