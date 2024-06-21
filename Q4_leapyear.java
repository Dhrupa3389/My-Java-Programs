//4.Write a Java program that takes a year from the user and prints whether it is a leap year or not.

package Java_Practice;

import java.util.Scanner;

public class Q4_leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year : ");
		year=sc.nextInt();
		
		
		if (year%4 == 0 && year%100==0)
		{
			System.out.println(" This year is leap year.");
		}
		
		else
		{
			System.out.println(" This is not leap year.");
		}
	}

}
