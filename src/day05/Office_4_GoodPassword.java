package day05;

import java.util.Scanner;

public class Office_4_GoodPassword {

	public static void main(String[] args) {
		/*
		 * Write a program Ask user to create a password it should have at least 
		 * 1 Special char "!@#$%^&*()_+" 
		 * 1 Uppercase letter "A" 
		 * 1 Lower case letter "a" 
		 * 1 Digit "0123456789" 
		 * The minimum length of the password should be 8
		 * If everything is OK, print message as "Password creation successful!"
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Your password should have at least \r\n"
				+ "		 * 1 Special char \"!@#$%^&*()_+\" \r\n"
				+ "		 * 1 Uppercase letter \"A\" \r\n"
				+ "		 * 1 Lower case letter \"a\" \r\n"
				+ "		 * 1 Digit \"0123456789\" \r\n"
				+ "		 * The minimum length of the password should be 8");

		System.out.println("Enter your password");
		String password=scan.next();
		
		String specChar="!@#$%^&*()_+.,:;";
		
		int countSpecChar=0;
		int countUppercaseLetter=0;
		int countLowercase=0;
		int countDigit=0;
		
		for(int i=0;i<password.length();i++) {
			//Check special chars
			if(specChar.contains(password.substring(i, i+1))) {
				countSpecChar++;
			}
			//Check uppercase letters
			if(password.charAt(i)>='A' && password.charAt(i)<='Z') {
				countUppercaseLetter++;
			}
			//Check lowercase letters
			if(password.charAt(i)>='a' && password.charAt(i)<='z') {
				countLowercase++;
			}
			//Check the digits
			if(Character.isDigit(password.charAt(i))) {
				countDigit++;
			}
		}
		
		if(password.length()>=8) {
			if(countSpecChar>0 && countUppercaseLetter>0 && countLowercase>0 && countDigit>0) {
				System.out.println("Password creation successful!");
			}else {
				System.out.println("Please control password");
			}
		}else {
			System.out.println("Your password has to be at least 8 characters length");
		}
		
	}

}
