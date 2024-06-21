//1.Write a Java program to get a number from the user and print whether it is positive or negative.

package Java_Practice;

import java.util.Scanner;

public class Q1_number_positive_or_negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the number : ");
		number=sc1.nextInt();
		
		if (number == 0)
			
		{
			System.out.println("Number is Zero");	
		
		}
		
		else
		{
			if(number > 0)
			{
				System.out.println("Number is Positive");
			}
			
			else
			{
				System.out.println("Number is Negative");
			}
			
		}
	
	}

}
