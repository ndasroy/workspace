
public class Single_Tone 
{

	public static void main(String args[])
	{
		Bank1 b=Bank1.getInstance();		// Only one instance is Called
		Bank1 b1=Bank1.getInstance();		// Previous instance is Called only
	}
}

class Bank1
{
	int Bal;
	private static Bank1 b=null;				// Static Variable
	private Bank1(int B)					// Private Constructor
	{
		Bal=B;
		
	}
	
	static Bank1 getInstance()	// Static method with return type Bank1
	{
		if(b==null)
		{
			System.out.println("Instance is Created ");
			b= new Bank1(5);
			
		}
		 return b;
		
	}

	
}