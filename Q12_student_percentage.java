//Create a class person having members name and age. Derive a class student having member percentage.
//Derive another class teacher having member salary.
//Write necessary member function to initialize , read and write data.
// Write also MAin function (Multiple inheritance)


package Java_Practice;

class Person
{
	String name = "Dhrupa" ;
	int age= 31;
	
}

class Student extends Person
{
	void Percentage()
	
	{
	float perct = 98;
	System.out.println("Name :"+ name);
	System.out.println("Age :"+ age);
	System.out.println("Percentage :"+ perct);
	}
	
}

class Teacher extends Person
{
void Salary()
	
	{
	String salary = "25k";
	System.out.println("Name :"+ name);
	System.out.println("Age :"+ age);
	System.out.println("Salary :"+ salary);
	}
}


public class Q12_student_percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student();
		s1.Percentage();
		System.out.println();
		Teacher t1=new Teacher();
		t1.Salary();
	}

}
