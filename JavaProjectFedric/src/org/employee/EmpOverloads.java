package org.employee;

public class EmpOverloads {

	  // Method with no parameters
    public void empId() {
        System.out.println("Employee ID: Default");
    }
    
    // Method with int parameter
    public void empId(int id) {
        System.out.println("Employee ID: " + id);
    }
    
    // Method with String parameter
    public void empId(String id) {
        System.out.println("Employee ID: " + id);
    }
    
    // Method with int and String parameters
    public void empId(int id, String name) {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
    
    // Method with String and int parameters
    public void empId(String name, int id) {
        System.out.println("Employee Name: " + name + ", ID: " + id);
    }
    
    public static void main(String[] args) {
        // Creating an object of Employee class
    	EmpOverloads emp = new EmpOverloads();
        
        // Calling overloaded methods
        emp.empId();
        emp.empId(101);
        emp.empId("E102");
        emp.empId(103, "John Doe");
        emp.empId("Jane Doe", 104);
    }
}
