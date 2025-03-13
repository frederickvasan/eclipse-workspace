package org.employee;

public class Employee {
	
	   // Method to print Employee ID
    public void empId() {
        System.out.println("Employee ID: 12345");
    }

    // Method to print Employee Name
    public void empName() {
        System.out.println("Employee Name: John Doe");
    }

    // Method to print Employee Date of Birth
    public void empDob() {
        System.out.println("Employee DOB: 01-Jan-1990");
    }

    // Method to print Employee Phone Number
    public void empPhone() {
        System.out.println("Employee Phone: +1-123-456-7890");
    }

    // Method to print Employee Email
    public void empEmail() {
        System.out.println("Employee Email: johndoe@example.com");
    }

    // Method to print Employee Address
    public void empAddress() {
        System.out.println("Employee Address: 123 Main St, City, Country");
    }

    public static void main(String[] args) {
        // Creating an object of Employee class
        Employee emp = new Employee();

        // Calling all the methods
        emp.empId();
        emp.empName();
        emp.empDob();
        emp.empPhone();
        emp.empEmail();
        emp.empAddress();
    }
}


