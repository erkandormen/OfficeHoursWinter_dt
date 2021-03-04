package day03;

import java.util.Arrays;

/*
 * Create a custom return type method accepts a name as parameter
 * and prints the name as a char array
 *
 * (do not use toCharArray() method)
 *
 * Input : John
 * Output : [J, o, h, n]
 */

public class Office_1_ConvertStringToCharArray {
	
	public static void main(String[] args) {
		String input = "John";
		charArray(input);
	}

	private static void charArray(String input) {
		char[] output = new char[input.length()];
		
		for (int i = 0; i < output.length; i++) {
			output[i] = input.charAt(i);
		}
		System.out.println(Arrays.toString(output));
	}

}
