package day06;

public class Office_2_PalindromicNumbers {

	public static void main(String[] args) {
		/*
         * A palindromic number reads the same both ways.
         * The largest palindrome made from the product of two 2-digit numbers is
         *   9009 = 91 × 99.
         * Find the largest palindrome made from the product of two 3-digit numbers.
         * like 654*671 = 438834
         */

		int count=1;
		int maxNumber=1;
		int maxNumber1=1;
		int maxNumber2=1;
		
		for(int i=999;i>100;i--) {
			for(int j=999;j>100;j--) {
				if(checkPalindrome(i*j)) {
					count++;
					if(maxNumber<i*j) {
						maxNumber=i*j;
						maxNumber1=i;
						maxNumber2=j;
					}
				}
			}
		}
		System.out.println("Max palindrome number= "+maxNumber1+"*"+maxNumber2+"="+maxNumber);
		System.out.println("Steps: "+count);
	}

	private static boolean checkPalindrome(int x) {
		boolean result=false;
		int temp =x;
		
		int digit1=temp%10;
		temp/=10;
		int digit2=temp%10;
		temp/=10;
		int digit3=temp%10;
		temp/=10;
		int digit4=temp%10;
		temp/=10;
		int digit5=temp%10;
		temp/=10;
		int digit6=temp%10;
		temp/=10;
		
		if(digit1==digit6 && digit2==digit5 && digit3==digit4) {
			result=true;
		}
		return result;
	}

}
