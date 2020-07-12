package Old_Programmes;

import java.util.Scanner;	
class First
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter First number :");
	int first = sc.nextInt();
	
	System.out.println("Enter Second Number : ");
	int second = sc.nextInt();
	
	int sum = first + second;
	
	System.out.println("Sum = " + sum);
}
}