package Old_Programmes;

import org.omg.CORBA.FREE_MEM;

class Scope
{
	public static void main(String args[])
	{
		int x=10;
		int y = 100;
		
		System.out.println("X : " + x);
		System.out.println("Y : " + y);
		
		if(x==10)
		{
			y = 30;
			x = 20;
			System.out.println("Inside the Scope x : "+ x);
			System.out.println("Inside the Scope y : "+ y);
			
		}
		System.out.println("Outside the Scope x : "+ x);
		System.out.println("Inside the Scope y : "+ y);
		
	}
}