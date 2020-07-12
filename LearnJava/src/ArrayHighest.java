import java.util.Scanner;

public class ArrayHighest
{
	public static void main(String A[])
	{
		int mark[]= new int[5];
		Scanner s= new Scanner(System.in);

		for (int i=0;i<5;i++)
		{
			System.out.println("Please enter the value of Element"+i);
			mark[i]=s.nextInt();

		}
		int max=0;
		for (int i=0;i<5;i++)
		{
			if(mark[i]>max)
			{
				max=mark[i];
			}
			
		}	
		System.out.println("\nThe Highest among the Element is "+max);

	}


}