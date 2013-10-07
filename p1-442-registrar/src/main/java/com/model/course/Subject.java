package com.model.course;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private int SubjectID;

	private String Name;

	private String Department;

	private Course course;
	
	private List<Subject> subjects = new ArrayList<Subject>();

	public Subject(int subID, String snam, String dept) {
		SubjectID=subID;Name=snam;Department=dept;
	}

	public int getSubID() {
		return SubjectID;
	}

	public void setSubID(int SubjectID) {
		this.SubjectID=SubjectID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name=Name;
	}

	public String getDept() {
		return Department;
	}

	public void setDept(String Department) {
		this.Department=Department;
	}
	
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course=course;
	}
	
	public List<Subject> getSubject() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	
	public void addSubjects(Subject subject) {
		subjects.add(subject);
	}
	
	public void deleteSubjects(Subject subject) {
		subjects.remove(subject);
	}

}
