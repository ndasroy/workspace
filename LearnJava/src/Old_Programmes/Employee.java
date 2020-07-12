package Old_Programmes;

class Employee
{
	private int empId,deptId;
	private String empName;
	private double basic;
	
	public Employee(int empId,String empName,int deptId,double basic)
	{
		this.empId=empId;
		this.empName=empName;
		this.deptId=deptId;
		this.basic=basic;
	}
	
	void Display()
	{	
		System.out.println("Employee Id : " +empId +"\nEmployee Name : " + empName + "\nDepartment Id : " + deptId + "\nBasic : "+ basic);
	}
}

class Manager extends Employee
{
	private double bonus;
	
	public Manager(int empId,String empName,int deptId,double basic, double bonus)
	{
        super(empId,empName,deptId,basic);
        this.bonus = bonus;
	}
	
	@Override
	
	void Display()
	{
		super.Display();
		System.out.println("Bonus : " + bonus);
	}
	
	
}


class Worker extends Employee
{
	private double commision;
	
	public Worker(int empId,String empName,int deptId,double basic, double commision)
	{
		super(empId,empName,deptId,basic);
        this.commision = commision;		
	}
	
	@Override
	
	void Display()
	{
		super.Display();
		System.out.println("Commision : " + commision);
	}
}


