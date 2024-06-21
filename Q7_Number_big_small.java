//7.Write a Java program that reads a intger number. If the number is zero it prints "zero", otherwise, print "positive" or "negative". 
//Add "small" if the absolute value of the number is less than 10, or "large" if it exceeds 1000.

package Java_Practice;

import java.util.Scanner;

public class Q7_Number_big_small {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		number=sc.nextInt();
		
		if (number == 0)
		{
			System.out.println("Number is zero");
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
		
		if (number <10)
		{
			System.out.println("small");
		}
		
		if (number > 1000)
		{
			System.out.println("Large");
		}
	}

}
