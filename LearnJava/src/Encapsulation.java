
public class Encapsulation 
{

	public static void main(String args[])
	{
		Bank b= new Bank();
		System.out.println("Account balance = "+b.getBal());
		b.addBal(500000, "XYZ");
		System.out.println("New Account balance = "+b.getBal());
	}
}
	

class Bank  
	{
		private String Account_No="B001";	// Hidding attributes using private  
		private int Bal=5000;
		
		public int getBal()					//exposing those attributes using public methods
		{
			return Bal;  
		}
		
		public void  addBal(int b,String Password)
		{
			if(Password=="XYZ")
			{
				Bal=Bal+b;
			}
			else
			{
				System.out.println("Invalid Password...");
			}
		}
		
		public void withdrawBal(int b)
		{
			Bal=Bal-b;  
		}
	}
	

