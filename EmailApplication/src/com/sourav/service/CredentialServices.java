package com.sourav.service;
import java.util.Random;

import com.sourav.model.Employee;

public class CredentialServices {
	public char[] generatedPassword() 
	{
	
		String capitalLetters = "QWERTYUIOPASDFGHJKLZXCVBNM";
		String smallLetters = "qwertyuioplkjhgfdsazxcvbnm";
		String numbers = "134678920";
				String specialCharacters = "@#$%^&*(),./;'[]";
		
		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		
		Random random= new Random();
		char[] password = new char[16];
		for (int i= 0;i<10; i++) 
		{
			password[i] = values.charAt(random.nextInt(values.length()));
		
		}
	return password;
	}
	public String generateEmailAddress(String firstName,String lastName, String department)
	{
		return firstName+lastName+"@"+department+".reliance.com";
	}
public void showCredentials(Employee employee, String email, char[] generatedPassword) {
	System.out.println("Dear "+employee.getFirstName()+" Your generated data is here ");
	System.out.println("Email   "+email);
	System.out.print("Password   "+"");
	System.out.print(generatedPassword);
}
}




