
public class EncapPractise 
{

	public static void main(String args[])
	{
		Student2 b= new Student2();
		System.out.println("Get Marks"+b.getMarks());
		b.addMarks(50, "XYZ");
		System.out.println("New Marks = "+b.getMarks());
	}
}
	class Student2  
	{
		private String Name="Nab";
		private int Marks=80;
		
		public int getMarks()
		{
			return Marks;
		}
		
		public void addMarks(int m,String name)
		{
			if(name=="XYZ")
			{
				Marks=Marks+m;
			}
			else
			{
				System.out.println("Invalid Option");
			}
		}
		
		public void showGrade()
		{
			if(Marks>=90)
			{
				System.out.println("Passed with Distinction");
			}
			else
			{
				System.out.println("Few marks short of Distinction");
			}
		}
	}
	

