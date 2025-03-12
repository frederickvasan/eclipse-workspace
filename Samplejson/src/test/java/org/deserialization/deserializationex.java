package org.deserialization;


import java.io.FileReader;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;


public class deserializationex {

	  public static void main(String[] args) throws Exception {
		
		  FileReader fr = new FileReader("C:\\Users\\fnobl\\eclipse-workspace\\Samplejson"
		  		+ "\\src\\test\\resources\\jsonfile\\jsonsample.json");
		  
		  ObjectMapper ma = new ObjectMapper();
		
		  Empdetails employee = ma.readValue(fr, Empdetails.class);
		  
		  String empName = employee.getempName();
		  System.out.println("Employee Name :" +empName);
		  System.out.println("Employee ID : "+employee.getEmpId());
	//	  System.out.println(employee.getEmpAdd());
		  System.out.println("Employee Middlename :" +employee.getMiddleName());
		  System.out.println(employee.getEmpSkills());
		  System.out.println(employee.isMaritalStatus());
		  
	     empAdd empaddress = employee.getEmpAdd();
	     System.out.println(empaddress.getStreetName());
	     System.out.println(empaddress.getDistrictWard());
	     System.out.println(empaddress.getcity());
	     
		   
//		  ArrayList<String> empskills = employee.getEmpSkills();
//		  for (int i = 0; i < empskills.size(); i++) {
//			  System.out.println(empskills);
//			
//		}
		  
	}
}
