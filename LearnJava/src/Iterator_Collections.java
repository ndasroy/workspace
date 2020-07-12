import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Iterator_Collections 

{
// ArrayList is easy to Search,Add/Remove is difficult , LinkedList is difficult to search,Easy to Add/Remove.
	public static void main(String[] args) 
	{
		//ArrayList arr=new ArrayList();	// to resolve the memory shortage & memory leakage,ArrayList is introduced.
		ArrayList<String> arr=new ArrayList<String>();	//to make the collection Type_Safe,we declare it's data type.
		arr.add("Vijay");
		arr.add("Sachin");
		arr.add("Ajay");
		arr.add("Raj");
		arr.add("Ajay");				// ArrayList allows duplicate values
		//arr.add(52);					// Allows integer too (It's Generic)
		//arr.add(1, "Ram");			// Adding an element
		//arr.remove(1);					// Removing an element , To modify-We need to remove & add the correct element
		Collections.sort(arr);				// Sorting would be done on ASCII values.
		
		Iterator<String> itr = arr.iterator();	// iterator doesn't start from beginning from 2nd time.
		while(itr.hasNext())					// hasNext() is checking True/False,it'll check the collection
		{
			System.out.println(itr.next());
		
		}
	}

}


