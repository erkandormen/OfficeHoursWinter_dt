package day05;

import java.util.Scanner;

public class Office_2_BMI {

	public static void main(String[] args) {
		/*
		 Ask user to their weight and height and type a program 
		 which calculates body mass index
		 
		 HINT : Body Mass Index = Weight (kg) / Square of height (m)
		 Then give a message to user as following:
		 If BMI is less than 18.5 , you are weak
		 If BMI is between 18.5 and 25 , your weight is ideal
		 If BMI is between 25 and 30, you are fat
		 If BMI is more than or equal to 30, obese 
		 
		 EXAMPLE : 
		 
		 INPUT: Weight : 71
		 		Height : 1.72
		 		
		 OUTPUT : Your BMI is  : 23.99945916711736
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your weight as kilograms");
		double weight = scan.nextDouble();
		System.out.println("Enter your height as meters");
		double height = scan.nextDouble();
		
		double bmi = weight/(height*height);
		System.out.println("Your body mass index is "+bmi);

		if(bmi<18.5) {
			System.out.println("You are weak");
		}else if(bmi>=18.5 && bmi<25) {
			System.out.println("Your weight is ideal :)");
		}else if(bmi>=25 && bmi<30) {
			System.out.println("You are fat, you should eat less and do exercise");
		}else {
			System.out.println("Obese :(");
		}
		
			
	}

}
