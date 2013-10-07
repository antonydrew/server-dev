package com.model.course;
import java.util.ArrayList;
import java.util.List;

import com.model.employee.Teacher;
import com.model.student.Student_Course;
import com.model.student.Student_Term;

public class Course {

	private int CourseID;

	private int Term;
	
	private long RegistrarID;
	
	private long TeacherID;

	private int Year;

	private String Time;

	private int Credits;
	
	private String Description;
	
	private List<Course> coursecatalog = new ArrayList<Course>();

	private List<Student_Course> studentcourses = new ArrayList<Student_Course>();

	private List<Subject> subjectss = new ArrayList<Subject>();

	private List<Teacher> teacherss = new ArrayList<Teacher>();
	
	private List<Student_Term> terms = new ArrayList<Student_Term>();

	public Course(long regid, int cid, long tid, int turm, int yr, String tme, int units, String des) {
		RegistrarID=regid;CourseID=cid;TeacherID=tid;Term=turm;Year=yr;Time=tme;Credits=units;Description=des;
	}

	public long getRegID() {
		return RegistrarID;
	}

	public void setRegID(long RegistrarID) {
		this.RegistrarID=RegistrarID;
	}
		
	public long getTeachID() {
		return TeacherID;
	}

	public void setTeachID(long TeacherID) {
		this.TeacherID=TeacherID;
	}
	
	public int getCourseID() {
		return CourseID;
	}

	public void setCourseID(int CourseID) {
		this.CourseID=CourseID;
	}

	public int getTerm() {
		return Term;
	}

	public void setTerm(int Term) {
		this.Term=Term;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int Year) {
		this.Year=Year;
	}

	public String getTime() {
		return Time;
	}

	public void setTime(String Time) {
		this.Time=Time;
	}

	public String getDes() {
		return Description;
	}

	public void setDes(String Description) {
		this.Description=Description;
	}
	
	public int getUnits() {
		return Credits;
	}

	public void setUnits(int Credits) {
		this.Credits=Credits;
	}
	
	public List<Course> getCourseCat() {
		return coursecatalog;
	}

	public void setCourseCat(List<Course> coursecatalog) {
		this.coursecatalog = coursecatalog;
	}
	
	public List<Student_Course> getStudentCat() {
		return studentcourses;
	}

	public void setStudentCat(List<Student_Course> studentcourses) {
		this.studentcourses = studentcourses;
	}
	
	public List<Teacher> getTeacherCat() {
		return teacherss;
	}

	public void setTeacherCat(List<Teacher> teacherss) {
		this.teacherss = teacherss;
	}
	
	public List<Subject> getSubjectCat() {
		return subjectss;
	}

	public void setSubjectCat(List<Subject> subjectss) {
		this.subjectss = subjectss;
	}
	
	public List<Student_Term> getStudentTerms() {
		return terms;
	}

	public void setStudentTerms(List<Student_Term> terms) {
		this.terms = terms;
	}
	
	public void addCourses(Course course) {
		coursecatalog.add(course);
	}
	
	public void deleteCourses(Course course) {
		coursecatalog.remove(course);
	}	
	
	public void addStudentTerm(Student_Term term) {
		terms.add(term);
	}
	
	public boolean checkMinEnroll(int CourseID) {
		if (getCourseTotNumOfCredits(CourseID) < 3) return false; else return true;
	}
	
	public int getCourseTotNumOfCredits(int CourseID) {
		int NumOfCredits = 0; 
		for (Student_Term line : terms) {
			NumOfCredits += line.getCourseCredits(CourseID);
		}
		return NumOfCredits;
	}
	
	public void getCourseRoster(int CourseID) {
		for (Student_Term line : terms) {
			if (CourseID == line.getCourseCredits(CourseID)) System.out.println(line.getLname());
		}
	}
	
}
