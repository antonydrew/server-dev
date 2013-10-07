package com.model.student;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.model.user.User;

public class Student extends User {

	private long stID;

	private String Department;
	
	private Date AdmissionDate;

	private String PayMethod;

	private boolean Immunization;
	
	private List<Student> students = new ArrayList<Student>();
	
	private List<Student_Term> studentss = new ArrayList<Student_Term>();

	public Student(long sid, String dept) {
		stID=sid;Department=dept;
	}

	public long getSID() {
		return stID;
	}

	public void setSID(long stID) {
		this.stID=stID;
	}

	public String getDept() {
		return Department;
	}

	public void setDept(String Department) {
		this.Department=Department;
	}

	public Date getAdDate() {
		return AdmissionDate;
	}

	public void setAdDate(Date AdmissionDate) {
		this.AdmissionDate=AdmissionDate;
	}

	public String getPayAc() {
		return PayMethod;
	}

	public void setPayAc(String PayMethod) {
		this.PayMethod=PayMethod;
	}

	public boolean getImmu() {
		return Immunization;
	}
	
	public List<Student_Term> getStudentss() {
		return studentss;
	}

	public void setStudentss(List<Student_Term> studentss) {
		this.studentss = studentss;
	}
	
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void setImmu(boolean Immunization) {
		this.Immunization=Immunization;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void deleteStudent(Student student) {
		students.remove(student);
	}
	
	public void searchStudent(long SID, Student student) {
		if (SID == student.stID) student.getLastName(); else System.out.println("\tNot a Student\n");
	}
	
	public boolean checkImmu(boolean Immunization) {
		if (Immunization= false)  return true; else return false;			
	}
	
	

}
