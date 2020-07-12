package Old_Programmes;

class BoolTest
{
	public static void main(String args[])
	{
		boolean b;
		
		b=true;
		System.out.println("b is "+ b);
		b=false;
		System.out.println("b is "+ b);
		
		b = !false;
		System.out.println("b is "+ b);
		
		if(b)
			System.out.println("This is executed.");
		
	}

}