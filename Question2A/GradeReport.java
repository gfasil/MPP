package Assignments.lesson1.Question1;

public class GradeReport {
	private String grade;
	private Student student;
	
	
	GradeReport(Student student){
		
		this.student=student;
		this.grade=null;
		
	}
	
	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public Student getStudent() {
		return student;
	}
	

	@Override
	public String toString() {
		return "GradeReport [grade=" + grade + ", student=" + student + "]";
	}


	

}
