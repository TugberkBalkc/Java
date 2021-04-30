
public class InstructorManager extends BaseUserManager<Instructor>{

		//Override
	void add(Instructor user) {
			System.out.println("----------");
			System.out.println
			(user.getFirstName() + " " +user.getLastName()+ " Instructor Added!");
		}
		
		//Override
		void delete(Instructor user) {
			System.out.println("----------");			
			System.out.println
			(user.getFirstName() + " " +user.getLastName()+ " Instructor Deleted!");
		}
		
		void makeAnAnnouncement(Instructor user,String announcement)
		{
			System.out.println("----------");			
			System.out.println
			(announcement + "(Announced By "+ user.getFirstName() + " " +user.getLastName()+ ")");
		}

}
