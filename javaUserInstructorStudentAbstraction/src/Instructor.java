
public class Instructor extends User {
	
		private String[] givenCourses; 
		private String resume;
	
		public Instructor() {
			
		}
		
		public Instructor(String resume) {
			super();
			this.resume = resume;
		}
		
		public String getResume() {
			return resume;
		}

		public void setResume(String resume) {
			this.resume = resume;
		}
		
		public String[] getGivenCourses() {
			return givenCourses;
		}
		
		public void setGivenCourses(String[] givenCourses) {
			this.givenCourses = givenCourses;
		}
		
		
}
