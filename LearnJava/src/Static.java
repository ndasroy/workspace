import java.util.Scanner;
public class Static 
{
	public static void main(String args[])
	{
		/*Student s = new Student();  // Default Constructor (without defining Cons in class)
		s.Display();
		*/
		
		Student1 s = new Student1("5001","Ajay",10);
		System.out.println(s.S_Id);
		System.out.println(s.Name);
		System.out.println(s.Age);
		System.out.println(Student1.Country);		// Calling Static attribute
		Student1.Display();  // Calling Static Method
		
	}
	
}
class Student1
	{	
		String S_Id;
		String Name ;
		int Age;
		static String Country= "India";				//Properties of Class not object. Can be accessed without Object
		
		Student1(String id,String name,int a) 		// Constructor is called when we initialize it
		{
			S_Id= id;
			Name= name;
			Age=a;
		}
		void Hello()
		{
			Age=12;     // Non Static Attribute
			Country="USA";   //Static Attribute
		}
		static void Display()
		{
			Student1 s = new Student1("5001","Ajay",10);
			s.Age=12;
			Country="UK";
			System.out.println("It's Static Method");
		}
		
	
}
