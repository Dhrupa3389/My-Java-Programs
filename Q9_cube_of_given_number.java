//9. Write a Java program to display the cube of the given number up to an integer.
// for example :  Input number of terms 4 = 4*4*4 = 64.

package Java_Practice;

import java.util.Scanner;

public class Q9_cube_of_given_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number,cube;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Number : ");
		number=sc.nextInt();
		
		cube= number*number*number;
		
		System.out.println("Input number of terms " + number + " = " + number + "*" +number + "*" + number + " = " + cube);
	}

}
