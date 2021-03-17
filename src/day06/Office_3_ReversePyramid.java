package day06;

import java.util.Scanner;

public class Office_3_ReversePyramid {
/*
 * Create the following pattern

Enter the number of rows: 
5
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int rows = scan.nextInt();
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<i;j++) {
				System.out.print(" ");
			}
			for(int k=0; k<rows-i ;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		scan.close();
	}
}
