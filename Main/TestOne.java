package Assignments.lesson1.Test;

import Assignments.lesson1.Question1.GradeReport;
import Assignments.lesson1.Question1.Student;

public class TestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student fasil=new Student("Fasil");
		fasil.getReport().setGrade("A");
		GradeReport report=fasil.getReport();
		System.out.println(fasil.getName()+" scored "+report.getGrade());
	}

}
