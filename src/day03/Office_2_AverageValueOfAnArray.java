package day03;

public class Office_2_AverageValueOfAnArray {

	public static void main(String[] args) {
		/*
         * Write a java program that calculates the average value of array elements
         *
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */
		int input[] = {1,2,3,4,5,6,7};

		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			sum=sum+input[i];
		}
		double average=sum/input.length;
		
		System.out.println("Average of the elements "+average);
	}

}
