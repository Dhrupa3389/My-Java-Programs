//8. Write a Java program to print Floyd's Triangle.

package Java_Practice;

import java.util.Scanner;

public class Q8_Floyd_tringle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k=1,n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Number of rows : ");
		n=sc.nextInt();
		
				
		for (int i=1 ; i<=n; i++)
		{
		
			for(int j=1 ; j <= i ; j++)
			{
				System.out.print(k + " ");
				k++;
			
			}
			
			System.out.println();
		}
		
			
	}

}
