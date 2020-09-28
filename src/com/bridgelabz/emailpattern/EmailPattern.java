package com.bridgelabz.emailpattern;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailPattern {
	//Checking first Mandatory part before @
	private static final Pattern EMAIL_PATTERN=Pattern.compile("^[0-9a-zA-Z_+-]+(\\.?[0-9a-zA-Z_+-]*)[^\\.]@[0-9a-zA-Z]+(\\.[0-9a-zA-Z]{2,})$");
	
	public boolean emailValidate(String email ) {
		return EMAIL_PATTERN.matcher(email).matches();
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmailPattern emailCheck=new EmailPattern();
		System.out.println("Enter the email id with optional element: ");
		String email=sc.next();
		System.out.println("Email Validation: "+emailCheck.emailValidate(email));
	}

}
