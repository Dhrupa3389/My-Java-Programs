// Assume a class cricketer is declared.Declare a derived class batsman from cricketer. Data member of batsman. 
//Total run, Average run and best performance. Member functions input data, calculate average runs, Displaydata.(Single inheretance)


package Java_Practice;


class Cricketer
{
	
		int a=23 , b= 25 , c = 46;
		int total;
		float avg;
		int perf;
	
	
}

class Batsman extends Cricketer 
{
	void Total_run()
	{
		total=a+b+c;
		System.out.println("Total run is : " + total);
	}
	
	void Ave_run()
	{
		avg = total/3;
		System.out.println("Average run is : " + avg);
	}
	
	void Best_performance()
	{
		if (a>b  && a>c)
		{
			System.out.println("Best performance is : " + a);
		}
		if (b>a && b>c)
		{
			System.out.println("Best performance is : " + b);
		}
		else
		{
			System.out.println("Best performance is : " + c);
		}
			
	}
}

public class Q10_cricket_single_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Batsman d1 = new Batsman();
		d1.Total_run();
		d1.Ave_run();
		d1.Best_performance();
		
		
	}

}
