import java.util.*;
public class JavaBasics 
{

	public static void main(String args[])
	{
		JavaBasics t = new JavaBasics();
		t.Display();
		int res = t.Add(10, 20);
		System.out.println(res);
	}
	
	void Display()	// Return type void(Not Returning anything) & No Parameter
	{
		System.out.println("void Fnuction");
	}
	
	int Add(int x,int y)  // Return type int & No. of Parameters=2
	{
		int z=x+y;
		System.out.println("int Fnuction with 2 parameters");
		return z;
	
	}
	
}
