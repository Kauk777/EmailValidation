package com.bridgelabz.emailpattern;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailPattern {
	//Checking first Mandatory part before @
	private static final Pattern EMAIL_PATTERN=Pattern.compile("^[\\u0E00-\\u0E7F0-9a-zA-Z_+]+(\\.?[\\u0E00-\\u0E7F0-9a-zA-Z_+-]*)[^\\.]@[\\u0E00-\\u0E7F0-9a-zA-Z-]+(\\.[\\u0E00-\\u0E7F0-9a-zA-Z]{2,})(\\.?[\\u0E00-\\u0E7Fa-zA-Z]{2,})?$");
	
	public boolean emailValidate(String email ) {
		return EMAIL_PATTERN.matcher(email).matches();
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmailPattern emailCheck=new EmailPattern();
		System.out.println("*****SAMPLE EMAILS TO TEST*****");
		System.out.println("**VALID EMAILS**");
		System.out.println("Email Validation abc@yahoo.com: "+emailCheck.emailValidate("abc@yahoo.com"));
		System.out.println("Email Validation abc-100@yahoo.com: "+emailCheck.emailValidate("abc-100@yahoo.com"));
		System.out.println("Email Validation abc.100@yahoo.com: "+emailCheck.emailValidate("abc.100@yahoo.com"));
		System.out.println("Email Validation abc111@yabc.com: "+emailCheck.emailValidate("abc111@abc.com"));
		System.out.println("Email Validation abc-100@abc.net: "+emailCheck.emailValidate("abc-100@abc.net"));
		System.out.println("Email Validation abc.100@abc.com.au: "+emailCheck.emailValidate("abc.100@abc.com.au"));
		System.out.println("Email Validation abc@1.com: "+emailCheck.emailValidate("abc@1.com"));
		System.out.println("Email Validation abc@gmail.com.com: "+emailCheck.emailValidate("abc@gmail.com.com"));
		System.out.println("Email Validation abc+100@gmail.com: "+emailCheck.emailValidate("abc+100@gmail.com"));
		System.out.println("**INVALID EMAILS**");
		System.out.println("Email Validation abc: "+emailCheck.emailValidate("abc"));
		System.out.println("Email Validation abc@.com.my: "+emailCheck.emailValidate("abc@.com.my"));
		System.out.println("Email Validation abc123@gmail.a: "+emailCheck.emailValidate("abc123@gmail.a"));
		System.out.println("Email Validation abc123@.com: "+emailCheck.emailValidate("abc123@.com"));
		System.out.println("Email Validation abc123@.com.com: "+emailCheck.emailValidate("abc123@.com.com"));
		System.out.println("Email Validation .abc@abc.com: "+emailCheck.emailValidate(".abc@abc.com"));
		System.out.println("Email Validation abc()*@gmail.com: "+emailCheck.emailValidate("abc()*@gmail.com"));
		System.out.println("Email Validation abc@%*.com: "+emailCheck.emailValidate("abc@%*.com"));
		System.out.println("Email Validation abc..2002@gmail.com: "+emailCheck.emailValidate("abc..2002@gmail.com"));
		System.out.println("Email Validation abc.@gmail.com: "+emailCheck.emailValidate("abc.@gmail.com"));
		System.out.println("Email Validation abc@abc@gmail.com: "+emailCheck.emailValidate("abc@abc@gmail.com"));
		System.out.println("Email Validation abc@gmail.com.1a: "+emailCheck.emailValidate("abc@gmail.com.1a"));
		System.out.println("Email Validation abc@gmail.com.aa.au: "+emailCheck.emailValidate("abc@gmail.com.aa.au"));

		System.out.println("================= For Thai Domain Name =================");
		System.out.println("email-test@universal-acceptance-test.international: "+emailCheck.emailValidate("email-test@universal-acceptance-test.international"));
		System.out.println("email-test@universal-acceptance-test.icu: "+emailCheck.emailValidate("email-test@universal-acceptance-test.icu"));
		System.out.println("อีเมลทดสอบ@ยูเอทดสอบ.ไทย: "+emailCheck.emailValidate("อีเมลทดสอบ@ยูเอทดสอบ.ไทย"));
		System.out.println("อีเมลทดสอบ@ทีเอชนิค.องค์กร.ไทย: "+emailCheck.emailValidate("อีเมลทดสอบ@ทีเอชนิค.องค์กร.ไทย"));
		System.out.println("=======================================================");

		System.out.println("Enter the email id to check: ");
		String email=sc.next();
		System.out.println("Email Validation: "+emailCheck.emailValidate(email));
		
		
		
		
	}

}
