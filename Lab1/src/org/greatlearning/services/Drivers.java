package org.greatlearning.services;

import java.util.Scanner;

import org.greatlearning.model.Emp;

public class Drivers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Emp e=new Emp("Rahul", "dey");
		Credentials credentials=new Credentials();
		int ch;
		do {
			System.out.println("Please enter the department number from the following");
			System.out.println("1. Technical");
			System.out.println("2. Human Resource");
			System.out.println("3. Admin");
			System.out.println("4. Legal");
			ch=sc.nextInt();
			switch (ch) {
			case 1:
				String email=credentials.generateEmailAddress(e.getFirstName(), e.getLastName(), "tech");
				char[] password=credentials.generatePassword();
				credentials.showCredentials(e, email, password);
				break;
			case 2:
				String email1=credentials.generateEmailAddress(e.getFirstName(), e.getLastName(), "tech");
				char[] password1=credentials.generatePassword();
				credentials.showCredentials(e, email1, password1);
				break;
			case 3:
				String email2=credentials.generateEmailAddress(e.getFirstName(), e.getLastName(), "tech");
				char[] password2=credentials.generatePassword();
				credentials.showCredentials(e, email2, password2);
				break;
			case 4:
				String email3=credentials.generateEmailAddress(e.getFirstName(), e.getLastName(), "tech");
				char[] password3=credentials.generatePassword();
				credentials.showCredentials(e, email3, password3);
				break;
			default:
				System.out.println("Incorrect input");
				break;
			}
		} while (ch<=4);
	}

}
