package com.model.employee;
import java.util.ArrayList;
import java.util.List;

import com.model.course.Course;


public class Teacher extends Employee {
	
	private long TeacherID;

	private String Title;

	private String Department;

	private Course course;
	
	private List<Teacher> teachers = new ArrayList<Teacher>();

	public Teacher(long tid, String tit, String dept) {
		TeacherID=tid;Title=tit;Department=dept;
	}

	public long getTeacherID() {
		return TeacherID;
	}

	public void setTeacherID(long TeacherID) {
		this.TeacherID=TeacherID;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String Title) {
		this.Title=Title;
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
	
	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	
	public void addSubjects(Teacher teacher) {
		teachers.add(teacher);
	}
	
	public void deleteSubjects(Teacher teacher) {
		teachers.remove(teacher);
	}
	
	
}
