//WAP to print 972 to 897 using for loop
// WAP to accept 5 numbers from user and display all of that

package Java_Practice;

import java.util.Scanner;

class prg1
{
	void reverseloop()
	{
		for(int i=972 ; i>=897 ; i--)
		{
			System.out.print(i );
			System.out.println();
		}
	}
}

 class prg2 extends prg1
 {
	 void asknum()
	 {
		 int arr[]= new int [5]; 
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Numbers : ");
			
			for (int i=0 ; i<5 ; i++)
			{
				arr [i] = sc .nextInt();  
				
			}
			System.out.println("Displaying the Numbers :");
			
			for (int i=0 ; i<5 ; i++)
			{
				System.out.println(arr[i]);
				
			}
	 }
 }

public class Q13_2programm_inone_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		prg2 a2 = new prg2();
		a2.reverseloop();
		a2.asknum();
	}

}
