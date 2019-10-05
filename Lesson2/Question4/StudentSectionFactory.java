package Assignments.lesson1.Question4;

import java.util.*;

public class StudentSectionFactory {
	
	private static List<Section> seclist=new ArrayList<>();
	
	public static Section createSection(int secNum, String courseName)
	{
		
		Section s= new Section();
		s.setCourseName(courseName);
		s.setSectionNumber(secNum);
		seclist.add(s);
		return s;
	}
	public static Student createStudent(String id, String name)
	{
		
		Student s= new Student();
		s.setName(name);
		return s;
		
	}
	public static void addTranscriptEntry(Student s, Section sect, String grade) {
		 
		
		TranscriptEntry t=new TranscriptEntry();
			t.setGrade(grade);
			t.setSection(sect);
			t.setStudent(s);
			s.grades.add(t);
			sect.gradeSheet.add(t);
			Transcript t1=new Transcript(s.grades,s); // is this mandatory?
			
			 
		 }
public static List<Section> getSection(){
	
	return seclist;
}
}
