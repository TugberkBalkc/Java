
public class Main {

	public static void main(String[] args) {
			
	Instructor instructor = new Instructor();
	
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroð");
		instructor.setEmail("demirog21@gmail.com");
		instructor.setNationalityId("11122233444");
		instructor.setResume("-Resume-");
		instructor.setUserName("DemirogEngin");
		instructor.setUserPassword("12345");
		instructor.setYearOfBirth(1985);
		String[] givenCourses = {"C# + ANGULAR","JAVA+REACT"};
		instructor.setGivenCourses(givenCourses);
		
	Student student = new Student();
		student.setId(1);
		student.setFirstName("studentFirstName");
		student.setLastName("studentLastName");
		student.setEmail("student@gmail.com");
		student.setNationalityId("22233344555");
		student.setSchoolName("studentsUniversityName");
		student.setUserName("studentsUserName");
		student.setUserPassword("studentsPassword");
		student.setYearOfBirth(1996);
		student.setGradeAverage(3.57);
		
	InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.makeAnAnnouncement(instructor, "Assignment Was Shared");
		instructorManager.delete(instructor);
	StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.joinCourse(student);
		studentManager.delete(student);
	}

}
