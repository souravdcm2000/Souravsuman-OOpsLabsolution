package com.sourav.service;

import java.util.Scanner;

import com.sourav.model.Employee;





public class DriverClass {

	public static void main(String[] args) {
		Employee employee = new Employee ("Sourav","Suman");
CredentialServices cs = new CredentialServices();
String generatedEmail;
char[] generatedPassword;

System.out.println("Enter the department from the following :-");
System.out.println("1. Technical");
System.out.println("2. Admin");
System.out.println("3. HR");
System.out.println("4. Legal");

Scanner scanner = new Scanner(System.in);
int choice = scanner.nextInt();

switch (choice) {
    case 1:
    	generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"tech");
    	generatedPassword = cs.generatedPassword();
    	cs.showCredentials(employee,generatedEmail,generatedPassword);
    
        break;
    case 2:
    	generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"tech");
    	generatedPassword = cs.generatedPassword();
    	cs.showCredentials(employee,generatedEmail,generatedPassword);

        break;
    case 3:
    	generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"tech");
    	generatedPassword = cs.generatedPassword();
    	cs.showCredentials(employee,generatedEmail,generatedPassword);

        break;
    case 4:
    	generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"tech");
    	generatedPassword = cs.generatedPassword();
    	cs.showCredentials(employee,generatedEmail,generatedPassword);
        break;
    default:
        System.out.println("Please enter right option");
}
	}

}
