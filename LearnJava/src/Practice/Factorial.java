package Practice;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num=sc.nextInt();
		int fact=num;
		
		for (int i=1;i<num;i++)
		{
			fact=fact*i;
		System.out.println(fact);
		}
		System.out.println("The factorial of the number is :"+fact);
	}

}
