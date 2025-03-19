package org.employee;

import java.util.Scanner;

public class scannertest {
	
	 public static void main(String[] args) {
	        // Creating a Scanner object to get employee details
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter Employee ID: ");
	        int empId = scanner.nextInt();
	        scanner.nextLine(); // Consume newline
	        
	        System.out.print("Enter Employee Name: ");
	        String empName = scanner.nextLine();
	        
	        System.out.print("Enter Employee Email: ");
	        String empEmail = scanner.nextLine();
	        
	        System.out.print("Enter Employee Phone Number: ");
	        String empPhoneno = scanner.nextLine();
	        
	        System.out.print("Enter Employee Salary: ");
	        double empSalary = scanner.nextDouble();
	        scanner.nextLine(); // Consume newline
	        
	        System.out.print("Enter Employee Gender: ");
	        String empGender = scanner.nextLine();
	        
	        System.out.print("Enter Employee City: ");
	        String empCity = scanner.nextLine();
	        
	        scanner.close();
	        
	        // Displaying employee details
	        System.out.println("\nEmployee Details:");
	        System.out.println("ID: " + empId);
	        System.out.println("Name: " + empName);
	        System.out.println("Email: " + empEmail);
	        System.out.println("Phone: " + empPhoneno);
	        System.out.println("Salary: " + empSalary);
	        System.out.println("Gender: " + empGender);
	        System.out.println("City: " + empCity);

}
}
