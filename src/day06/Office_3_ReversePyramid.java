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
			//Print spaces
			for(int j=0; j<i;j++) {
				System.out.print(" ");
			}
			//Print Stars and spaces
			for(int k=0; k<rows-i ;k++) {
				System.out.print("* ");
			}
			//To take the cursor to the next line
			System.out.println();
		}
		scan.close();
	}
}
