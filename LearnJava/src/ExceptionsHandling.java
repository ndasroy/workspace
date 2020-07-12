
public class ExceptionsHandling 
{

	public static void main(String args[])
	{
		try
		{
			int x=36;
			int y=12;
			int z=x/y;
			System.out.println(z);
			
		}
		catch(Exception e)
		{
			System.out.println("Please don't enter y = 0 ...");
		}
		finally
		{
			System.out.println("finally block");
		}
		System.out.println("Hello...");
	}
	
}

