package Old_Programmes;

class Emp
{
	String empName;
	public int empId,deptId;
	double salary;
	
	Emp(int empId,String empName,int deptId,double salary)
	{
		this.empId=empId;
		this.empName=empName;
		this.deptId=deptId;
		this.salary=salary;
	}
	
	/*addEmp()
	{
		this.
		
	}*/
	
	void Display()
	{
		System.out.println("Employee Id :" + empId + "\nEmployee Name :" + empName + "\nDepartment Number :" + deptId + "\nSalary : " + salary);
	}
}