
public class FinallyBlock 
{

	public static void main(String args[])
	{
		Bank5 b=new Bank5();
		int res= b.Divide(10,2);
		System.out.println(res);
	}
}	
	class Bank5
	{
		int Divide(int x,int y)
		{
			int z=0;
		try
			{
				z=x/y;
				System.out.println("Welcome...");
			}
		catch(Exception e)
			{
				System.out.println("Please don't enter y = 0 ...");
			}
		
		finally
			{
				System.out.println("finally block gets executed always");
			}
		System.out.println("Hello...");
		return z;
		}
	}
	

