//10.Write a program in Java to input 7 numbers from the keyboard and find their sum and average.

package Java_Practice;

import java.util.Scanner;

public class Q10_Input_7_numbers_sum_average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2,n3,n4,n5,n6,n7,sum,avg;
		
		System.out.println("Input Any 7 numbers from Keyboard ");
		
		Scanner sc = new Scanner(System.in);		
		n1=sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);		
		n2=sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);		
		n3=sc2.nextInt();
		
		Scanner sc3 = new Scanner(System.in);		
		n4=sc3.nextInt();
		
		Scanner sc4 = new Scanner(System.in);		
		n5=sc4.nextInt();
		
		Scanner sc5 = new Scanner(System.in);		
		n6=sc5.nextInt();
		
		Scanner sc6 = new Scanner(System.in);		
		n7=sc6.nextInt();
		
		sum = n1+n2+n3+n4+n5+n6+n7;
		System.out.println("The sum of these numbers are : " + sum);
		
		avg = sum/7;
		System.out.println("The average of these numbers are : " + avg);
		
	}

}
