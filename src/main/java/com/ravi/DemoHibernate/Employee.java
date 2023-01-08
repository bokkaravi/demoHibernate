package com.ravi.DemoHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int id;
	
	private String empName;
	
	private String dept;
	
	public Employee() {
		
	}
	
	public Employee(int id, String empName, String dept) {
		super();
		this.id = id;
		this.empName = empName;
		this.dept = dept;
	}
	
	public int getId() {
		return id;
	}
	public String getEmpName() {
		return empName;
	}
	public String getDept() {
		return dept;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", dept=" + dept + "]";
	}
	
	
	

}
