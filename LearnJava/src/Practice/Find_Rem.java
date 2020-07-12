package Practice;

import java.util.Scanner;


public class Find_Rem 
{

	public static void main(String args[])
	{
		
		int num1,num2,rem;
		Scanner S=new Scanner(System.in);
		System.out.println("Enter 1st num");
		num1=S.nextInt();
		System.out.println("Enter 2st num");
		num2=S.nextInt();
		
		try
		{
				if(num2==0)
				{
					
					Excep exc=new Excep();
					throw exc;
					
				}
				rem=num1/num2;	
				System.out.println("remainder "+rem);
			
		}
		catch(Excep e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}

class Excep extends Exception
{
	public String getMessage()
	{
		return "Divisor can't be Zero";
		
	}
}
