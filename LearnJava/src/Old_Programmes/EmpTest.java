package Old_Programmes;

import java.util.Scanner;
class EmpTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number of Employee's  : ");
		
		Emp[] e=new Emp[sc.nextInt()];
		
		//Emp[] e=new Emp[2];
		
		for(int i = 0; i< e.length; i++)
		{
			System.out.println("Enter the Employee Id :");
			int empId=sc.nextInt();
			//e[i].empId= 
			//Integer.parseInt("10");
			
			System.out.println("Enter the Employee Name :");
			//e[i].empName= "Abhi";
			
			String empName=sc.next();
			
			System.out.println("Enter the Department Id :");
			e[i].deptId= sc.nextInt();
			//Integer.parseInt("100"); //sc.nextInt();
			
			System.out.println("Enter the Salary :");
			e[i].salary= sc.nextDouble();
			//Double.parseDouble("100000"); //sc.nextDouble();
			
		}		
		
		for(int i = 0 ; i < e.length; i++)
		{
			e[0].Display();
		}

		
	}
}