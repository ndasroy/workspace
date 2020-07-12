
public class AbstractClass 
{
	public static void main(String args[])
	{
		Car2 c=new Car2();
		//vec2 v=new vec2(); ---> can't create object of this... as vec2 is AbstractClass
		c.Display();
		c.print();			// AbstractClass normal methods should be called using object of child class
		
	}
	
}	
	abstract class vec2
	{
		abstract void Display();		//Abstract method	
		
		void print()					// AbstractClass can contain Normal method
		{
			System.out.println("Normal Method in AbstractClass");
		}
	}
		
	class Car2 extends vec2		// When we inherit abstract class... we need to override abstract method
	
	{
		void Display()		// Override 
		{
			System.out.println("Override ..");
		}
		
	}