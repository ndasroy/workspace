import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Collections_Sort 
{

	public static void main(String[] args) 
	
	{
		ArrayList<Student5> arr=new ArrayList<Student5>();
		Student5 s= new Student5("5005", "Vijay", 52);
		arr.add(s);
		arr.add(new Student5("5004", "Ray", 85));
		arr.add(new Student5("5006", "Jay", 75));
		arr.add(new Student5("5001", "Sachin", 65));
		arr.add(new Student5("5003", "Ram", 95));

		Collections.sort(arr);					// sort is calling compareTo()
		
		Iterator<Student5> itr = arr.iterator();	
		while(itr.hasNext())					
		{
			Student5 s1=itr.next();
			//System.out.println(itr.next());	// Prints the memory locations & garbage
			System.out.println(s1.S_Id+"	"+s1.Name+"	"+s1.Marks);
		
		}
	}

}

class Student5 implements Comparable<Student5>
{
	String S_Id;
	String Name;
	int Marks;
	public Student5(String S_Id,String Name,int Marks)
	{
		this.S_Id=S_Id;
		this.Name=Name;
		this.Marks=Marks;
	}
	
	@Override
	public int compareTo(Student5 o) 
	{
		//return this.S_Id.compareTo(o.S_Id);
		//return this.S_Id.compareTo(o.Name);
		
		int res=0;
		if(this.Marks>o.Marks)			// normally compareTo()- sorts number in ascending order.but for marks we reversed it
		{
			res=-1;						// if First value is greater than second value,it's descending.So assign = -1,for Ascending=1
		}
		if(this.Marks<o.Marks)
		{
			res=1;
		}
		return res;
	}
}

