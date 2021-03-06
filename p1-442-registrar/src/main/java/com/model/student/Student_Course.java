package com.model.student;

import java.util.ArrayList;
import java.util.List;

import com.model.course.Course;

public class Student_Course {

	private float MidTerm;

	private float Final;

	private float Total;

	private float GPA;
	
	private int CourseID;

	private Course course;

	private Student student;
	
	private List<Student> studentsss = new ArrayList<Student>();

	public Student_Course(int cid, float mid, float fin, float suma) {
		CourseID=cid;MidTerm=mid;Final=fin;suma=GPA;
	}

	public float getMid() {
		return MidTerm;
	}

	public void setMid(float MidTerm) {
		this.MidTerm=MidTerm;
	}

	public float getFinal() {
		return Final;
	}

	public void setFinal(float Final) {
		this.Final=Final;
	}

	public float getTotal() {
		return Total;
	}

	public void setTotal(float Total) {
		this.Total=Total;
	}
	
	public Course getCourse() {
		return course;
	}

	public void setTotal(Course course) {
		this.course=course;
	}
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student=student;
	}
	
	public List<Student> getStudentsss() {
		return studentsss;
	}

	public void setStudentsss(List<Student> studentsss) {
		this.studentsss = studentsss;
	}

	public float getGPA(int cid, float wgt1, float MidTerm, float wgt2, float Final, float Total) {
		float totals = 0;
		totals = (wgt1*MidTerm+wgt2*Final)/Total;
		return totals;
	}

}
