
public class Student extends User{

		private String schoolName;
		private double gradeAverage;
		
		public Student() {
			
		}
		
		public Student(String schoolName,double gradeAverage) {
			this.schoolName = schoolName;
			this.gradeAverage = gradeAverage;
		}

		public String getSchoolName() {
			return schoolName;
		}

		public void setSchoolName(String schoolName) {
			this.schoolName = schoolName;
		}

		public double getGradeAverage() {
			return gradeAverage;
		}

		public void setGradeAverage(double gradeAverage) {
			this.gradeAverage = gradeAverage;
		}
		
}

