//3.Write a Java program to find the number of days in a month.

package Java_Practice;

import java.util.Scanner;

public class Q3_find_Numberofdays_inMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mnthnum,year,numdays;
		String month;
		
			
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter number of the month : ");
		mnthnum=sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter year : ");
		year=sc2.nextInt();
		
		switch(mnthnum)
		{
			case 1 :
				
				month="January";
				numdays= 31;
				System.out.println(month +" "+ year +" has "+ numdays + " days");
				
			break;
			
			case 2 : 
				
				month="February";
				if(year%4==0)
				{
					numdays=29;
				}
				else
				{
					numdays=28;	
				}
				System.out.println(month +" "+ year +" has "+ numdays + " days");
			break;
			
			case 3 : 
				
				month="March";
				numdays= 31;
				System.out.println(month +" "+ year +" has "+ numdays + " days");
			break;
			
			case 4 :
				
				month="April";
				numdays= 30;
				System.out.println(month +" "+ year +" has "+ numdays + " days");
			break;
			
			case 5 : 
				
				month="May";
				numdays= 31;
				System.out.println(month +" "+ year +" has "+ numdays + " days");
			break;
			
			case 6 : 
				
				month="June";
				numdays= 30;
				System.out.println(month +" "+ year +" has "+ numdays + " days");
			break;
			
			case 7 : 
				
				month="July";
				numdays= 31;
				System.out.println(month +" "+ year +" has "+ numdays + " days");
			break;
			
			case 8 :
				
				month="August";
				numdays= 31;
				System.out.println(month +" "+ year +" has "+ numdays + " days");
			break;
			
			case 9 : 
				
				month="September";
				numdays= 30;
				System.out.println(month +" "+ year +" has "+ numdays + " days");
			break;
			
			case 10 :
				
				month="Octomber";
				numdays= 31;
				System.out.println(month +" "+ year +" has "+ numdays + " days");
			break;
			
			case 11 : 
				
				month="November";
				numdays= 30;			
				System.out.println(month +" "+ year +" has "+ numdays + " days");
			break;
			
			case 12 : 
				
				month="December";
				numdays= 31;
				System.out.println(month +" "+ year +" has "+ numdays + " days");
			break;
			
			default : System.out.println("Please enter Valid Number");
		
			
		}
		
		
		
	}
	}



