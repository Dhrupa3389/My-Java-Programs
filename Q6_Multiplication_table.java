//6.Write a Java program to display the multiplication table of a given integer.

package Java_Practice;


import java.util.Scanner;

public class Q6_Multiplication_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number,mul;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		number=sc.nextInt();
		
		for (int i=1 ; i<=10 ; i++)
		{
		System.out.println(number + " * " + i + "  =  " + number*i);
		}
		
	}

}
