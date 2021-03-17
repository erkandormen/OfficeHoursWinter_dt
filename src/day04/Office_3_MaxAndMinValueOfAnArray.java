package day04;

public class Office_3_MaxAndMinValueOfAnArray {

	public static void main(String[] args) {
        /*
         * Write a method that accepts an integer array 
         * as an input and prints the minimum
         * and the maximum numbers from given array
         *
         *
         * Input : {3,2,5,4,1,6}
         * Output : min: 1 max : 6
         */

		int [] input = {2,45,6,7,89,1};
		maxAndMin(input);
	}
	
	public static void maxAndMin(int[] input) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<input.length; i++) {
			if(input[i]>max) {
				max=input[i];
			}
			if(input[i]<min) {
				min=input[i];
			}
		}
		System.out.println("Min value value of the array "+min+"\nMax value of the array "+max);
	}

}
