package com.training;

import com.mongodb.BasicDBObject;

public class Employee extends BasicDBObject {
 
	private int empid;
	private String empnm;
	
	
	public Employee() {
		
	}
	
	
	
	public Employee(int empid, String empnm) {
		super();
		this.empid = empid;
		this.empnm = empnm;
	}
	
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.put("empid", empid);
		this.empid = empid;
	}
	public String getEmpnm() {
		return empnm;
	}
	public void setEmpnm(String empnm) {
		this.put("empnm", empnm);
		this.empnm = empnm;
	}
}
