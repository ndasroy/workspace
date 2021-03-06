
public class Type_Casting 
{

	public static void main(String args[])
	{
		vec1 v=new vec1(); 
		Car1 c=new Car1();
		Bus1 b=new Bus1();
		v.Display();
		v=b;		// Type Casting upward
		b=(Bus1)v;	// Type Casting downward
		
		// Dynamic Polymorphism
		v.Display();
		v=c;
		v.Display();
		v=b;
		v.Display();
		
	}
	
}	
	class vec1
	{
		int wheel=4;
		void Display()
		{
			System.out.println("I am Vehicle..");
		}
		
		
	}
	
	class Car1 extends vec1
	{
		void Display()// Overrides the base class
		{
			//  super.Display();// super keyword will call method of base/parent class
			System.out.println("I am Car...");
		}
	
		
	}
		class Bus1 extends vec1
		{
			void Display()// Overrides the base class
			{
				System.out.println("I am Bus...");
			}
			
		}
	
