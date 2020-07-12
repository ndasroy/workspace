public class Remainder
{
	public static void main(String a[])

	{
		int num=23456,Total=0,Rem=0;
		
		for (int i=0;num>0;i++)
		{

		Rem=num%10;
		num=num/10;
		Total=Total+Rem;
		System.out.println("Total="+Total);
		
		}		
		
	
	}



}