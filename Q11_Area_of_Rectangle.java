// Write a program to find Area of rectangle using inheritance.

package Java_Practice;

import java.util.Scanner;

class Rectangle
{
	
		int w , h ;
		int area;
		


}

class Area_rectangle extends Rectangle 
{
	void Area()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the width of Rectangle :");
		w = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the hight of Rectangle :");
		h= sc1.nextInt();
		
		area= w*h;
		System.out.println("The area of Rectangle is " + area);
	}
	
}

public class Q11_Area_of_Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Area_rectangle a1=new Area_rectangle();
		a1.Area();
		
	}

}
