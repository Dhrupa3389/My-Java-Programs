//2.Write a Java program that takes three numbers from the user and prints the greatest number.

package Java_Practice;

import java.util.Scanner;

public class Q2_Greatest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2,num3;
		
		
		System.out.println("enter any 3 numbers ");
	
		Scanner sc1 = new Scanner(System.in);
		num1=sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		num2=sc2.nextInt();
					
		Scanner sc3 = new Scanner(System.in);
		num3=sc3.nextInt();
	
		
		
		if (num1 > num2 && num1 > num3)
		{
			System.out.println( num1 + " is Greatest Number");
		}
		
		else
		{
			if(num2 > num1 && num2 > num3)
			{
				System.out.println( num2 + " is Greatest Number");
			}
			else
				System.out.println( num3 + " is Greatest Number");
		
		}
	}

}
