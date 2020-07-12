import java.util.Scanner;

public class Array
{
	public static void main(String A[])
		{
			int x=0;
			Scanner s0= new Scanner(System.in);
			
			System.out.println("Please enter the length of Array");
			x=s0.nextInt();
			
			int mark[]= new int[x];
			
			Scanner s= new Scanner(System.in);

		for (int i=0;i<x;i++)
			{
				System.out.println("Please enter the value of Element"+i);
				mark[i]=s.nextInt();
			}

		for (int i=0;i<x;i++)
			{
				System.out.println(mark[i]);
	
			}			

		}

}