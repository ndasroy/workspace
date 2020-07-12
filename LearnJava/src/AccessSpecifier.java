
public class AccessSpecifier 
{

	public static void main(String args[])
	{
		
	}
	
	class Student  // Can't be Private
	{
		private String S_Id;
		String Name;
		
		public void Display()
		{
			int x=10;  //Variables are by default private,access specifier can't be used with variables.
		}
	}
	
	
}
