package day04;

public class Office_4_CheckingElementInArray {

	public static void main(String[] args) {
		/*
         * Create a method to test if an array contains a specific value returns 
         * true or
         * false 
         * Then print the result in main method
         *
         * input[]= {1,2,3,4,5,6,7} num:6 
         * Output : “Array contains 6”
         */
		int input[] = {1,2,3,4,5,6,7,8,9};
		int num = 19;

		if(checkElement(input,num)) {
			System.out.println("Array contains "+num);
		}else {
			System.out.println("Array does not contain "+num);
		}
	}

	public static boolean checkElement(int [] input, int num) {
		
		boolean result= false;
		
		for(int i=0; i<input.length;i++) {
			if(input[i]==num) {
				result = true;
			}
		}
			
		return result;
	}
}
