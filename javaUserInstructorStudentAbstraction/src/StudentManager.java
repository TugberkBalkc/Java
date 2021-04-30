
public class StudentManager extends BaseUserManager<Student> {

		//Override
		void add(Student user) {
			System.out.println("----------");			
			System.out.println
			(user.getFirstName() + " " +user.getLastName()+ " Student Added!");
		}
		
		//Override
		void delete(Student user) {
			System.out.println("----------");			
			System.out.println
			(user.getFirstName() + " " +user.getLastName()+ " Student Deleted!");
		}
		
		void joinCourse(Student student) {
			System.out.println("----------");
			System.out.println(student.getFirstName() + " " + student.getLastName() + "Has Joined The Course!");
		}
}
