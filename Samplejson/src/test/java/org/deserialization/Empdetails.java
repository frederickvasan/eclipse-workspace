package org.deserialization;

import java.util.ArrayList;

public class Empdetails {
	
	private String empName;
	
	private int empId;
	
	private ArrayList<String> empSkills;
	
	private String companyName;
	
	private empAdd empAdd;
	
	private Object middleName;
	
	private boolean  maritalStatus;

	public String getempName() {
		return empName;
	}

	public void setempName(String empName) {
		this.empName = empName;
	}


	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public ArrayList<String> getEmpSkills() {
		return empSkills;
	}

	public void setEmpSkills(ArrayList<String> empSkills) {
		this.empSkills = empSkills;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public empAdd getEmpAdd() {
		return empAdd;
	}

	public void setEmpAdd(empAdd empAdd) {
		this.empAdd = empAdd;
	}

	public Object getMiddleName() {
		return middleName;
	}

	public void setMiddleName(Object middleName) {
		this.middleName = middleName;
	}

	public boolean isMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(boolean maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	
	
	
	
	
	

}
