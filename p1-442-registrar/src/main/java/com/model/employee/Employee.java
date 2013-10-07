package com.model.employee;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.model.user.User;

public class Employee extends User {

	private long EmployeeID;

	private Date HireDate;
	
	private List<Employee> employees = new ArrayList<Employee>();

	public Employee() {};
	
	public long getEmpID() {
		return EmployeeID;
	}

	public void setEmpID(long EmployeeID) {
		this.EmployeeID=EmployeeID;
	}

	public Date getHireDate() {
		return HireDate;
	}

	public void setHireDate(Date HireDate) {
		this.HireDate=HireDate;
	}
	
	public List<Employee> getEmployeeCat() {
		return employees;
	}

	public void setEmployeeCat(List<Employee> employees) {
		this.employees = employees;
	}
	
	public void addEmployees(Employee employee) {
		employees.add(employee);
	}
	
	public void deleteEmployees(Employee employee) {
		employees.remove(employee);
	}

}
