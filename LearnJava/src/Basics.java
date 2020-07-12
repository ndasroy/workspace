import java.util.Scanner;
public class Basics 
{
	public static void main(String args[])
	{
		/*Student s = new Student();  // Default Constructor (without defining Cons in class)
		s.Display();
		*/
		
		Student s = new Student("5001","Ajay",10);
		System.out.println(s.S_Id);
		System.out.println(s.Name);
		System.out.println(s.Age);
		
		Student s1 = new Student("5002","Vijay",12);
		System.out.println(s1.S_Id);
		System.out.println(s1.Name);
		System.out.println(s1.Age);
	}
	
}
class Student
	{	
		String S_Id;
		String Name ;
		int Age;
		
		Student(String id,String name,int a) 		// Constructor is called when we initialize it
		{
			S_Id= id;
			Name= name;
			Age=a;
		}
		
		void Display()
		{
			System.out.println("I am Student");
		}
		
	}




