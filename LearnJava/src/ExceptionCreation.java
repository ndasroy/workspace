
public class ExceptionCreation 
{

	public static void main(String args[])
	{
		Bank6 b=new Bank6();
		b.getAmmount(20000);
		
		/*try
		{
			Bank6 b=new Bank6();
			b.getAmmount(2000);
		}
		catch (NotSufficiantBal e)
		{
			System.out.println(e.getMessage1());
		}
		*/
	}
}
class Bank6
{
	int Bal=20000;
	
	void getAmmount(int Ammount) //throws NotSufficiantBal
	{
		try
		{
			if (Bal<=Ammount)
			{
				NotSufficiantBal exc=new NotSufficiantBal();
				throw exc;
			}
		}
		catch(NotSufficiantBal e)
		{
			System.out.println(e.getMessage());
		}
	}
	
}

class NotSufficiantBal extends Exception
{
	public String getMessage()
	{
		return "You aren't allowed to withdraw this amount";
		
	}
}
