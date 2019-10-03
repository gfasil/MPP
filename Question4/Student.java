package Assignments.lesson1.Question4;

import java.util.*;

public class Student {
	String name;
	List<TranscriptEntry> grades=new ArrayList<>();
	
	public Transcript getTranscript() {
		return new Transcript(grades, this);
		
	}

	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public List<TranscriptEntry> getGrades() {
		return grades;
	}

	Student() {
		
	}
	
	
}
