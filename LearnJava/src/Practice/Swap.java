package Practice;
import java.util.Scanner;

public class Swap {
	
	public static void main(String args[])
	{
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number");
		num1=sc.nextInt();
		System.out.println("Enter 2nd Number");
		num2=sc.nextInt();
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("The new 1st Number is : "+num1);
		System.out.println("The new 2nd Number is : "+num2);
		
		
	}

}
