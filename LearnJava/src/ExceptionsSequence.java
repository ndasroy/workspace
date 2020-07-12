
public class ExceptionsSequence 
{
	public static void main(String args[])
	{
		try
		{
			int x=10;
			int y=0;
			int res=x/y;
			System.out.println(res);
		}
		catch(ArithmeticException e)		// Can have N number of Catch Blocks and exceptions,but sequence must be specific to generic.
		{
			System.out.println("I'm ArithmeticException");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("I'm ArrayIndexOutOfBoundsException");
		}

		catch(Exception e)
		{
			System.out.println("I'm Generic Exception");
		}
	}

}
