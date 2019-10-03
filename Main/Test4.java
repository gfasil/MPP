package Assignments.lesson1.Test;

import java.util.List;

import Assignments.lesson1.Question4.Section;
import Assignments.lesson1.Question4.Student;
import Assignments.lesson1.Question4.StudentSectionFactory;
import Assignments.lesson1.Question4.Transcript;
import Assignments.lesson1.Question4.TranscriptEntry;


public abstract class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Section sec=StudentSectionFactory.createSection(105, "MPP");
		Section sec1=StudentSectionFactory.createSection(32, "FPP");
		Student fasil=StudentSectionFactory.createStudent("610529", "Fasil");
		StudentSectionFactory.addTranscriptEntry(fasil, sec, "A");
		StudentSectionFactory.addTranscriptEntry(fasil, sec1, "B");
		Student henok=StudentSectionFactory.createStudent("610530", "henok");
		StudentSectionFactory.addTranscriptEntry(henok, sec, "A");
		
	List<TranscriptEntry>	l=sec1.getGradeSheet();
	 int secname=sec1.getSectionNumber();
		System.out.println("section : "+ secname );

	for(TranscriptEntry i:l) {
		
		System.out.print(i.getGrade() +" ");
		
	}
	 String name=fasil.getName();
	System.out.println("\n"+ name +" took the coursres: ");

	
	Transcript fasilt=fasil.getTranscript();
	List<TranscriptEntry> fasilcourses=fasilt.getEntries();
	for(TranscriptEntry i:fasilcourses) {
		Section s=(Section) i.getSection();
		String coursename=s.getCourseName();
		System.out.print(coursename +" ");
		
	}
		System.out.println("\n"+ name +"'s Transcript: ");
		System.out.println("CourseName"+" "+" Secnumber"+ " "+ "Grade");
		for(TranscriptEntry i:fasilcourses) {
			Section s=(Section) i.getSection();
			System.out.println("--"+s.getCourseName()+ "------- "+ s.getSectionNumber()+"------- "+ i.getGrade());
			
		}
		 List<Section> seclist=StudentSectionFactory.getSection();
		 System.out.print("Students who got A ");
		 for(Section s:seclist ) {
			 
			 List<TranscriptEntry>  x=s.getGradeSheet();
			 {
				 for(TranscriptEntry temp:x) {
						String grades=temp.getGrade();
						
						if(grades.equals("A")) {
						System.out.print(temp.getStudent().getName()+" ");
						
					} }
			 }
		 }

	}

}
