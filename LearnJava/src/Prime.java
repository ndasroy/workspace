public class Prime
{
	public static void main(String A[])
		{
			int num=15;
			int flag=0;
						
				for (int i=2;i<num;i++)
				{
					if(num%i==0)
					{
						flag=1;
					}	
					
				}		
			
				if(flag==0)

					{
						System.out.print("the num is prime");
						
					}
					else
					{
						System.out.print("the num is not prime");
					}		

		}


}