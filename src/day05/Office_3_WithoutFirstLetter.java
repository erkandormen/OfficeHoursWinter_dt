package day05;

import java.util.Scanner;

public class Office_3_WithoutFirstLetter {

	public static void main(String[] args) {
		/*
		StringMethods
       	Write a Java program to read a string and if the first or last characters are 't',
        return the string without those 't' otherwise return the string unchanged.
        
        Example:
        INPUT  : The given strings is: testcricket
        OUTPUT :  The new string is: estcricke
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string");
		String s = scan.nextLine();
		
		System.out.println(without_t(s));
				
	}
	
	public static String without_t(String s) {
		String str = s.toLowerCase();
		
		if(str.charAt(0)=='t' && str.charAt(str.length()-1)=='t') {
			return str.substring(1,str.length()-1);
		}else if(str.charAt(0)=='t') {
			return str.substring(1);
			//for ending 't'
		}else if(str.charAt(str.length()-1)=='t') {
			return str.substring(0,str.length()-1);
		}
		return str;
	}

}
